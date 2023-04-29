import java.sql.*;

class Main {
    public static void main(String[] krishna) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");

        DatabaseMetaData metaData = conn.getMetaData();
        ResultSet rs = metaData.getColumns(null, null, "customer_details", "%");

        System.out.println("ColumnName  TypeOfColumn");
        while (rs.next()) {
            String colName = rs.getString("COLUMN_NAME");
            String dataType = rs.getString("TYPE_NAME");
            String colSize = rs.getString("COLUMN_SIZE");
            System.out.println(colName + " (" + dataType + ") " + colSize);
        }
        rs.close();
        conn.close();
    }
}