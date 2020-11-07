import java.util.Scanner;

/*
 * Menu Class contains various methods regarding main menu options
 */
public class Menu {

    /*
     * This method contains the main menu and allows the user to view grades, enter new grades, or logout.
     */
    public static void mainMenu() {
        Scanner response2 = new Scanner(System.in);

        while (true) {
            System.out.println("What would you like to do? \n[1] View grades \n[2] Enter new grades" +
                    " \n[3] Logout");
            int menuSelection = response2.nextInt();

            if (menuSelection == 1) {
                Menu.viewGradesMenu();
            }
            else if (menuSelection == 2) {
                Grades.courseSelection();
            }
            else if (menuSelection == 3) {
                System.out.println("Logout successful.");
                System.exit(0);
            }
            else {
                System.out.println("Invalid input. You must enter either 1 or 2");
            }
        }
    }

    /*
     * This method gives the user the option to return to the main menu or to logout.
     */
    public static void menuOrExit() {
        Scanner selectOptionInput = new Scanner(System.in);

        while (true) {
            System.out.println("What would you like to do? \n[1]Return to Main Menu \n[2]Logout");
            int selectOptionResponse = selectOptionInput.nextInt();

            if (selectOptionResponse == 1) {
                mainMenu();
            }
            else if (selectOptionResponse == 2) {
                System.exit(0);
            }
            else {
                System.out.println("Invalid input. Please enter either 1 or 2.");
            }
        }
    }

    /*
     * This method allows the user to choose which course they would like to view grades for.
     */
    public static void viewGradesMenu() {
        System.out.println("Which class would you like to view? \n[1] Alchemy \n[2] Elemental Magic \n[3] Necromancy " +
                "\n[4] View All Course Grades \n[5] Return to Main Menu");
        Scanner viewGradeInput = new Scanner(System.in);
        int viewGradeResponse = viewGradeInput.nextInt();

        while (true) {
            Scanner specificAssignmentInput = new Scanner(System.in);
            if (viewGradeResponse == 1) {
                System.out.println("Which Alchemy grades would you like to view?\n[1] Homework\n[2] Quiz\n[3] Exam" +
                        "\n[4] Project");
                int specificAssignmentResponse = specificAssignmentInput.nextInt();

                if (specificAssignmentResponse == 1) {
                    Grades.printSpecificGrades(1);
                }
                else if (specificAssignmentResponse == 2) {
                    Grades.printSpecificGrades(2);
                }
                else if (specificAssignmentResponse == 3) {
                    Grades.printSpecificGrades(3);
                }
                else if (specificAssignmentResponse == 4) {
                    Grades.printSpecificGrades(4);
                }
                break;
            }
            else if (viewGradeResponse == 2) {
                System.out.println("Which Elemental Magic grades would you like to view?\n[1] Homework\n[2] Quiz" +
                        "\n[3] Exam\n[4] Project");
                int specificAssignmentResponse = specificAssignmentInput.nextInt();

                if (specificAssignmentResponse == 1) {
                    Grades.printSpecificGrades(5);
                }
                else if (specificAssignmentResponse == 2) {
                    Grades.printSpecificGrades(6);
                }
                else if (specificAssignmentResponse == 3) {
                    Grades.printSpecificGrades(7);
                }
                else if (specificAssignmentResponse == 4) {
                    Grades.printSpecificGrades(8);
                }
                break;
            }
            else if (viewGradeResponse == 3) {
                System.out.println("Which Necromancy grades would you like to view?\n[1] Homework\n[2] Quiz" +
                        "\n[3] Exam\n[4] Project");
                int specificAssignmentResponse = specificAssignmentInput.nextInt();

                if (specificAssignmentResponse == 1) {
                    Grades.printSpecificGrades(9);
                }
                else if (specificAssignmentResponse == 2) {
                    Grades.printSpecificGrades(10);
                }
                else if (specificAssignmentResponse == 3) {
                    Grades.printSpecificGrades(11);
                }
                else if (specificAssignmentResponse == 4) {
                    Grades.printSpecificGrades(12);
                }
                break;
            }
            else if (viewGradeResponse == 4) {
                Grades.printAllGrades();
                break;
            }
            else if (viewGradeResponse == 5) {
                System.out.println("Returning to Main Menu.");
                Menu.mainMenu();
                break;
            }
            else {
                System.out.println("Invalid input. You must enter a number corresponding to a menu option.");
            }
        }
    }
}