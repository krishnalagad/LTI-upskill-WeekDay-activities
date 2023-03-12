import java.util.*;

public class MockAssesment {
    // main method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Float> list = new ArrayList<Float>();
        for (int i = 0; i < size; i++)
            list.add(sc.nextFloat());

        int pos = sc.nextInt();
        float data = sc.nextFloat();

        list.add(pos - 1, data);
        for (float f : list)
            System.out.print(f + " ");
        System.out.println();
        Set<Float> set = new HashSet<Float>();
        for (float f : list)
            if (!set.add(f))
                System.out.println(f);
    }
}
