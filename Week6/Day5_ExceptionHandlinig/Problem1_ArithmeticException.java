import java.util.*;

public class Problem1_ArithmeticException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer input");
        try {
            int num = input.nextInt();
            System.out.println("Entered value is " + num);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        input.close();
    }
}