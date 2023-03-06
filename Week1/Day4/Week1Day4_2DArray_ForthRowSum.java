import java.util.Scanner;

public class Week1Day4_2DArray_ForthRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter the 3x3 matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        int[][] resMatrix = new int[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resMatrix[i][j] = matrix[i][j];
                resMatrix[i][3] += matrix[i][j]; 
                resMatrix[3][j] += matrix[i][j]; 
            }
        }
        resMatrix[3][3] = resMatrix[0][3] + resMatrix[1][3] + resMatrix[2][3]; 

        System.out.println("The sum matrix is");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(resMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
