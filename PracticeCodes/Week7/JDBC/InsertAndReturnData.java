import java.io.*;
import java.sql.*;

class Main {
    public static void main(String[] krishna) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");

        String query = "INSERT INTO STUDENT VALUES (?, ?, ?);";
        PreparedStatement stmt = conn.prepareStatement(query);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int resultCount = 0;

        for (int i = 0; i < size; i++) {
            int id = Integer.parseInt(br.readLine());
            String name = br.readLine();
            int avg = Integer.parseInt(br.readLine());

            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, avg);

            resultCount += stmt.executeUpdate();
        }
        Statement qStmt = conn.createStatement();
        String getQuery = "SELECT * FROM STUDENT;";
        ResultSet rs = qStmt.executeQuery(getQuery);

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int avg = rs.getInt("average_marks");
            System.out.println(id + " " + name + " " + avg);
        }
    }
}
