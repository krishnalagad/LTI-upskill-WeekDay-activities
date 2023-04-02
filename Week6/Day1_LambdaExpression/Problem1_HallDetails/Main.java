import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of halls:");
        // int n = sc.nextInt();
        // sc.nextLine();
        int n = Integer.parseInt(br.readLine());

        List<Hall> halls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // String input = sc.nextLine().trim();
            String input = br.readLine().trim();
            String[] details = input.split(",\\s*");
            Hall hall = new Hall(details[0].trim(), Double.parseDouble(details[1].trim()), details[2].trim());
            halls.add(hall);
        }

        System.out.printf("%-15s %-10s %s\n", "Name", "Cost", "Owner");
        halls.stream().sorted((a, b) -> a.getOwner().compareTo(b.getOwner()))
                .forEach(x -> System.out.format("%-15s %-10s %s\n", x.getName(), x.getCostPerDay(), x.getOwner()));
    }
}