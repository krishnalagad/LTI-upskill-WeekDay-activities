import java.util.Scanner;

public class Week1Day3_Looping_Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int no = 4;
        int mul = 8;

        for (int i = 0; i < n; i++) {
            System.out.print(no + " ");
            no *= mul;
            mul /= 2;
        }
    }
}
