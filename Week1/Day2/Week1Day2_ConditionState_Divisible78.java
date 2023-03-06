import java.util.Scanner;

public class Week1Day2_ConditionState_Divisible78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 7 == 0 && num % 3 == 0) {
            System.out.println(num + " is divisible by both 7 and 3");
        } else {
            System.out.println(num + " is not divisible by both 7 and 3");
        }
    }
}
