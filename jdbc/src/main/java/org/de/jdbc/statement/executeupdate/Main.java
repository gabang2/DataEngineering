package org.de.jdbc.statement.executeupdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/de-jdbc", "root", "admin1234");
        Statement stmt = con.createStatement();
//        int result = stmt.executeUpdate("UPDATE product SET `price` = `price` + 10000 where id = 1");
//        System.out.println("result of update one record : " + result);
//        int multiResult = stmt.executeUpdate("UPDATE product SET `price` = `price` - 10000 where `name` like 'shoes%'");
//        System.out.println("result of update one record : " + multiResult);

        int result = stmt.executeUpdate("UPDATE product SET `price` = `price` + 10000 WHERE id='1222222222'");
        System.out.println("result of update one record : " + result);
    }
}
