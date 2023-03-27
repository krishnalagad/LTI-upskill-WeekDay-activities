package Problem6_DisplayItemType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ItemType it = new ItemType();

        System.out.println("Enter the item type name");
        String name = sc.nextLine();
        it.setName(name);

        System.out.println("Enter the cost per day");
        double costPerDay = sc.nextDouble();
        it.setCostPerDay(costPerDay);

        System.out.println("Enter the deposit");
        double deposit = sc.nextDouble();
        it.setDeposit(deposit);

        it.display();
    }
}
