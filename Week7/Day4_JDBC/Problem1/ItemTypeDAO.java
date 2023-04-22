package Problem1;

import java.util.*;
import java.sql.*;

public class ItemTypeDAO {
    public List<ItemType> getAllItemTypes() throws ClassNotFoundException, SQLException {
        List<ItemType> l = new ArrayList<ItemType>();
        Connection con = DbConnection.getConnection();
        Statement ps = con.createStatement();
        String query = "select * from item_type";
        ResultSet rs = ps.executeQuery(query);
        while (rs.next()) {
            l.add(new ItemType(rs.getLong("id"), rs.getString("name"), rs.getDouble("deposit"),
                    rs.getDouble("cost_per_day")));
        }
        return l;
    }
}
