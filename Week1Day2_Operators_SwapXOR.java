import java.util.Scanner;

public class Week1Day2_Operators_SwapXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("The two values after swapping are");
        System.out.println(x);
        System.out.println(y);
    }
}
