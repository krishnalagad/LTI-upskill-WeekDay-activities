package Week1.AssessmentCode;

import java.util.*;

public class AssessmentCode2 {
    public static int findNonRepeatingCharIndex(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.get(c) == 1) { // Check if character count is 1
                return i;
            }
        }
        return -1; // If no non-repeating character found, return -1
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine().trim();
        System.out.println(findNonRepeatingCharIndex(m));
    }
}
