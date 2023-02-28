import java.util.Scanner;

public class Week1Day4_Array_9_StockSpan {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] price = new int[n];
        int[] span = new int[n];

        span[0] = 1;
        price[0] = scanner.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            price[i] = scanner.nextInt();
            int spanVal = 1;
            int j = i - 1;
            while (j >= 0 && price[i] >= price[j]) {
                spanVal = spanVal + span[j];
                j = j - span[j];

            }
            span[i] = spanVal;
        }
        for (int i = 0; i <= n - 1; i++) {
            System.out.println(span[i]);
        }
    }
}
