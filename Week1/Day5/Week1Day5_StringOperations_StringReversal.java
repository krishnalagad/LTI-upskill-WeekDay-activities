import java.util.Scanner;

public class Week1Day5_StringOperations_StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String str = scanner.nextLine().trim();
        System.out.println("Reverse of the string is " + new StringBuffer(str).reverse());
    }
}
