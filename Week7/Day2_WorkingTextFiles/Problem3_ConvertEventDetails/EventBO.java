package Problem3_ConvertEventDetails;

import java.io.*;

public class EventBO {
    public static void saveToFile(Event event) {
        try {
            File file = new File("event.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            if (!file.exists()) {
                file.createNewFile();
            }
            bw.write("Event details");
            bw.write("Event name:" + event.getName());
            bw.write("Event details:" + event.getDetails());
            bw.write("Event manager:" + event.getManager());
            bw.close();
        } catch (Exception e) {
            
        }

    }
}
