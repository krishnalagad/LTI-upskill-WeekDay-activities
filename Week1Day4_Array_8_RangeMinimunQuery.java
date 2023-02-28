import java.util.Scanner;

public class Week1Day4_Array_8_RangeMinimunQuery {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        int queries = scanner.nextInt();
        for (int i = 0; i <= queries - 1; i++) {
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            int minVal = arr[l];
            for (int j = l + 1; j <= r; j++) {
                if (arr[j] < minVal) {
                    minVal = arr[j];
                }
            }
            System.out.println(minVal);
        }
    }
}
