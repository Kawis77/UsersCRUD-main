package utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DbUtil {

    private static DataSource dataSource;

    public static Connection getConnection() throws SQLException {

        return getInstance().getConnection();   }

    private static DataSource getInstance() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (dataSource == null) {

            try {

                Context initContext = new InitialContext();

                Context envContext = (Context)initContext.lookup("java:/comp/env");

                dataSource = (DataSource)envContext.lookup("jdbc/users");

            } catch (NamingException e) { e.printStackTrace(); }
        }
        return dataSource;
    }
}