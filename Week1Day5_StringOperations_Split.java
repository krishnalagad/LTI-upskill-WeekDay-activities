import java.util.Scanner;

public class Week1Day5_StringOperations_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String str = sc.nextLine().trim();

        System.out.println("Enter the old name of the company");
        String old = sc.nextLine().trim();
        System.out.println("Enter the new name of the company");
        String n = sc.nextLine().trim();

        System.out.println("The content of the modified document is\n" + str.replaceAll(old, n));
    }
}
