import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Menu Class contains various methods regarding main menu options
 */
public class Menu {

    /*
     * This method contains the main menu and allows the user to view grades, enter new grades, or logout.
     */
    public static void mainMenu() {
        try {
            Scanner response2 = new Scanner(System.in);

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
                System.out.println("Invalid input. Please try again.");
                mainMenu();
            }
        }
        catch (InputMismatchException menuSelection) {
            System.out.println("Invalid input. Returning to Main Menu");
            mainMenu();
        }
    }

    /*
     * This method gives the user the option to return to the main menu or to logout.
     */
    public static void menuOrExit() {
        try {
            Scanner selectOptionInput = new Scanner(System.in);
            System.out.println("What would you like to do? \n[1]Return to Main Menu \n[2]Logout");
            int selectOptionResponse = selectOptionInput.nextInt();

            if (selectOptionResponse == 1) {
                mainMenu();
            }
            else if (selectOptionResponse == 2) {
                System.exit(0);
            }
            else {
                System.out.println("Invalid input. Please try again");
                menuOrExit();
            }
        }
        catch (InputMismatchException selectOptionResponse) {
            System.out.println("Invalid input. Please try again.");
            menuOrExit();
        }
    }

    /*
     * This method allows the user to choose which course they would like to view grades for.
     */
    public static void viewGradesMenu() {
        System.out.println("Which class would you like to view? \n[1] Alchemy \n[2] Elemental Magic \n[3] Necromancy " +
                "\n[4] Return to Main Menu");
        Scanner viewGradeInput = new Scanner(System.in);
        int viewGradeResponse = viewGradeInput.nextInt();

        while (true) {
            Scanner specificAssignmentInput = new Scanner(System.in);
            if (viewGradeResponse == 1) {
                System.out.println("Which Alchemy grades would you like to view?\n[1] Homework\n[2] Quiz\n[3] Exam" +
                        "\n[4] Project\n[5] Overall grade");
                int specificAssignmentResponse = specificAssignmentInput.nextInt();

                switch (specificAssignmentResponse) {
                    case 1:
                        Grades.printSpecificGrades(1, "Homework");
                        Calculations.assignmentWeightAverage(1, 25, 'y');
                        break;
                    case 2:
                        Grades.printSpecificGrades(2, "Quiz");
                        Calculations.assignmentWeightAverage(2, 20, 'y');
                        break;
                    case 3:
                        Grades.printSpecificGrades(3, "Exam");
                        Calculations.assignmentWeightAverage(3, 30, 'y');
                        break;
                    case 4:
                        Grades.printSpecificGrades(4, "Project");
                        Calculations.assignmentWeightAverage(4, 25, 'y');
                        break;
                    case 5:
                        Calculations.assignmentWeightAverage(1, 25, 'n');
                        Calculations.assignmentWeightAverage(2, 20, 'n');
                        Calculations.assignmentWeightAverage(3, 30, 'n');
                        Calculations.assignmentWeightAverage(4, 25, 'n');
                        Calculations.printOverallGrade("Alchemy");
                        break;
                }
                break;
            }
            else if (viewGradeResponse == 2) {
                System.out.println("Which Elemental Magic grades would you like to view?\n[1] Homework\n[2] Quiz" +
                        "\n[3] Exam\n[4] Project\n[5]Overall grade");
                int specificAssignmentResponse = specificAssignmentInput.nextInt();

                switch (specificAssignmentResponse) {
                    case 1:
                        Grades.printSpecificGrades(5, "Homework");
                        Calculations.assignmentWeightAverage(5, 25, 'y');
                        break;
                    case 2:
                        Grades.printSpecificGrades(6, "Quiz");
                        Calculations.assignmentWeightAverage(6, 20, 'y');
                        break;
                    case 3:
                        Grades.printSpecificGrades(7, "Exam");
                        Calculations.assignmentWeightAverage(7, 30, 'y');
                        break;
                    case 4:
                        Grades.printSpecificGrades(8, "Project");
                        Calculations.assignmentWeightAverage(8, 25, 'y');
                        break;
                    case 5:
                        Calculations.assignmentWeightAverage(5, 25, 'n');
                        Calculations.assignmentWeightAverage(6, 20, 'n');
                        Calculations.assignmentWeightAverage(7, 30, 'n');
                        Calculations.assignmentWeightAverage(8, 25, 'n');
                        Calculations.printOverallGrade("Elemental Magic");
                        break;
                }
                break;
            }
            else if (viewGradeResponse == 3) {
                System.out.println("Which Necromancy grades would you like to view?\n[1] Homework\n[2] Quiz" +
                        "\n[3] Exam\n[4] Project\n[5] Overall grade");
                int specificAssignmentResponse = specificAssignmentInput.nextInt();

                switch (specificAssignmentResponse) {
                    case 1:
                        Grades.printSpecificGrades(9, "Homework");
                        Calculations.assignmentWeightAverage(9, 25, 'y');
                        break;
                    case 2:
                        Grades.printSpecificGrades(10, "Quiz");
                        Calculations.assignmentWeightAverage(10, 20, 'y');
                        break;
                    case 3:
                        Grades.printSpecificGrades(11, "Exam");
                        Calculations.assignmentWeightAverage(11, 30, 'y');
                        break;
                    case 4:
                        Grades.printSpecificGrades(12, "Project");
                        Calculations.assignmentWeightAverage(12, 25, 'y');
                        break;
                    case 5:
                        Calculations.assignmentWeightAverage(9, 25, 'n');
                        Calculations.assignmentWeightAverage(10, 20, 'n');
                        Calculations.assignmentWeightAverage(11, 30, 'n');
                        Calculations.assignmentWeightAverage(12, 25, 'n');
                        Calculations.printOverallGrade("Necromancy");
                        break;
                }
                break;
            }
            else if (viewGradeResponse == 4) {
                System.out.println("Returning to Main Menu.");
                Menu.mainMenu();
                break;
            }
            else {
                System.out.println("Invalid input. You must enter a number corresponding to a menu option.");
                viewGradesMenu();
                break;
            }
        }
        mainMenu();
    }
}