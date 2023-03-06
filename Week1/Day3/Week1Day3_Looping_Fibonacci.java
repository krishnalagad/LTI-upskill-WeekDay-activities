import java.util.Scanner;

public class Week1Day3_Looping_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci series:");

        for (int i = 1; i <= n; i++) {
            System.out.println(firstTerm);

            int nextTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
