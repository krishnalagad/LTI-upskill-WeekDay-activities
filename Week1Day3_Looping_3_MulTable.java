import java.util.Scanner;

public class Week1Day3_Looping_3_MulTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        System.out.println("Enter m");
        int m = scanner.nextInt();
        int i = 1;
        System.out.println("The multiplication table of " + n + " is");
        while (i <= m) {
            int table = n * i;
            System.out.println(i + "*" + n + "=" + table);
            i++;
        }

    }
}
