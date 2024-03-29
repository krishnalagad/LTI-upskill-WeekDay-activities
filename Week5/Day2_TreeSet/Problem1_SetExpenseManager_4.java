
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Problem1_SetExpenseManager_4 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<String> flightSet = new TreeSet<>();

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            list.add(temp);

            String arr[] = temp.split("\\|");
            flightSet.add(arr[0]);
        }

        System.out.println("Flights and Passengers in ascending order");
        for (String flight : flightSet) {

            System.out.println(flight);

            TreeSet<Passenger> nameList = new TreeSet<>();
            for (String s : list) {
                String arr[] = s.split("\\|");

                if (arr[0].equals(flight)) {
                    nameList.add(new Passenger(arr[1]));
                }
            }
            nameList.forEach(name -> System.out.println("--" + name.getName()));

        }

    }

}

class Passenger implements Comparable<Passenger> {
    private String name;

    public Passenger(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Passenger p) {
        return this.getName().toLowerCase().compareTo(p.getName().toLowerCase());
    }

}