import java.util.Scanner;

public class Week1Day3_Looping_5_PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while (i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == n)
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");
    }
}
