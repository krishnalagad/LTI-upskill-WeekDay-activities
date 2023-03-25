import java.util.*;

class Hall {
    private String name;
    private String contactNumber;
    private Double costPerDay;
    private String ownerName;

    public String getName() {
        return name;
    }

    public Hall() {
    }

    public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%-20s", name, contactNumber, costPerDay, ownerName);
    }
}

class HallBO {
    List<Hall> list = new ArrayList<Hall>();

    public HallBO() {
        list.add(new Hall("SPK hall", "12345", 10000.0, "John"));
        list.add(new Hall("DRG hall", "67890", 15000.0, "Joe"));
        list.add(new Hall("EFG hall", "45678", 20000.0, "Jack"));
    }

    public List<Hall> getHallList() {
        return list;
    }

    public void add(Hall hall) {
        list.add(hall);
        System.out.println("Hall added successfully");
    }

    public void set(int hallNumber, Hall hall) {
        if (hallNumber <= list.size() && hallNumber > 0) {
            list.set(hallNumber - 1, hall);
            System.out.println("Hall replaced successfully");
        } else {
            System.out.println("Invalid hall number");
        }
    }

    public void displayAll(List<Hall> hallList) {
        System.out
                .println(String.format("%-20s%-20s%-20s%-20s", "Name", "Contact Number", "Cost per Day", "Owner Name"));
        for (Hall h : hallList) {
            System.out.println(String.format("%-20s%-20s%-20s%-20s", h.getName(), h.getContactNumber(),
                    h.getCostPerDay(), h.getOwnerName()));
        }
    }
}

public class Day1_IntroductionToList_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
