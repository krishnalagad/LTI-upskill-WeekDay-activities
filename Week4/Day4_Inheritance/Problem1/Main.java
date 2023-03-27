package Problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Account Type");
        System.out.println("1.Savings Account\n2.Current Account");
        int choice = sc.nextInt();

        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println(
                        "Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
                String[] savingAccDetails = sc.nextLine().trim().split(",");
                SavingsAccount sAcc = new SavingsAccount(savingAccDetails[0], savingAccDetails[1], savingAccDetails[2],
                        savingAccDetails[3]);
                sAcc.display();
                break;

            case 2:
                System.out.println(
                        "Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
                String[] currentAccountDetails = sc.nextLine().trim().split(",");
                CurrentAccount cAcc = new CurrentAccount(
                        currentAccountDetails[0],
                        currentAccountDetails[1],
                        currentAccountDetails[2],
                        currentAccountDetails[3]);
                cAcc.display();
                break;
            default:
                System.out.println("Choose Account Type");
                System.out.println("1.Savings Account\n2.Current Account");
                choice = sc.nextInt();
                break;
        }
    }
}