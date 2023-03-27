package Problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer Details");
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the email");
        String email = sc.nextLine();
        System.out.println("Enter the type");
        String type = sc.nextLine();
        System.out.println("Enter the location");
        String location = sc.nextLine();

        Customer c = new Customer(name, email, type, location);

        System.out.println("Customer Details");
        System.out.println("Name: " + c.getCustomerName());
        System.out.println("E-mail: " + c.getCustomerEmail());
        System.out.println("Type: " + c.getCustomerType());
        System.out.println("Location: " + c.getCustomerLocation());
    }
}
