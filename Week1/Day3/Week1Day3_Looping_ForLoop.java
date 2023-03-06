import java.util.Scanner;

public class Week1Day3_Looping_ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
