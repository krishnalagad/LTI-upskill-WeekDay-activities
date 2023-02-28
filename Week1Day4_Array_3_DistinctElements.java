import java.util.Scanner;

public class Week1Day4_Array_3_DistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i <= n - 1; i++) {
            boolean isDistinct = true;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;

                }
            }
            if (isDistinct) {
                distinct++;
            }
        }
        System.out.println(distinct);
    }

}
