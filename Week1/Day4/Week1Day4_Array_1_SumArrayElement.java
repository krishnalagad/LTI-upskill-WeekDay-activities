import java.util.Scanner;

public class Week1Day4_Array_1_SumArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of the elements in the array is " + sum);

    }

}
