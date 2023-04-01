package Day1_IntroductionToList_7;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Customer> customers = new ArrayList<Customer>();

        while (true) {
            System.out.println("1)Insert\n2)Search\n3)Delete\n4)List\n5)Exit");

            System.out.println("Enter your choice");
            int choice = Integer.parseInt(br.readLine());

            if (choice == 1) {
                String[] customerData = br.readLine().trim().split(",");
                customers.add(new Customer(customerData[0].trim(), customerData[1].trim(), customerData[2].trim(),
                        customerData[3].trim(),
                        customerData[4].trim()));

            } else if (choice == 2) {
                System.out.println("Enter Email ID");
                String email = br.readLine().trim();
                Iterator<Customer> it = customers.listIterator();
                while (it.hasNext()) {
                    Customer c = it.next();
                    if (c.getEmail().equals(email)) {
                        System.out.printf("%-20s %-20s %-20s %-30s %-20s\n", c.getFirstName(), c.getLastName(),
                                c.getEmail(), c.getAddress(), c.getMobileNumber());
                    } else {
                        System.out.println("No records found");
                    }
                }

            } else if (choice == 3) {
                System.out.println("Enter Email ID");
                String email = br.readLine().trim();
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).getEmail().equals(email)) {
                        customers.remove(i);
                        System.out.println("1 record(s) removed");
                    } else {
                        System.out.println("Customer email not found");
                    }
                }
                
            } else if (choice == 4) {
                Customer.displayCustomers(customers);
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
