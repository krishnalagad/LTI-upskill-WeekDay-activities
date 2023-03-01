import java.io.*;
import java.util.*;

class SpecialNo {
    public static boolean isSpecialNumber(int n) {
        int a = n % 10;
        int b = n / 10;
        int c = a + b;
        int d = a * b;
        int e = c + d;
        return e == n;
    }

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        while (m <= n) {
            if (isSpecialNumber(m)) {
                System.out.println(m);
            }
            m++;
        }
    }
}
