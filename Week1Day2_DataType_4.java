import java.util.Scanner;

public class Week1Day2_DataType_4 {
    public static void main(String[] args) {

        // Fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the event");
        String name = sc.nextLine();

        System.out.println("Enter the type of the event");
        String type = sc.next();

        System.out.println("Enter the number of people expected");
        int no = sc.nextInt();

        System.out.println("Is it a paid entry? (Type Y or N)");
        char ch = sc.next().charAt(0);

        System.out.println("Enter the projected expenses (in lakhs) for this event");
        double d = sc.nextDouble();

        System.out.println("Event Name : " + name.trim());
        System.out.println("Event Type : " + type.trim());
        System.out.println("Expected Count : " + no);
        System.out.println("Paid Entry : " + ch);
        System.out.println("Projected Expense : " + String.format("%.1f", d) + "L");

    }
}
