import java.util.Scanner;

public class Week1Day3_Looping_6_SumBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Type a value between 0 and 20");
            n = scanner.nextInt();

        } while (n < 0 || n > 20);
        int res = n + 17;
        System.out.println("The final value is " + res);

    }
}
