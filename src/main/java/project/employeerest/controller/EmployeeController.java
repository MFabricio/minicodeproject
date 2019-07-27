package project.employeerest.controller;

import project.employeerest.model.Employee;
import project.employeerest.service.ConnectionBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeController {
    public static Employee getEmployee(String paramId) throws SQLException, ClassNotFoundException {

        int id = Integer.parseInt(paramId);
        Connection con;
        con = ConnectionBase.get();
        Employee employee = null;
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE ID = ?");
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            while(result.next()){
                employee = new Employee(id, result.getString("FirstName"),
                        result.getString("MiddleInitial"), result.getString("LastName"),
                        result.getDate("DateOfBirth").toLocalDate(),
                        result.getDate("DateOfEmployment").toLocalDate(),
                        result.getBoolean("status"));
            }
        }catch(SQLException ex){
            try {
                throw new SQLException(ex);
            } catch (SQLException e) {
                    e.printStackTrace();
            }
        }
        return employee;
    }
}

