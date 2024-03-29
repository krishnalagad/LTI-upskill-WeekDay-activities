package Problem2_SuperMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n1. Exhibition event\n2. Stage event");
        int choice = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the details of " + (choice == 1 ? "exhibition" : "stage event") + ":");
        String[] eventDetails = sc.nextLine().split(",");
        String name = eventDetails[0];
        String detail = eventDetails[1];
        String type = eventDetails[2];
        String ownerName = eventDetails[3];
        double costPerDay = Double.parseDouble(eventDetails[4]);
        int attribute = Integer.parseInt(eventDetails[5]);
        Event event = null;
        if (choice == 1) {
            event = new Exhibition(name, detail, type, ownerName, costPerDay, attribute);
        } else {
            event = new StageEvent(name, detail, type, ownerName, costPerDay, attribute);
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter the starting date of the event:");
        LocalDate startDate = LocalDate.parse(sc.nextLine(), formatter);
        System.out.println("Enter the ending date of the event:");
        LocalDate endDate = LocalDate.parse(sc.nextLine(), formatter);
        double totalCost = event.getCostPerDay() * ChronoUnit.DAYS.between(startDate, endDate);
        double gst = choice == 1 ? 0.05 * totalCost : 0.15 * totalCost;
        System.out.printf("The GST to be paid is Rs.%.1f", gst);
    }
}
