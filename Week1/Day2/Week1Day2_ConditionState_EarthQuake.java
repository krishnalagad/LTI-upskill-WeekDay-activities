import java.util.Scanner;

public class Week1Day2_ConditionState_EarthQuake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Richter Magnitude:");
        double magnitude = scanner.nextDouble();

        if (magnitude <= 2.4) {
            System.out.println("Micro");
        } else if (magnitude <= 5.4) {
            System.out.println("Light");
        } else if (magnitude <= 6.0) {
            System.out.println("Moderate");
        } else if (magnitude <= 6.9) {
            System.out.println("Strong");
        } else if (magnitude <= 7.9) {
            System.out.println("Major");
        } else {
            System.out.println("Great");
        }
    }
}
