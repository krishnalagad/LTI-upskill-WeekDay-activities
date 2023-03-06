import java.util.Scanner;

public class Week1Day3_Looping_Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int term = 3; // first term of the series
        System.out.print(term); // print the first term
        for (int i = 1; i < n; i++) {
            term = term * 2 + 1; // generate the next term
            System.out.print(term + " "); // print the term
        }
        sc.close();
    }
}
