import java.util.Scanner;

public class Week1Day3_Looping_MulTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = scanner.nextInt();
        System.out.println("Enter m");
        int m = scanner.nextInt();

        int i = 1;
        System.out.println("The multiplication table of 5 is");
        while (i <= m) {
            System.out.println(i + "*" + n + "=" + (n * i));
            i++;
        }
    }
}
