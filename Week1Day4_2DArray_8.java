import java.util.Scanner;

public class Week1Day4_2DArray_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int queries = sc.nextInt();
        for (int i = 0; i <= queries - 1; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int minval = arr[l];
            for (int j = l + 1; j <= r; j++) {
                if (arr[j] < minval) {
                    minval = arr[j];
                }
            }
            System.out.println(minval);
        }
    }
}
