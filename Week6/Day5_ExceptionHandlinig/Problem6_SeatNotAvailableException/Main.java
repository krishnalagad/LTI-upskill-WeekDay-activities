package Problem6_SeatNotAvailableException;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the number of rows and columns of the show:");
            int n = Integer.parseInt(reader.readLine());
            int[][] seats = new int[n][n];

            System.out.println("Enter the number of seats to be booked:");
            int numSeats = Integer.parseInt(reader.readLine());

            for (int i = 0; i < numSeats; i++) {
                System.out.println("Enter the seat number " + (i + 1));
                int seatNum = Integer.parseInt(reader.readLine());

                if (seatNum < 0 || seatNum >= n * n) {
                    throw new ArrayIndexOutOfBoundsException(""+seatNum);
                }

                int row = seatNum / n;
                int col = seatNum % n;

                if (seats[row][col] == 1) {
                    throw new SeatNotAvailableException("Already Booked");
                }

                seats[row][col] = 1;
            }

            System.out.println("The seats booked are:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (SeatNotAvailableException e) {
            System.out.println(e.toString());
        }
    }
}