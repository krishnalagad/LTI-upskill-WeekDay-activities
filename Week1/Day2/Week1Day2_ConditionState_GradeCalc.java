import java.util.Scanner;

public class Week1Day2_ConditionState_GradeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();

        if (marks > 100 || marks < 0) {
            System.out.println("Invalid Input");
            return;
        } 

        char grade;
        if (marks == 100) {
            grade = 'S';
        } else if (marks >= 90 && marks < 100) {
            grade = 'A';
        } else if (marks >= 80 && marks < 90) {
            grade = 'B';
        } else if (marks >= 70 && marks < 80) {
            grade = 'C';
        } else if (marks >= 60 && marks < 70) {
            grade = 'D';
        } else if (marks >= 50 && marks < 60) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("The student obtained a " + grade + " grade");
    }
}
