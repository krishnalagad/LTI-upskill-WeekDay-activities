package Problem3_reverseMethod;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of users:");
        int n = Integer.parseInt(reader.readLine().trim());

        List<User> users = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the details of User " + i);
            String[] userDetails = reader.readLine().split(",");
            User user = new User(userDetails[0].trim(), userDetails[1].trim(),
                    userDetails[2].trim(), userDetails[3].trim());
            users.add(user);
        }

        Collections.sort(users, Collections.reverseOrder());
        System.out.println("The user details in reverse order:");
        System.out.printf("%-15s%-15s\n", "Name", "Mobile number");
        for (User user : users) {
            System.out.println(user.getName() + "\t\t" + user.getMobileNumber());
        }
    }
}
