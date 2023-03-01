import java.util.Scanner;

public class Week1Day3_Looping_2_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scanner.nextInt();
        System.out.print("Reverse of the number is ");
        int reverse = 0;
        while (n > 0) {
            int num = n % 10;
            reverse = reverse * 10 + num;

            n = n / 10;
        }
        System.out.print(reverse);
    }
}
