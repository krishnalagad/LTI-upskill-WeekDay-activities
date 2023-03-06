import java.util.Scanner;

public class Week1Day3_Looping_7_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            n = scanner.nextInt();
            if (n != -999) {
                sum = sum + n;
            }
        } while (n != -999);
        {
            System.out.println("The sum is" + sum);
        }

    }
}
