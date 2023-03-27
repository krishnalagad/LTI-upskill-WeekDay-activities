import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Address a = new Address();

        System.out.println("Enter Customer Address");

        System.out.println("Enter the street");
        a.street = sc.nextLine();

        System.out.println("Enter the city");
        a.city = sc.nextLine();

        System.out.println("Enter the pincode");
        a.pincode = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the country");
        a.country = sc.nextLine();

        a.displayAddress();
    }
}