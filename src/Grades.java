import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *Grades Class contains various methods for adding different types of grades as well as methods regarding
 * course selection.
 */
public class Grades {

   public static ArrayList<Integer> alchQuizGrades = new ArrayList<>();
   public static ArrayList<Integer> alchHomeworkGrades = new ArrayList<>();
   public static ArrayList<Integer> alchExamGrades = new ArrayList<>();
   public static ArrayList<Integer> alchProjectGrades = new ArrayList<>();
   public static ArrayList<Integer> elemHomeworkGrades = new ArrayList<>();
   public static ArrayList<Integer> elemQuizGrades = new ArrayList<>();
   public static ArrayList<Integer> elemExamGrades = new ArrayList<>();
   public static ArrayList<Integer> elemProjectGrades = new ArrayList<>();
   public static ArrayList<Integer> necroHomeworkGrades = new ArrayList<>();
   public static ArrayList<Integer> necroQuizGrades = new ArrayList<>();
   public static ArrayList<Integer> necroExamGrades = new ArrayList<>();
   public static ArrayList<Integer> necroProjectGrades = new ArrayList<>();

    /*
     * This method adds quiz grades to an ArrayList related to chosen course. The grades are then saved to the
     * student's text file.
     *
     * @param course Directs user to their chosen course
     */
   public static void addQuiz(int course) {
       Scanner quizInput = new Scanner(System.in);
       Scanner isInputCorrect = new Scanner(System.in);

       if (course == 1) {
           while (true) {
               // need code to verify input is an integer as well as code to limit input scores to 0-100
               System.out.println("Please enter your Quiz grade: ");
               int alchQuizScore = quizInput.nextInt();
               System.out.println("You entered <" + alchQuizScore + "> \nIs this correct? \n[y]Yes [n]No");
               char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

               if (isInputResponse == 'y') {
                   System.out.println("Your grade has been added.");
                   alchQuizGrades.add(alchQuizScore);
               }
               else if (isInputResponse == 'n'){
                   System.out.println("Your grade has NOT been saved.");
               }
               else {
                   System.out.println("Invalid input.");
               }

               System.out.println("Would you like to enter another Quiz grade? \n[y]Yes [n]No");
               char moreQuizResponse = quizInput.next().toLowerCase().charAt(0);

               if (moreQuizResponse == 'y') {
                   continue;
               }
               else if (moreQuizResponse == 'n') {
                   String subject = "Alchemy";
                   String typeOfAssignment = "quiz";
                   Student.writeToFile(subject, typeOfAssignment, alchQuizGrades);
                   Menu.menuOrExit();
                   break;
               }
               else {
                   System.out.println("Invalid input. Returning to Main Menu.");
                   break;
               }
           }
           Menu.mainMenu();
       }
       else if (course == 2) {
           while (true) {
               // need code to verify input is an integer as well as code to limit input scores to 0-100
               System.out.println("Please enter your Quiz grade: ");
               int elemQuizScore = quizInput.nextInt();
               System.out.println("You entered <" + elemQuizScore + "> \nIs this correct? \n[y]Yes [n]No");
               char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

               if (isInputResponse == 'y') {
                   System.out.println("Your grade has been added.");
                   elemQuizGrades.add(elemQuizScore);
               }
               else if (isInputResponse == 'n'){
                   System.out.println("Your grade has NOT been saved.");
               }
               else {
                   System.out.println("Invalid input.");
               }

               System.out.println("Would you like to enter another Quiz grade? \n[y]Yes [n]No");
               char moreQuizResponse = quizInput.next().toLowerCase().charAt(0);

               if (moreQuizResponse == 'y') {
                   continue;
               } else if (moreQuizResponse == 'n') {
                   String subject = "Elemental Magic";
                   String typeOfAssignment = "Quiz";
                   Student.writeToFile(subject, typeOfAssignment, elemQuizGrades);
                   Menu.menuOrExit();
                   break;
               } else {
                   System.out.println("Invalid input. Returning to Main Menu.");
                   break;
               }
           }
           Menu.mainMenu();
       }
       else if (course == 3) {
           while (true) {
               //need code to verify input is an integer as well as code to limit input scores to 0-100
               System.out.println("Please enter your Quiz grade: ");
               int necroQuizScore = quizInput.nextInt();
               System.out.println("You entered <" + necroQuizScore + "> \nIs this correct? \n[y]Yes [n]No");
               char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

               if (isInputResponse == 'y') {
                   System.out.println("Your grade has been added.");
                   necroQuizGrades.add(necroQuizScore);
               }
               else if (isInputResponse == 'n'){
                   System.out.println("Your grade has NOT been saved.");
               }
               else {
                   System.out.println("Invalid input.");
               }

               System.out.println("Would you like to enter another Quiz grade? \n[y]Yes [n]No");
               char moreQuizResponse = quizInput.next().toLowerCase().charAt(0);

               if (moreQuizResponse == 'y') {
                   continue;
               } else if (moreQuizResponse == 'n') {
                   String subject = "Necromancy";
                   String typeOfAssignment = "Quiz";
                   Student.writeToFile(subject, typeOfAssignment, necroQuizGrades);
                   Menu.menuOrExit();
                   break;
               } else {
                   System.out.println("Invalid input. Returning to Main Menu.");
                   break;
               }
           }
           Menu.mainMenu();
       }

   }

