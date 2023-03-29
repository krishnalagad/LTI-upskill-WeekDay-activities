package Problem2_Association;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student name:");
        String studentName = sc.nextLine();

        System.out.println("Enter the register number:");
        Integer registerNo = sc.nextInt();

        System.out.println("Enter the course id:");
        Integer courseId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the course name:");
        String courseName = sc.nextLine();

        Course course = new Course(courseId, courseName);
        Student student = new Student(studentName, registerNo);

        student.display(course);
    }
}
