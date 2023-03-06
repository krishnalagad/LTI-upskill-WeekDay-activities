import java.util.Scanner;

public class Week1Day3_Looping_Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // upper half
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j < (n / 2) - i || j > (n / 2) + i) {
                    System.out.print("C");
                } else {
                    System.out.print("S");
                }
            }
            System.out.println();
        }

        // middle line
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                System.out.print("S");
            } else {
                System.out.print("K");
            }
        }
        System.out.println();

        // lower half
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j < (n / 2) - i || j > (n / 2) + i) {
                    System.out.print("C");
                } else {
                    System.out.print("S");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
