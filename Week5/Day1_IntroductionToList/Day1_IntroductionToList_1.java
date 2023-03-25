import java.util.*;

public class Day1_IntroductionToList_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();

        int count = 1;
        while (true) {
            System.out.println("Enter the username " + count);
            String username = scanner.nextLine();
            usernames.add(username);

            System.out.println("Do you want to continue?(y/n)");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }

            count++;
        }

        System.out.println("The Names entered are:");
        for (String username : usernames) {
            System.out.println(username);
        }
    }
}