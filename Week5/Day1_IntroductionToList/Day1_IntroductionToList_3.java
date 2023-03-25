import java.util.*;

class ItemType {
    private String name;
    private double deposit;
    private double costPerDay;

    public ItemType(String name, double deposit, double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s", name, deposit, costPerDay);
    }
}

public class Day1_IntroductionToList_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ItemType> itemTypes = new ArrayList<>();
        String continueChoice;

        do {
            System.out.println("Enter the details of Item Type " + (itemTypes.size() + 1));
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Deposit:");
            double deposit = sc.nextDouble();
            System.out.println("Cost per Day:");
            double costPerDay = sc.nextDouble();
            sc.nextLine();

            ItemType itemType = new ItemType(name, deposit, costPerDay);
            itemTypes.add(itemType);

            System.out.println("Do you want to continue?(y/n)");
            continueChoice = sc.nextLine();
        } while (continueChoice.equalsIgnoreCase("y"));

        System.out.printf("%-20s%-20s%-20s\n", "Name", "Deposit", "CostPerDay");
        for (ItemType itemType : itemTypes) {
            System.out.println(itemType);
        }
    }
}
