import java.util.Scanner;

class Week1Day2_ConditionState_Divisible23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n % 2 == 0 || n % 3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}