package Problem2_;

import java.text.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 1;
        ArrayList<Transaction> transactions = new ArrayList<>();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter Transaction Details");
            Transaction t = new Transaction();

            System.out.println("Enter Transaction Amount");
            double amount = Double.parseDouble(sc.nextLine());
            t.setAmount(amount);

            System.out.println("Enter Location");
            String location = sc.nextLine();
            t.setLocation(location);

            System.out.println("Enter Transaction Status");
            String status = sc.nextLine();
            t.setStatus(status);

            System.out.println("Enter Transaction Date");
            String dateStr = sc.nextLine();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            try {
                t.setTransaction_date(df.parse(dateStr));
            } catch (Exception e) {
                System.out.println("Invalid date format, transaction not added.");
                continue;
            }

            System.out.println("Enter Receiver Account Id");
            long receiverId = Long.parseLong(sc.nextLine());
            t.setReceiver_account_id(receiverId);

            System.out.println("Enter Sender Account Id");
            long senderId = Long.parseLong(sc.nextLine());
            t.setSender_account_id(senderId);

            t.setId(id);
            id++;
            transactions.add(t);

            System.out.println("Do you want to add transaction[Y/N]?");
            choice = sc.nextLine();
        }

        int sortChoice = 0;
        while (sortChoice != 3) {
            System.out.println("1.Sort by transaction date");
            System.out.println("2.Sort by amount");
            System.out.println("3.Exit");
            System.out.println("Enter your choice:");
            sortChoice = Integer.parseInt(sc.nextLine());

            switch (sortChoice) {
                case 1:
                    Collections.sort(transactions, new DateComparator());
                    System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Transaction Id", "Amount",
                            "Location", "Status", "Transaction Date", "ReceiverId", "SenderId");
                    for (Transaction t : transactions) {
                        System.out.println(t.toString());
                    }
                    break;
                case 2:
                    Collections.sort(transactions, new AmountComparator());
                    System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Transaction Id", "Amount",
                            "Location", "Status", "Transaction Date", "ReceiverId", "SenderId");
                    for (Transaction t : transactions) {
                        System.out.println(t.toString());
                    }
                    break;
                case 3:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }

        sc.close();
    }
}
