import java.util.*;

public class Day2_SetIntroduction_3 {

    static boolean isPresent(String[] emails, Set<String> set) {
        int flag = 0;
        for (String email : emails) {
            if (set.contains(email))
                flag = 1;
            else
                flag = 0;
        }

        return (flag == 1) ? true : false;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        Set<String> emails = new HashSet<String>();

        while (true) {
            System.out.println("Enter Email address");
            String email = sc.nextLine();

            if (email.isEmpty()) {
                // continue;
            }

            if (emails.contains(email)) {
            } else
                emails.add(email);

            System.out.println("Do you want to Continue?(yes/no)");
            String choice = sc.nextLine().trim().toLowerCase();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("Enter the email addresses to be searched separated by comma");
        String searchStr = sc.next().trim();
        String[] emailArr = searchStr.split(",");
        if (isPresent(emailArr, emails)) {
            System.out.println("Email addresses are present");
        } else {
            System.out.println("Email addresses are not present");
        }
    }
}