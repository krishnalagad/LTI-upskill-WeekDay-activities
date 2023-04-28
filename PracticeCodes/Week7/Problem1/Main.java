package Problem1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        try {
            FileWriter fw = new FileWriter("array.txt");
            for (int i = 0; i < n; i++) {
                fw.write(arr[i] + " ");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        try {
            FileReader fr = new FileReader("array.txt");
            System.out.println(MinElement.getMinValue(fr));
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

class MinElement {
    public static int getMinValue(FileReader fr) throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        try {
            fr = new FileReader("array.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                list.add(sc.nextInt());
            }
            fr.close();
        } catch (Exception e) {

        }
        return Collections.min(list);
    }
}
