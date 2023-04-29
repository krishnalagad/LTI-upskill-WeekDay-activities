
import java.sql.*;
import java.io.*;

class Main {
    public static void main(String[] krishna) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
        
        String query = "INSERT INTO student VALUES (?, ?, ?, ?, ?);";
        PreparedStatement stmt = conn.prepareStatement(query);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(int i = 0; i < size; i++) {
            int roll = Integer.parseInt(br.readLine());
            String name = br.readLine();
            int mark1 = Integer.parseInt(br.readLine());
            int mark2 = Integer.parseInt(br.readLine());
            int mark3 = Integer.parseInt(br.readLine());
            
            stmt.setInt(1, roll);
            stmt.setString(2, name);
            stmt.setInt(3, mark1);
            stmt.setInt(4, mark2);
            stmt.setInt(5, mark3);
            
            result += stmt.executeUpdate();
        }
        System.out.println(result);
    }
}