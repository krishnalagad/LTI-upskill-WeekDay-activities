import java.io.*;
import java.util.*;

public class Day1_IntroductionToList_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        LinkedList<Customer> customerList = new LinkedList<>();

        String st;
        while ((st = br.readLine()) != null) {
            String arr[] = st.split(",");

            customerList.add(new Customer(arr[0], arr[1], arr[2]));
        }

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s\n", "Customer Name", "Email", "Phone Number");
        System.out.println("--------------------------------------------------------------------------------------");

        ListIterator<Customer> list_Iter = customerList.listIterator(customerList.size());

        while (list_Iter.hasPrevious()) {
            Customer c = list_Iter.previous();
            System.out.printf("%-20s %-20s %-20s\n", c.getName(), c.getEmail(), c.getPhoneNO());
        }
        System.out.println("--------------------------------------------------------------------------------------");

    }

}

class Customer {
    private String name, email, phoneNO;

    public Customer(String name, String email, String phoneNO) {
        super();
        this.name = name;
        this.email = email;
        this.phoneNO = phoneNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

}