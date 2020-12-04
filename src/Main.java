/*
 * This is a Student Gradebook program. It allows a student to login, view grades, and add/edit their grades.
 *
 * @author Patrick McCormick
 * @version 1.2
 * @since 12-4-2020
 */

import java.util.Collection;

class Main {
    public static void main(String[] args) {

        Student.studentLogin();
        Menu.mainMenu();
    }
}
