package Problem1_Tickets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of bookings");
        int n = scanner.nextInt();
        List<TicketBooking> ticketBookings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter customer name");
            String customerName = scanner.next();
            System.out.println("Enter number of tickets");
            int noOfTickets = scanner.nextInt();
            System.out.println("Enter the price");
            double price = scanner.nextDouble();
            ticketBookings.add(new TicketBooking(customerName, noOfTickets, price));
        }
        scanner.close();

        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        ticketBookings.stream()
                .sorted(Comparator.comparingDouble(TicketBooking::getPrice))
                .forEach(System.out::println);
    }
}