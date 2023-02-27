import java.util.Scanner;

public class Week1Day5_StringOperations_TextToSMS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        text = text.replace("yes", "s");
        text = text.replace("you", "u");
        text = text.replace("today", "2day");
        text = text.replace("why", "y");

        System.out.println(text);
    }

}
