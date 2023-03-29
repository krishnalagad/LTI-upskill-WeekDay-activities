import java.util.*;

public class Day2_SetIntroduction_1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        sc.nextLine();
        while (flag) {
            System.out.println("Enter the username");
            String username = sc.nextLine().trim();
            set.add(username);
            System.out.println("Do you want to continue? (Y/N)");
            String str = sc.next().trim();
            if (!str.equalsIgnoreCase("y")) {
                flag = false;
            }
        }
        System.out.println("The unique number of usernames is " + set.size());
    }
}