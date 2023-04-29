import java.io.*;
import java.sql.*;

class Main {
    public static void main(String[] krishna) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");

        DatabaseMetaData metaData = conn.getMetaData();
        ResultSet rs = metaData.getTables(null, null, "%", new String[] { "TABLE" });

        System.out.println("Tables List:");
        while (rs.next()) {
            String tableName = rs.getString("TABLE_NAME");
            System.out.println(tableName);
        }

        rs.close();
        conn.close();
    }
}