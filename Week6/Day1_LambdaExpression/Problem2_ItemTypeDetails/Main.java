package Problem2_ItemTypeDetails;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of item types:");
        int n = Integer.parseInt(br.readLine());

        List<ItemType> itemTypes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine().trim();
            String[] details = input.split(",");
            ItemType itemType = new ItemType(details[0].trim(), Double.parseDouble(details[1].trim()),
                    Double.parseDouble(details[2].trim()));
            itemTypes.add(itemType);
        }

        Comparator<ItemType> comparator = (ItemType a, ItemType b) -> a.getName().compareTo(b.getName());
        Collections.sort(itemTypes, comparator);

        System.out.printf("%-10s %-10s %s\n", "Name", "Cost", "Deposit");
        for (ItemType itemType : itemTypes) {
            System.out.printf("%-10s %-10s %s\n", itemType.getName(), itemType.getCostPerDay(), itemType.getDeposit());
        }
    }
}