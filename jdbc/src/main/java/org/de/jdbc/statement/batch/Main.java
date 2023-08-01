package org.de.jdbc.statement.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/de-jdbc", "root", "admin1234");
        Statement stmt = con.createStatement();
        stmt.addBatch("UPDATE product SET `price` = `price` + 10000 where id = 1");
        stmt.addBatch("UPDATE product SET `price` = `price` + 2000000 where id = 2");
        int[] results = stmt.executeBatch();

        for(int result : results) {
            if(result >= 0) {
                System.out.println("result of update: " + result);
            }
        }
    }
}
