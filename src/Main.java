
/*
 * This is a Student Gradebook program. It allows a student to login, view grades, and add/edit their grades.
 *
 * @author Patrick McCormick
 * @version 1.0
 * @since 11-5-2020
 */

class Main {
    public static void main(String[] args) {

        Student.studentLogin();
        Menu.mainMenu();
        Grades.courseSelection();

    }
}
