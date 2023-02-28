import java.util.Scanner;

public class Week1Day4_2DArray_RowSum {
    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row size");
        rows = sc.nextInt();

        System.out.println("Enter the column size");
        cols = sc.nextInt();

        int a[][] = new int[rows][cols];

        System.out.println("Enter the matrix values");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow + a[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum is " + sumRow);
        }

        for (int i = 0; i < cols; i++) {
            sumCol = 0;
            for (int j = 0; j < rows; j++) {
                sumCol = sumCol + a[j][i];
            }
            System.out.println("Column " + (i + 1) + " sum is " + sumCol);
        }
    }
}
