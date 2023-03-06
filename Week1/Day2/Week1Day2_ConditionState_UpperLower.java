import java.util.Scanner;

public class Week1Day2_ConditionState_UpperLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        if (c >= 'A' && c <= 'Z') {
            System.out.println(c + " is uppercase letter");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println(c + " is lowercase letter");
        } else {
            System.out.println(c + "is neither an uppercase or lowercase letter");
        }
    }
}
