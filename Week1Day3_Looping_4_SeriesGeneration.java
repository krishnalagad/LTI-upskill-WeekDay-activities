import java.util.Scanner;

public class Week1Day3_Looping_4_SeriesGeneration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range :");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        while (n <= m) {
            if ((n % 2 == 0) && (n % 3 != 0) && (n % 5 != 0)) {
                System.out.println(n + " ");
            }
            n++;
        }

    }
}
