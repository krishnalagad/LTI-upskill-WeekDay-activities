import java.util.Scanner;

public class Week1Day5_StringOperations_StartsWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine().trim();

        System.out.println("Enter the start string");
        String word = sc.next().trim();

        if (str.startsWith(word))
            System.out.println("\"" + str + "\" starts with \"" + word + "\"");
        else
            System.out.println("\"" + str + "\" does not start with \"" + word + "\"");
    }
}
