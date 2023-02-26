import java.util.Scanner;

public class Week1Day2_Operators_HelpMess{
    public static void main(String[] args) {
        // Fill your code
        Scanner sc = new Scanner(System.in);

        System.out.println("Cost of item:");
        int cost = sc.nextInt();
        System.out.println("Number of items:");
        int items = sc.nextInt();

        System.out.println("Total cost is Rs." + (cost * items));
    }
}