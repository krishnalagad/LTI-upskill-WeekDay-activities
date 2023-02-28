import java.util.Scanner;

public class Week1Day5_StringOperations_Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine().trim();

        System.out.println("The processed string is " + str.replaceAll("\\s+", " "));
    }
}
