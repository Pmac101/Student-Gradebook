import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    public static void templateForNewFile() {
        try {
            FileWriter writeCourseNames = new FileWriter(studentTextFile);
            PrintWriter printCourseNames = new PrintWriter(writeCourseNames);
            printCourseNames.write("1) Alchemy Homework:\n2) Alchemy Quiz:\n3) Alchemy Exam:\n4) Alchemy Project:\n" +
                    "5) Elemental Magic Homework:\n6) Elemental Magic Quiz:\n7) Elemental Magic Exam:\n8) Elemental " +
                    "Magic Project:\n9) Necromancy Homework:\n10) Necromancy Quiz:\n11) Necromancy Exam:" +
                    "\n12) Necromancy Project:");
            printCourseNames.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /*
     * This method writes the course name, assignment type, and ArrayList of grades to the user's text file.
     *
     * @param subject          The name of the course
     * @param typeOfAssignment The type of assignment
     * @param arrName          The ArrayList containing grades
     */
    public static void writeToFile(String subject, String typeOfAssignment, ArrayList<Integer> arrName) {
        try {
            FileWriter writeGrades = new FileWriter(studentTextFile, true);
            PrintWriter printTextFile = new PrintWriter(writeGrades);
            printTextFile.write("|" + subject + " " + typeOfAssignment + " " + arrName + "| ");//edit this so that it simply adds list to specified line
            printTextFile.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /*
     * This method reads a text file and replaces specified string with new string.
     *
     * @param
     * @param
     * @param
     */
    public static void editTextFile(File studentTextFile, String oldString, String newString) {
        //may need: File fileTOBeModified = new File(filePath); to get this method to work.
        String oldData = "";
        BufferedReader buffReader = null;
        FileWriter writer = null;

        try {
            buffReader = new BufferedReader(new FileReader(studentTextFile));
            String line = buffReader.readLine();
            while (line != null) {
                oldData = oldData + line + System.lineSeparator();

                line = buffReader.readLine();
            }
            String newData = oldData.replaceAll(oldString, newString);
            writer = new FileWriter(studentTextFile);
            writer.write(newData);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                buffReader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}