    /*
     * This method adds homework grades to an ArrayList related to chosen course. The grades are then saved to the
     * student's text file.
     *
     * @param course Directs user to their chosen course
     */
   public static void addHomework(int course) {
       //need code to verify input is an integer as well as code to limit input scores to 1-100
       Scanner homeworkInput = new Scanner(System.in);
       Scanner isInputCorrect = new Scanner(System.in);

       if (course == 1) {
            while (true) {
                System.out.println("Please enter your Homework grade: ");
                int alchHomeworkScore = homeworkInput.nextInt();

                System.out.println("You entered <" + alchHomeworkScore + "> \nIs this correct? \n[y]Yes [n]No");
                char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

                if (isInputResponse == 'y') {
                    System.out.println("Your grade has been added.");
                    alchHomeworkGrades.add(alchHomeworkScore);
                }
                else if (isInputResponse == 'n'){
                    System.out.println("Your grade has NOT been saved.");
                }
                else {
                    System.out.println("Invalid input.");
                }
                System.out.println("Would you like to enter another Homework grade? \n[y]Yes [n]No");
                char moreHomeworkResponse = homeworkInput.next().toLowerCase().charAt(0);

                if (moreHomeworkResponse == 'y') {
                    continue;
                }
                else if (moreHomeworkResponse == 'n') {
                    String subject = "Alchemy";
                    String typeOfAssignment = "Homework";
                    Student.writeToFile(subject, typeOfAssignment, alchHomeworkGrades);
                    Menu.menuOrExit();
                    break;
                }
                else {
                    System.out.println("Incorrect input. Returning to Main Menu.");
                    break;
                }
            }
            Menu.mainMenu();
       }
       else if (course == 2) {
           while (true) {
               System.out.println("Please enter your Homework grade: ");
               int elemHomeworkScore = homeworkInput.nextInt();
               System.out.println("You entered <" + elemHomeworkScore + "> \nIs this correct? \n[y]Yes [n]No");
               char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

               if (isInputResponse == 'y') {
                   System.out.println("Your grade has been added.");
                   elemHomeworkGrades.add(elemHomeworkScore);
               }
               else if (isInputResponse == 'n'){
                   System.out.println("Your grade has NOT been saved.");
               }
               else {
                   System.out.println("Invalid input.");
               }
               System.out.println("Would you like to enter another Homework grade? \n[y]Yes [n]No");
               char moreHomeworkResponse = homeworkInput.next().toLowerCase().charAt(0);

               if (moreHomeworkResponse == 'y') {
                   continue;
               }
               else if (moreHomeworkResponse == 'n') {
                   String subject = "Elemental Magic";
                   String typeOfAssignment = "Homework";
                   Student.writeToFile(subject, typeOfAssignment, elemHomeworkGrades);
                   Menu.menuOrExit();
                   break;
               }
               else {
                   System.out.println("Invalid input. Returning to Main Menu.");
                   break;
               }
           }
           Menu.mainMenu();

       }
       else if (course == 3) {
           while (true) {
               System.out.println("Please enter your Homework grade: ");
               int necroHomeworkScore = homeworkInput.nextInt();

               System.out.println("You entered <" + necroHomeworkScore + "> \nIs this correct? \n[y]Yes [n]No");
               char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

               if (isInputResponse == 'y') {
                   System.out.println("Your grade has been added.");
                   necroHomeworkGrades.add(necroHomeworkScore);
               }
               else if (isInputResponse == 'n'){
                   System.out.println("Your grade has NOT been saved.");
               }
               else {
                   System.out.println("Invalid input.");
               }
               System.out.println("Would you like to enter another Homework grade? \n[y]Yes [n]No");
               char moreHomeworkResponse = homeworkInput.next().toLowerCase().charAt(0);

               if (moreHomeworkResponse == 'y') {
                   continue;
               }
               else if (moreHomeworkResponse == 'n') {
                   String subject = "Necromancy";
                   String typeOfAssignment = "Homework";
                   Student.writeToFile(subject, typeOfAssignment, necroHomeworkGrades);
                   Menu.menuOrExit();
                   break;
               }
               else {
                   System.out.println("Invalid input. Returning to Main Menu.");
                   break;
               }
           }
           Menu.mainMenu();
       }
   }

