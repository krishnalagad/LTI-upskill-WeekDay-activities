import java.util.Scanner;

public class Week1Day3_Looping_1_SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        int num = sc.nextInt();
        int raw = num;

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits in " + raw +" is " + sum);
    }
}
