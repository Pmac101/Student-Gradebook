import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Student Class contains various methods regarding student login and creating text files.
 */

public class Student {

    public static File studentTextFile;
    public static String firstName = "";
    public static String lastName = "";

    /*
     * This method prompt the user for their first and last name. It will then utilize the method <createTextFile>
     * to determine if a new text file needs to be created for the user.
     */
    public static void studentLogin() {
        Scanner studentInput = new Scanner(System.in);

        //rewrite output for while loop!!!!!!
        while (true) {
            System.out.println("Welcome to the Student Gradebook. \nPlease enter your first name to begin.");
            String userFirstName = studentInput.nextLine().toLowerCase();
            System.out.println("Please enter your last name.");
            String userLastName = studentInput.nextLine().toLowerCase();
            System.out.println("You have entered <" + userFirstName + " " + userLastName + ">. Is this correct? \n[y]" +
                    "Yes or [n] No.");
            char isInputCorrect;
            Scanner response1 = new Scanner(System.in);
            isInputCorrect = response1.next().toLowerCase().charAt(0);

            if (isInputCorrect == 'y') {
                firstName = userFirstName;
                lastName = userLastName;
                Student.createTextFile(lastName, firstName);
                break;
            } else if (isInputCorrect == 'n') {
                System.out.println("Returning to Welcome screen.");
            } else {
                System.out.println("Invalid input. You must enter [y] for Yes or [n] for No. Now returning to " +
                        "Welcome screen");
            }
        }
    }

    /*
     * This method creates a text file based on the name of the user logging in.
     *
     * @param lastName  The last name of the user
     * @param firstName The first name of the user
     */
    public static void createTextFile(String lastName, String firstName) {
        try {
            studentTextFile = new File("src/" + lastName + "_" + firstName + ".txt");
            if (studentTextFile.createNewFile()) {
                System.out.println("File created: " + studentTextFile.getName());
                templateForNewFile();
            }
            else {
                System.out.println("Your file has been located.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /*
     * This method creates a basic template for all new student text files
     */
    public static void templateForNewFile() {
        try {
            FileWriter writeCourseNames = new FileWriter(studentTextFile);
            PrintWriter printCourseNames = new PrintWriter(writeCourseNames);
            printCourseNames.write("0) Alchemy Homework:\n1) Alchemy Quiz:\n2) Alchemy Exam:\n3) Alchemy Project:\n" +
                    "4) Elemental Magic Homework:\n5) Elemental Magic Quiz:\n6) Elemental Magic Exam:\n7) Elemental " +
                    "Magic Project:\n8) Necromancy Homework:\n9) Necromancy Quiz:\n10) Necromancy Exam:" +
                    "\n11) Necromancy Project:");
            printCourseNames.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /*
     * This method allows a student's file to be edited
     *
     * @param editThisLine The line in the text file to be edited (count starts with 0)
     * @param arrName      ArrayList of grades being written to the text file
     */
    public static void editFile (int editThisLine, ArrayList<Integer> arrName) {
        try {
            Path filePath = Paths.get(String.valueOf(studentTextFile));
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            lines.set(editThisLine, lines.get(editThisLine) + arrName);
            Files.write(filePath, lines, StandardCharsets.UTF_8);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}