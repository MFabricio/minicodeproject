package project.employeerest.service;

import java.sql.*;

public class ConnectionBase {
    private static Connection cnx = null;
    public static Connection get() throws SQLException, ClassNotFoundException {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/minicodeprojectdb", "root", "");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return cnx;
    }
    public static void close() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
}
