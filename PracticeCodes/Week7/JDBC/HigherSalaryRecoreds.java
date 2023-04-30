import java.sql.*;
import java.io.*;

class Main {
    public static void main(String[] krishna) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double salary = Double.parseDouble(br.readLine());

        String query = "SELECT * FROM EMPLOYEE WHERE Salary >= ?;";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setDouble(1, salary);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            Double gSalary = rs.getDouble("Salary");
            System.out.println(id + " " + name + " " + gSalary);
        }

        rs.close();
        stmt.close();
        conn.close();
    }
}