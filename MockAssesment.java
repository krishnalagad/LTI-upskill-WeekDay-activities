import java.util.*;

public class MockAssesment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        List<Float> list = new ArrayList<Float>();
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++)
            list.add(sc.nextFloat());

        System.out.println("Enter position to enter element:");
        int pos = sc.nextInt();
        System.out.println("Enter data to insert:");
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