    /*
     * This method adds exam grades to an ArrayList related to chosen course. The grades are then saved to the
     * student's text file.
     *
     * @param course Directs user to their chosen course
     */
   public static void addExam(int course) {
       //probably need code to verify input is an integer as well as code to limit input scores to 1-100
       Scanner examInput = new Scanner(System.in);
       Scanner isInputCorrect = new Scanner(System.in);

        if (course == 1) {
            while (true) {
                System.out.println("Please enter your Exam grade: ");
                int alchExamScore = examInput.nextInt();
                System.out.println("You entered <" + alchExamScore + "> \nIs this correct? \n[y]Yes [n]No");
                char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

                if (isInputResponse == 'y') {
                    System.out.println("Your grade has been added.");
                    alchExamGrades.add(alchExamScore);
                }
                else if (isInputResponse == 'n'){
                    System.out.println("Your grade has NOT been saved.");
                }
                else {
                    System.out.println("Invalid input.");
                }
                System.out.println("Would you like to enter another Exam grade? \n[y]Yes [n]No");
                char moreExamResponse = examInput.next().toLowerCase().charAt(0);

                if (moreExamResponse == 'y') {
                    continue;
                }
                else if (moreExamResponse == 'n') {
                    String subject = "Alchemy";
                    String typeOfAssignment = "Exam";
                    Student.writeToFile(subject, typeOfAssignment, alchExamGrades);
                    Menu.menuOrExit();
                    break;
                }
                else {
                    System.out.println("Incorrect input. Returning to Main Menu.");
                    break;
                }
            }
            Menu.mainMenu();
        }
        else if (course == 2) {
            while (true) {
                System.out.println("Please enter your Exam grade: ");
                int elemExamScore = examInput.nextInt();
                System.out.println("You entered <" + elemExamScore + "> \nIs this correct? \n[y]Yes [n]No");
                char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

                if (isInputResponse == 'y') {
                    System.out.println("Your grade has been added.");
                    elemExamGrades.add(elemExamScore);
                }
                else if (isInputResponse == 'n'){
                    System.out.println("Your grade has NOT been saved.");
                }
                else {
                    System.out.println("Invalid input.");
                }
                System.out.println("Would you like to enter another Exam grade? \n[y]Yes [n]No");
                char moreExamResponse = examInput.next().toLowerCase().charAt(0);

                if (moreExamResponse == 'y') {
                    continue;
                } else if (moreExamResponse == 'n') {
                    String subject = "Elemental Magic";
                    String typeOfAssignment = "Exam";
                    Student.writeToFile(subject, typeOfAssignment, elemExamGrades);
                    Menu.menuOrExit();
                    break;
                } else {
                    System.out.println("Incorrect input. Returning to Main Menu.");
                    break;
                }
            }
            Menu.mainMenu();
        }
        else if (course == 3) {
            while (true) {
                System.out.println("Please enter your Exam grade: ");
                int necroExamScore = examInput.nextInt();
                System.out.println("You entered <" + necroExamScore + "> \nIs this correct? \n[y]Yes [n]No");
                char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

                if (isInputResponse == 'y') {
                    System.out.println("Your grade has been added.");
                    necroExamGrades.add(necroExamScore);
                }
                else if (isInputResponse == 'n'){
                    System.out.println("Your grade has NOT been saved.");
                }
                else {
                    System.out.println("Invalid input.");
                }
                System.out.println("Would you like to enter another Exam grade? \n[y]Yes [n]No");
                char moreExamResponse = examInput.next().toLowerCase().charAt(0);

                if (moreExamResponse == 'y') {
                    continue;
                } else if (moreExamResponse == 'n') {
                    String subject = "Necromancy";
                    String typeOfAssignment = "Exam";
                    Student.writeToFile(subject, typeOfAssignment, necroExamGrades);
                    Menu.menuOrExit();
                    break;
                } else {
                    System.out.println("Incorrect input. Returning to Main Menu.");
                    break;
                }
            }
            Menu.mainMenu();
        }
   }

