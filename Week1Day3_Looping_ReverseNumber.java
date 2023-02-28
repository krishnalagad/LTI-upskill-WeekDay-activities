import java.util.Scanner;

public class Week1Day3_Looping_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int reversedNum = 0;
        while (num != 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse of the number is " + removeLeadingZeros(reversedNum));
    }

    private static int removeLeadingZeros(int num) {
        int res = num;
        while (res % 10 == 0 && res != 0) {
            res /= 10;
        }
        return res;
    }
}
