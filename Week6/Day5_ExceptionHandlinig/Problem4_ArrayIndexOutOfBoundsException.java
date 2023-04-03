import java.util.*;

public class Problem4_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seats to be booked:");
        int no = sc.nextInt();
        int[] seats = new int[no];

        try {
            for (int i = 0; i < no; i++) {
                System.out.println("Enter the seat number " + (i + 1));
                int seat = sc.nextInt();
                if (seat <= 100) {
                    seats[i] = seat;
                } else {
                    throw new ArrayIndexOutOfBoundsException("100");
                }
            }
            System.out.println("The seats booked are:");
            for (int seatNo : seats) {
                System.out.println(seatNo);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
