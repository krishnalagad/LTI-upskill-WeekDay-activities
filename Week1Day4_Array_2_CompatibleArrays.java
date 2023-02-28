import java.util.Scanner;

public class Week1Day4_Array_2_CompatibleArrays {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr2[i] = scanner.nextInt();
        }
        boolean compatible = true;
        for (int i = 0; i <= n - 1; i++) {
            if (arr1[i] < arr2[i]) {
                compatible = false;
                break;
            }
        }
        if (compatible) {
            System.out.println("Compatible");
        } else {
            System.out.println("InCompatible");
        }
    }
}
