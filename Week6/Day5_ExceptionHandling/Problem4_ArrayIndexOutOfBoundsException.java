import java.util.*;

public class Problem4_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] seatArray = new int[100];
        Scanner scanner = new Scanner(System.in);

        // Get the number of seats to be booked from the user
        System.out.println("Enter the number of seats to be booked:");
        int numOfSeats = scanner.nextInt();

        // Get the seat numbers from the user and handle any exception that occurs
        for (int i = 0; i < numOfSeats; i++) {
            try {
                System.out.println("Enter the seat number " + (i + 1));
                int seatNumber = scanner.nextInt();

                // Check if the seat number is within the valid range
                if (seatNumber < 1 || seatNumber > 100) {
                    throw new ArrayIndexOutOfBoundsException("100");
                }

                // Book the seat
                seatArray[seatNumber - 1] = seatNumber;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }

        // Display all the tickets booked
        System.out.println("The seats booked are:");
        for (int seatNumber : seatArray) {
            if (seatNumber != 0) {
                System.out.println(seatNumber);
            }
        }
    }
}
