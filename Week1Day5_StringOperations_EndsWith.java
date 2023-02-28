import java.util.Scanner;

public class Week1Day5_StringOperations_EndsWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine().trim();

        System.out.println("Enter the end string");
        String word = sc.nextLine().trim();

        if (str.endsWith(word))
            System.out.println("\"" + str + "\" ends with \"" + word + "\"");
        else
            System.out.println("\"" + str + "\" does not end with \"" + word + "\"");

    }
}
