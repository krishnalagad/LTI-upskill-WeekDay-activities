import java.util.Scanner;

public class Week1Day4_2DArray_MinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();

        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int min = matrix[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println("The minimum element is " + min);
    }
}
