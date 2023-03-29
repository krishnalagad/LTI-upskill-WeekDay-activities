import java.util.ArrayList;
import java.util.Scanner;

public class Day1_IntroductionToList_10 {
    static ArrayList<Flight> flights = new ArrayList<Flight>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\n1.Schedule Flight\n2.Change Status\n3.Display\n4.Exit");
            System.out.println("Enter your options:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addFlightDetails(sc);
                    break;
                case 2:
                    updateFlightStatus(sc);
                    break;
                case 3:
                    displayFlightDetails();
                    break;
                case 4:
                    flag = false;
                    System.out.println("You are logged-out");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid option!");
            }
        }
    }

    private static void addFlightDetails(Scanner sc) {
        sc.nextLine(); // clear buffer
        boolean flag = true;
        int i = 1;
        while (flag) {
            System.out.println("Enter the flights details " + i + ":");
            System.out.println("Enter the flight name:");
            String flightName = sc.nextLine();
            System.out.println("Enter the flight number:");
            String flightNumber = sc.nextLine();
            System.out.println("Enter the Status:");
            String flightStatus = sc.nextLine();
            flights.add(new Flight(flightName, flightNumber, flightStatus));
            System.out.println("Do you want to add more flight(Yes/No):");
            String addMore = sc.nextLine();
            if (!addMore.equalsIgnoreCase("yes")) {
                flag = false;
            } else {
                i += 1;
            }
        }
    }

    private static void updateFlightStatus(Scanner sc) {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the flight number:");
            int flightNumber = sc.nextInt();
            System.out.println("Enter the new status:");
            sc.nextLine(); // clear buffer
            String newStatus = sc.nextLine();
            flights.get(flightNumber - 1).setFlightStatus(newStatus);
            System.out.println("Do you want to change status(Yes/No):");
            String changeMore = sc.nextLine();
            if (!changeMore.equalsIgnoreCase("yes")) {
                flag = false;
            }
        }
    }

    private static void displayFlightDetails() {
        System.out.println("Flight Status");
        for (int i = 0; i < flights.size(); i++) {
            System.out.println((i + 1) + " " + flights.get(i).getFlightStatus());
        }
    }
}

class Flight {
    private String flightName;
    private String flightNumber;
    private String flightStatus;

    public Flight(String flightName, String flightNumber, String flightStatus) {
        this.flightName = flightName;
        this.flightNumber = flightNumber;
        this.flightStatus = flightStatus;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }
}
