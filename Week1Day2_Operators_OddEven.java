import java.util.Scanner;

public class Week1Day2_Operators_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int no = sc.nextInt();

        System.out.println((no % 2 == 0)?no + " is even.": no + " is odd.");
    }
}
