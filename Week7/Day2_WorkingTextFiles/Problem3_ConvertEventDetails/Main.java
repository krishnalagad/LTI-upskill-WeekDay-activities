package Problem3_ConvertEventDetails;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the event name");
        String name = br.readLine().trim();
        System.out.println("Enter the event details");
        String details = br.readLine().trim();
        System.out.println("Enter the event manager");
        String manager = br.readLine().trim();

        EventBO.saveToFile(new Event(name, details, manager));
    }
}
