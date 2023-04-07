import java.io.*;
import java.util.InputMismatchException;

public class Problem2_InputMismatchException {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter an integer input");
            int no = Integer.parseInt(br.readLine());
            System.out.println("Entered value is " + no);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
