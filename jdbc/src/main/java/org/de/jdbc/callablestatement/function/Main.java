package org.de.jdbc.callablestatement.function;

import org.de.jdbc.resultset.pojomapping.ResultSetMapper;

import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/de-jdbc", "root", "admin1234");

        // Function 사용해보기
        CallableStatement callableFunction = con.prepareCall("{? = call add_event_prefix(?)}");
        String originalString = "original";
        callableFunction.setString(2, originalString);
        callableFunction.registerOutParameter(1, Types.VARCHAR);
        boolean result = callableFunction.execute();
        System.out.println(result);
        System.out.println(callableFunction.getString(1));

        // SQL문에서 Function 사용해보기
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select `id`, add_event_prefix(`name`), `updated_at`, `contents`, `price` from product LIMIT 10");
        while(rs.next()){
            ResultSetMapper.printRs(rs);
        }
    }
}
