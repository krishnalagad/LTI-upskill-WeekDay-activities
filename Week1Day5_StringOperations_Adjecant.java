import java.util.Scanner;

public class Week1Day5_StringOperations_Adjecant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next().trim();
        System.out.println("The processed string is " + separateAdjacentCharacters(str));
    }

    public static String separateAdjacentCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        char prevChar = 0;
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (currChar == prevChar) {
                sb.append("*");
            }
            sb.append(currChar);
            prevChar = currChar;
        }
        return sb.toString();
    }
}
