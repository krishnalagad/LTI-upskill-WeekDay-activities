
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Day2_SetIntroduction_6 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        System.out.println("Enter the number of values in list 1");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            set1.add(Integer.parseInt(br.readLine()));
        }

        System.out.println("Enter the number of values in list 2");
        int m = Integer.parseInt(br.readLine());

        System.out.println("Enter the values");
        for (int i = 0; i < m; i++) {
            set2.add(Integer.parseInt(br.readLine()));
        }

        System.out.println("Set 1");
        set1.forEach(value -> System.out.println(value));

        System.out.println("Set 2");
        set2.forEach(value -> System.out.println(value));

        set1.addAll(set2); // Union
        Set<Integer> unionSet = new LinkedHashSet<>(set1);

        System.out.println("Union");
        unionSet.forEach(value -> System.out.println(value));
    }

}