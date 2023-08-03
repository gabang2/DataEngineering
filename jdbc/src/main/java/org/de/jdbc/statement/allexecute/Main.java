package org.de.jdbc.statement.allexecute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/de-jdbc", "root", "admin1234");
        Statement stmt = con.createStatement();

        // executeUpdate
        int executeUpdateResult = stmt.executeUpdate("UPDATE product SET `price` = `price` + 10000 where id = 1");
        System.out.println(executeUpdateResult);

        // executeQuery
        ResultSet executeQueryResult = stmt.executeQuery("SELECT * FROM product limit 10");
        while (executeQueryResult.next()) {
            printRs(executeQueryResult);
        }

        // execute
        boolean executeResult = stmt.execute("SELECT * FROM product limit 10");
        if (!executeResult) {
            System.out.println(stmt.getUpdateCount());
        } else {
            ResultSet executeResultSet = stmt.getResultSet();
            while (executeResultSet.next()){
                printRs(executeResultSet);
            }
        }

        // batch
        stmt.addBatch("UPDATE product SET `price` = 1111 where id=1");
        stmt.addBatch("UPDATE product SET `price` = 2222 where id=2");
        stmt.addBatch("UPDATE product SET `price` = 9999 where id between 3 and 5 ");
        int[] results = stmt.executeBatch();
        for(int result : results) {
            if(result >= 0) {
                System.out.println("results of update : " + result);
            }
        }
    }

    private static void printRs(ResultSet rs) throws SQLException {
        System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
                + rs.getDate(3) + "  " + rs.getString(4)
                + "  " + rs.getInt(5));
    }
}
