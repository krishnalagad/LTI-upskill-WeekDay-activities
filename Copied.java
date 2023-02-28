import java.util.ArrayList;
import java.util.List;

public class Copied {
    public static boolean isSpecialNumber(int n) {
        // Get the digits of n
        int digitSum = 0, digitProduct = 1, num = n;
        while (num > 0) {
            int digit = num % 10;
            digitSum += digit;
            digitProduct *= digit;
            num /= 10;
        }

        // Check if the sum of the sum of the digits and the product of the digits is
        // equal to n
        return digitSum + digitProduct == n;
    }

    public static List<Integer> findSpecialNumbers(int m, int n) {
        List<Integer> specialNumbers = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (isSpecialNumber(i)) {
                specialNumbers.add(i);
            }
        }
        return specialNumbers;
    }

    public static void main(String[] args) {
        int m = 10, n = 99;
        List<Integer> specialNumbers = findSpecialNumbers(m, n);
        System.out.println("Special numbers between " + m + " and " + n + " are: " + specialNumbers);
    }
}
