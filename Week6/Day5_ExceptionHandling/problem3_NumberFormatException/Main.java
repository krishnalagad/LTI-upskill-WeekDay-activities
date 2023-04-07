package problem3_NumberFormatException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Item type details:");
        ItemType itemType = new ItemType();
        System.out.println("Enter the name:");
        itemType.setName(scanner.nextLine());
        try {
            System.out.println("Enter the deposit:");
            itemType.setDeposit(Double.parseDouble(scanner.nextLine()));
            System.out.println("Enter the cost per day:");
            itemType.setCostPerDay(Double.parseDouble(scanner.nextLine()));
            System.out.println("The details of the item type are:");
            System.out.println(itemType.toString());
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
    }
}
