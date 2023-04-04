import java.io.IOException;
import java.util.*;

class User implements Comparable<User> {
    private String username;
    private String bankname;

    public User() {
    }

    public User(String username, String bankname) {
        super();
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

    // fill the code here
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } // here == only checks for the contents of objects is same or not

        if (o == null || getClass() != o.getClass()) {
            return false;
        } // checking if both object belong to same class or not

        User u = (User) o; // downcasting object class object to user

        return username.equals(u.getUsername());
    }

    @Override
    public int hashCode() { // If two objects are equal according to equals() method, then their hash code
                            // must be same.
        return super.hashCode();
    }

    @Override
    public int compareTo(User u) {
        return this.getUsername().compareTo(u.getUsername()); // To sort Users in Alphabetical order of Username.
    }

}

public class Day2_SetIntroduction_4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Set<User> hs = new TreeSet<>();

        System.out.println("Enter number of users:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of user" + i);
            System.out.println("Username:");
            String name = sc.nextLine();
            System.out.println("Bank name:");
            String bname = sc.nextLine();

            User u = new User(name, bname);

            hs.add(u);
        }

        System.out.println("Enter username(Expire in one month) seperated by comma");
        String names = sc.nextLine();
        String[] a = names.split(",");

        List<User> userExpirein1month = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            User u1 = new User(a[i], null);

            userExpirein1month.add(u1);
        }

        // Use retainAll() to remove elements in Set that are not in the present in the
        // List.
        hs.retainAll(userExpirein1month);

        // Collections.sort((List<User>) hs); //TreeSet is sorted by default

        System.out.println("Users going to expire within a month");
        int j = 1;
        for (User k : hs) {
            System.out.println("User " + j);
            System.out.println("User Name = " + k.getUsername());
            System.out.println("Bank Name = " + k.getBankname());
            j++;
        }
    }
}