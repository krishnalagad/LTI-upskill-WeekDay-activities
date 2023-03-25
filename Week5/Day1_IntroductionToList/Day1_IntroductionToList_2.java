import java.util.*;

public class Day1_IntroductionToList_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> halls = new ArrayList<String>();

        System.out.println("Enter the number of halls:");
        int no = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < no; i++) {
            System.out.println("Enter the Hall Name " + (i+1));
            String hall = sc.nextLine().trim();
            halls.add(hall);
        }
        System.out.println("Enter the hall name to be searched:");
        String hallName = sc.nextLine().trim();

        if (halls.contains(hallName)) {
            int index = halls.indexOf(hallName);
            System.out.println(hallName + " hall is found in the list at position " + index);
        } else {
            System.out.println(hallName + " hall is not found");
        }
    }
}
