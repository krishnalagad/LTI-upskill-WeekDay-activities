
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

import java.util.Set;

public class Problem1_SetExpenseManager_2 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Integer> numSet = new TreeSet<>();

        NumberSet numberSet = new NumberSet();

        System.out.println("Enter number of integers:");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            numberSet.insertElement(temp);
        }

        numSet = (TreeSet<Integer>) numberSet.getNumberSet();

        TreeSet<Integer> digitSumSet = new TreeSet<>();
        for (Integer x : numSet) {
            digitSumSet.add(numberSet.SortedSet(x));
        }

        System.out.println("Unique digit sum");
        digitSumSet.forEach(value -> System.out.println(value));
    }

}


class NumberSet {
    private Set<Integer> numberSet = new TreeSet<>();

    public NumberSet() {
        super();
    }

    public NumberSet(Set<Integer> numberSet) {
        super();
        this.numberSet = numberSet;
    }

    public void insertElement(Integer num) {
        numberSet.add(num);
    }

    public int SortedSet(int num) {
        int sum = 0;

        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public Set<Integer> getNumberSet() {
        return numberSet;
    }

    public void setNumberSet(Set<Integer> numberSet) {
        this.numberSet = numberSet;
    }

}