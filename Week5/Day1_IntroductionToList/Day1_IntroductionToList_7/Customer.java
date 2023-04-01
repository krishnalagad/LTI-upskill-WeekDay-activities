package Day1_IntroductionToList_7;

import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String mobileNumber;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, String address, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public static void displayCustomers(List<Customer> customers) {
        if (!customers.isEmpty()) {
            System.out.printf("%-20s %-20s %-20s %-30s %-20s\n", "Firstname", "Lastname", "Email", "Address",
                    "Mobile Number");
            for (Customer customer : customers) {
                System.out.printf("%-20s %-20s %-20s %-30s %-20s\n", customer.getFirstName(), customer.getLastName(),
                        customer.getEmail(), customer.getAddress(), customer.getMobileNumber());
            }
        } else {
            System.out.println("No records found");
        }
    }
}
