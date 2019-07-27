package project.employeerest.controller;

import project.employeerest.model.Employee;
import project.employeerest.service.ConnectionBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmployeeController {
    public static Employee getEmployee(String paramId) throws SQLException, ClassNotFoundException {

        int id = Integer.parseInt(paramId);
        Connection con = ConnectionBase.get();
        Employee employee = null;
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE ID = ? AND Status = 1");
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            while(result.next()){
                employee = new Employee(id, result.getString("FirstName"),
                        result.getString("MiddleInitial"), result.getString("LastName"),
                        result.getDate("DateOfBirth").toLocalDate(),
                        result.getDate("DateOfEmployment").toLocalDate(),
                        result.getBoolean("Status"));
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

    public static List<Employee> getEmployees() throws SQLException, ClassNotFoundException {
        List<Employee> employees = new ArrayList<>();
        Connection con = ConnectionBase.get();
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE Status = 1");
            ResultSet result = ps.executeQuery();
            while(result.next()){
                employees.add(new Employee(result.getInt("ID"), result.getString("FirstName"),
                        result.getString("MiddleInitial"), result.getString("LastName"),
                        result.getDate("DateOfBirth").toLocalDate(),
                        result.getDate("DateOfEmployment").toLocalDate(),
                        result.getBoolean("Status")));
            }
        }catch(SQLException ex){
            try {
                throw new SQLException(ex);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return employees;
    }

    public static String deleteEmployee(String paramId, String Authheader) throws SQLException, ClassNotFoundException {
        if(Authheader.equals("true")) {
            int id = Integer.parseInt(paramId);
            Connection con = ConnectionBase.get();
            try {
                PreparedStatement ps = con.prepareStatement("UPDATE employee SET Status = 0 WHERE ID = ? AND Status = 1");
                ps.setInt(1, id);
                int result = ps.executeUpdate();

                if(result == 0){
                    return "Already deleted";
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return "Fail";
            }
            return "Success";
        }else
            return "Failed authorization";
    }
}

