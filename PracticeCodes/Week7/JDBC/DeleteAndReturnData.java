import java.sql.*;
import java.io.*;

class Main {
    public static void main(String[] krishna) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bookName = br.readLine().trim();

        String query = "DELETE FROM book WHERE name = ?;";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, bookName);
        int rowsAffected = stmt.executeUpdate();

        query = "SELECT * FROM book;";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String auth = rs.getString("author");
            System.out.println(id + " " + name + " " + auth);
        }

        rs.close();
        stmt.close();
        conn.close();

    }
}