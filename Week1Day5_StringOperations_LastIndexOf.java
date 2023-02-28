import java.util.Scanner;

public class Week1Day5_StringOperations_LastIndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        System.out.println("Enter the string to be searched");
        String search = sc.nextLine();

        System.out.println("The index of last occurence of \"" + search +  "\" is " + str.lastIndexOf(search));

        System.out.println("Enter the index limit");
        int limit = sc.nextInt();

        System.out.println("First occurence of \"" + search + "\" from " + limit + "th index backwards is " + str.lastIndexOf(search, limit));
    }
}
