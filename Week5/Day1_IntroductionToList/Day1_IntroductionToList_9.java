
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Day1_IntroductionToList_9 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter the number of passengers Booked");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Enter the passenger's name who Booked");
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        System.out.println("Enter the number of seats available");
        int seatsAvailable = Integer.parseInt(br.readLine());

        System.out.println("Extra Passengers list\n");
        String ans[] = new String[n - seatsAvailable];

        for (int i = seatsAvailable, j = 0; i < n; i++, j++) {
            ans[j] = list.get(i);
        }
        System.out.print(Arrays.toString(ans));
    }

}