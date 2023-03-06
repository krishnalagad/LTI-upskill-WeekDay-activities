import java.util.Scanner;

public class Week1Day4_Array_10_SortByShift {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("0");
            return;

        }
        boolean found = false;
        for (int j = 0; j < n; j++) {
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            boolean notSorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    notSorted = false;
                    break;
                }
            }
            if (notSorted) {
                System.out.println(j + 1);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }
}
