import java.util.Scanner;

public class Week1Day3_Looping_Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j == (rows/2)+1 && i == (rows/2)+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("~ ");
                }
            }
            System.out.println();
        }
    }
}
