import java.util.Scanner;

public class Week1Day2_Operators_TradeFair {
    public static void main(String[] args) {
        // Fill your code
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of people");
        int tot = sc.nextInt();

        int firstDay = (2 * tot) / 7;
        int secondDay = 2 * firstDay;
        int thirdDay = firstDay / 2;

        System.out.println("Number of attendees on day 1 : " + firstDay);
        System.out.println("Number of attendees on day 2 : " + secondDay);
        System.out.println("Number of attendees on day 3 : " + thirdDay);
    }
}
