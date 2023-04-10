package Problem1_CountVowels;
import java.io.*;

public class Main {
    public static void main(String[] args)  {
        int ch, vowelCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

            while ((ch = br.read()) != -1) {
                char c = (char) ch;
                if (isVowel(c)) {
                    vowelCount += 1;
                }
            }
            System.out.println("The number of vowels present in file is: " + vowelCount);
        } catch (Exception e) {
            System.out.println("");
        } 
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}