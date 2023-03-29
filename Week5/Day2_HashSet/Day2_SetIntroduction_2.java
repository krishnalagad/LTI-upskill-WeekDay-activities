import java.util.*;

public class Day2_SetIntroduction_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> usernames = new HashSet<>();

        while (true) {
            System.out.println("Enter Username");
            String username = sc.nextLine();

            if (username.isEmpty()) {
                // continue;
            }

            if (usernames.contains(username)) {
            } else {
                usernames.add(username);
            }

            System.out.println("Do you want to continue ?(yes/no)");
            String choice = sc.nextLine().trim().toLowerCase();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Number of Users = " + usernames.size());
    }

}