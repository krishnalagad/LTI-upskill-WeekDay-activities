import java.util.*;

public class Week1Day4_Array_7_MinimumScalerProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v1 = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            v1[i] = scanner.nextInt();
        }
        int[] v2 = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            v2[i] = scanner.nextInt();
        }
        Arrays.sort(v1);
        Arrays.sort(v2);
        reverseArray(v2);
        int product = 0;
        for (int i = 0; i <= n - 1; i++) {
            product = product + v1[i] * v2[i];
        }
        System.out.println(product);
    }

    static void reverseArray(int[] arr) {

        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