    /*
     * This method adds project grades to an ArrayList related to chosen course. The grades are then saved to the
     * student's text file.
     *
     * @param course Directs user to their chosen course
     */
   public static void addProject(int course) {
       //probably need code to verify input is an integer as well as code to limit input scores to 1-100
       Scanner projectInput = new Scanner(System.in);
       Scanner isInputCorrect = new Scanner(System.in);

       if (course == 1) {
           while (true) {
               System.out.println("Please enter your Project grade: ");
               int alchProjectScore = projectInput.nextInt();
               System.out.println("You entered <" + alchProjectScore + "> \nIs this correct? \n[y]Yes [n]No");
               char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

               if (isInputResponse == 'y') {
                   System.out.println("Your grade has been added.");
                   alchProjectGrades.add(alchProjectScore);
               }
               else if (isInputResponse == 'n'){
                   System.out.println("Your grade has NOT been saved.");
               }
               else {
                   System.out.println("Invalid input.");
               }
               System.out.println("Would you like to enter another Project grade? \n[y]Yes [n]No");
               char moreProjectResponse = projectInput.next().toLowerCase().charAt(0);

               if (moreProjectResponse == 'y') {
                   continue;
               }
               else if (moreProjectResponse == 'n') {
                   String subject = "Alchemy";
                   String typeOfAssignment = "Project";
                   Student.writeToFile(subject, typeOfAssignment, alchProjectGrades);
                   Menu.menuOrExit();
                   break;
               }
               else {
                   System.out.println("Incorrect input. Returning to Main Menu.");
                   break;
               }
           }
           Menu.mainMenu();
       }
       if (course == 2) {
           while (true) {
               System.out.println("Please enter your Project grade: ");
               int elemProjectScore = projectInput.nextInt();
               System.out.println("You entered <" + elemProjectScore + "> \nIs this correct? \n[y]Yes [n]No");
               char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

               if (isInputResponse == 'y') {
                   System.out.println("Your grade has been added.");
                   elemProjectGrades.add(elemProjectScore);
               }
               else if (isInputResponse == 'n'){
                   System.out.println("Your grade has NOT been saved.");
               }
               else {
                   System.out.println("Invalid input.");
               }
               System.out.println("Would you like to enter another Project grade? \n[y]Yes [n]No");
               char moreProjectResponse = projectInput.next().toLowerCase().charAt(0);

               if (moreProjectResponse == 'y') {
                   continue;
               } else if (moreProjectResponse == 'n') {
                   String subject = "Elemental Magic";
                   String typeOfAssignment = "Project";
                   Student.writeToFile(subject, typeOfAssignment, elemProjectGrades);
                   Menu.menuOrExit();
                   break;
               } else {
                   System.out.println("Incorrect input. Returning to Main Menu.");
                   break;
               }
           }
           Menu.mainMenu();
       }
       if (course == 3) {
           while (true) {
               System.out.println("Please enter your Project grade: ");
               int necroProjectScore = projectInput.nextInt();
               System.out.println("You entered <" + necroProjectScore + "> \nIs this correct? \n[y]Yes [n]No");
               char isInputResponse = isInputCorrect.next().toLowerCase().charAt(0);

               if (isInputResponse == 'y') {
                   System.out.println("Your grade has been added.");
                   necroProjectGrades.add(necroProjectScore);
               }
               else if (isInputResponse == 'n'){
                   System.out.println("Your grade has NOT been saved.");
               }
               else {
                   System.out.println("Invalid input.");
               }
               System.out.println("Would you like to enter another Project grade? \n[y]Yes [n]No");
               char moreProjectResponse = projectInput.next().toLowerCase().charAt(0);

               if (moreProjectResponse == 'y') {
                   continue;
               }
               else if (moreProjectResponse == 'n') {
                   String subject = "Necromancy";
                   String typeOfAssignment = "Project";
                   Student.writeToFile(subject, typeOfAssignment, necroProjectGrades);
                   Menu.menuOrExit();
                   break;
               }
               else {
                   System.out.println("Incorrect input. Returning to Main Menu.");
                   break;
               }
           }
           Menu.mainMenu();
       }
   }

