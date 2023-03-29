import java.util.*;

class User implements Comparable<User>{
    private String username;
    private String bankname;
    public User() {
    }
    public User(String username, String bankname) {
        this.username = username;
        this.bankname = bankname;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getBankname() {
        return bankname;
    }
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
    @Override
    public int compareTo(User o) {
        return this.username.compareTo(o.username);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User other = (User) obj;
        return username.equals(other.username);
    }    
}

public class Day2_SetIntroduction_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of users:");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<User> users = new HashSet<>();
        List<User> userList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of user" + (i + 1));
            System.out.println("Username:");
            String username = scanner.nextLine();
            System.out.println("Bank name:");
            String bankname = scanner.nextLine();
            User user = new User(username, bankname);
            users.add(user);
            userList.add(new User(username, null));
        }

        System.out.println("Enter username(Expire in one month) separated by comma");
        String[] expiredUsernames = scanner.nextLine().split(",");

        List<User> expiredUsers = new ArrayList<>();
        for (String username : expiredUsernames) {
            User user = new User(username.trim(), null);
            if (userList.contains(user)) {
                expiredUsers.add(user);
            }
        }

        users.retainAll(userList);

        System.out.println("Users going to expire within a month");
        int count = 1;
        for (User user : expiredUsers) {
            int index = userList.indexOf(user);
            User userInList = userList.get(index);
            System.out.println("User " + count++);
            System.out.println("User Name = " + userInList.getUsername());
            boolean flag = users.contains(userInList);
            System.out.println("Bank Name = " + (flag ? userInList.getBankname() : "Not Found"));
        }
    }
}