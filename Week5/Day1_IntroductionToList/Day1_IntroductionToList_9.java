import java.util.*;

public class Day1_IntroductionToList_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> passengers = new ArrayList<String>();

        System.out.println("Enter the number of passengers Booked");
        int numPassengers = sc.nextInt();

        System.out.println("Enter the passenger's name who Booked");
        for (int i = 0; i < numPassengers; i++) {
            passengers.add(sc.next());
        }

        System.out.println("Enter the number of seats available");
        int numSeats = sc.nextInt();

        if (numPassengers > numSeats) {
            ArrayList<String> extraPassengers = new ArrayList<String>();
            extraPassengers.addAll(passengers.subList(numSeats, numPassengers));
            System.out.println("Extra Passengers list\n" + extraPassengers);
            passengers.removeAll(extraPassengers);
            numPassengers = numSeats;
        }

        // System.out.println("Final list of passengers: " + passengers);
    }
}
