import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.*;

/*
 * Calculations Class contains methods that calculate the weighted grade percentage of an ArrayList full of grades.
 */
public class Calculations {

    public static ArrayList<Double> assignmentTotals = new ArrayList<>();

    /*
     * This method reads a line from the student's text file, extracts their grades, and then calculates the
     * weighted average.
     *
     * @param gradeLine The line of the text file containing the grades to be extracted (count starts at 1)
     * @param weight    The weight being applied to the grades
     */
    public static void assignmentWeightAverage(int gradeLine, int weight, Character outputData) {
        try {
            FileReader reader = new FileReader(Student.studentTextFile);
            BufferedReader br = new BufferedReader(reader);
            for (int i = 1; i < gradeLine; i++) {
                br.readLine();
            }
            ArrayList<String> collectedGrades = new ArrayList<>();
            ArrayList<Integer> integerArrList = new ArrayList<>(collectedGrades.size());
            Pattern pat = Pattern.compile("-?\\d+");
            Matcher match = pat.matcher(br.readLine().substring(2));
            while (match.find()) {
                collectedGrades.add(match.group());
            }
            for (String nums : collectedGrades) {
                integerArrList.add(Integer.parseInt(nums));
            }
            double x = 0;
            for (int i : integerArrList) {
                x += (i * weight);
            }
            double y = integerArrList.size() * weight;
            double weightAverage = x/y;
            if (outputData == 'y') {
                if (Double.isNaN(weightAverage)) {
                    System.out.println("You currently have no grades on file of that type.");
                }
                else {
                    System.out.println("Weighted Average: " + String.format("%.2f", weightAverage) + "%");
                }
            }
            else if (outputData == 'n') {
                assignmentTotals.add(weightAverage);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * This method takes the weighted grades from assignmentTotals ArrayList and calculates the overall course grade.
     *
     * @param courseName The name of the course whose grade is being printed
     */
    public static void printOverallGrade(String courseName) {
        double sum = 0;
        for (double i: assignmentTotals) {
            sum += i;
        }
        double total = sum / 4;
        System.out.println("Overall " + courseName + " grade: " + String.format("%.2f", total) + "%");
    }
}