    /*
     * This method prompts the user to select a course, select what type of grade they would like to enter, and then
     * utilizes corresponding add<assignment type> method.
     */
   public static void courseSelection() {
       Scanner courseInput = new Scanner(System.in);

       while (true) {
           System.out.println("Please select a class: \n[1] Alchemy \n[2] Elemental Magic \n[3] Necromancy");
           int courseChoice = courseInput.nextInt();

           if (courseChoice == 1) {
               //alchemy
               Scanner alchemyInput = new Scanner(System.in);
               System.out.println("Which type of grade would you like to enter for Alchemy? \n[1] Homework" +
                       "\n[2] Quiz \n[3] Exam \n[4] Project");
               int alchemyResponse = alchemyInput.nextInt();

               while (true) {
                   switch (alchemyResponse) {
                       case 1:
                           Grades.addHomework(1);
                       case 2:
                           Grades.addQuiz(1);
                       case 3:
                           Grades.addExam(1);
                       case 4:
                           Grades.addProject(1);
                       default:
                           System.out.println("Invalid input. Returning to course menu.");
                   }
                   break;
               }
           }
           else if (courseChoice == 2) {
            //elemental magic
               Scanner elementalInput = new Scanner(System.in);
               System.out.println("Which type of grade would you like to enter for Elemental Magic? \n[1] Homework" +
                       "\n[2] Quiz \n[3] Exam \n[4] Project");
               int elemResponse = elementalInput.nextInt();

               while (true) {
                   switch (elemResponse) {
                       case 1:
                           Grades.addHomework(2);
                       case 2:
                           Grades.addQuiz(2);
                       case 3:
                           Grades.addExam(2);
                       case 4:
                           Grades.addProject(2);
                       default:
                           System.out.println("Invalid input. Returning to course menu.");
                   }
                   break;
               }
           }
           else if (courseChoice == 3) {
            //necromancy
               Scanner necroInput = new Scanner(System.in);
               System.out.println("Which type of grade would you like to enter for Necromancy? \n[1] Homework" +
                       "\n[2] Quiz \n[3] Exam \n[4] Project");
               int necroResponse = necroInput.nextInt();

               while (true) {
                   switch (necroResponse) {
                       case 1:
                           Grades.addHomework(3);
                       case 2:
                           Grades.addQuiz(3);
                       case 3:
                           Grades.addExam(3);
                       case 4:
                           Grades.addProject(3);
                       default:
                           System.out.println("Invalid input. Please try again.");
                   }
                   break;
               }
           }
           else {
               System.out.println("Invalid input. Returning to course.");
           }
       }
   }

   /*
    * This method reads the student's text file and prints all saved grades to console.
    */
   public static void printAllGrades() {
       System.out.println("If no grades appear, you have not saved any to your file.");
       FileReader reader = null;
       try {
           reader = new FileReader(Student.studentTextFile);
       }
       catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       try (BufferedReader buffReader = new BufferedReader(reader)) {
           String line;

           while ((line = buffReader.readLine()) != null) {
               System.out.println(line.substring(2)); // need to edit this so it does not print ")" for the last 3 lines when viewing all grades
           }
       }
       catch (
               IOException fileError) {
           System.out.println("File error: " + fileError.getStackTrace());
       }
   }

   /*
    * This method reads the student's text file and prints out specific course grades
    *
    * @param lineNumberOfGrades Selects the line of the text file containing specified grades
    */
    public static void printSpecificGrades(int lineNumberOfGrades) {
        FileReader reader = null;
        try {
            reader = new FileReader(Student.studentTextFile);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(reader)) {
            for (int i = 1; i < lineNumberOfGrades; i++) {
                br.readLine();
            }
            System.out.println(br.readLine().substring(2));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
