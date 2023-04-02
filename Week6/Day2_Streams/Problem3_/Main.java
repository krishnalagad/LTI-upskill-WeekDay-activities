package Problem3_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Expenses> expensesList = new ArrayList<>();

        System.out.println("Enter expense for food");
        expensesList.add(new Expenses("food", sc.nextDouble()));

        System.out.println("Enter expense for rent");
        expensesList.add(new Expenses("rent", sc.nextDouble()));

        System.out.println("Enter expense for shopping");
        expensesList.add(new Expenses("shopping", sc.nextDouble()));

        System.out.println("Enter expense for groceries");
        expensesList.add(new Expenses("groceries", sc.nextDouble()));

        System.out.println("Enter expense for electricity");
        expensesList.add(new Expenses("ebBill", sc.nextDouble()));

        System.out.println("Enter salary");
        Double salary = sc.nextDouble();

        Double totalExpenses = expensesList.stream()
                .map(Expenses::getCost)
                .reduce(0.0, Double::sum);

        if (totalExpenses > salary) {
            System.out.println("Expenses exceeds Salary");
        } else {
            Double savings = salary - totalExpenses;
            System.out.println("Savings amount will be Rs." + savings);
        }

        sc.close();
    }
}
