package com.erp.tipsuwan.db.dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.erp.tipsuwan.db.common.DbUtil;
import com.erp.tipsuwan.db.model.Employee;


public class EmployeeDAO {
	private Connection connection = null;
	
	public List<Employee> getAllEmployees() {
        List<Employee> orders = new ArrayList<Employee>();
        try {
        	connection = DbUtil.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from Employees");
            while (rs.next()) {
            	Employee employee = new Employee();
            	employee.setEmployeeID(rs.getInt("employeeID"));
            	employee.setActive(rs.getBoolean("active"));
            	employee.setPassword(rs.getString("password"));
            	employee.setUserRole(rs.getString("userRole"));
            	employee.setFirstName(rs.getString("firstName"));
            	employee.setLastName(rs.getString("lastName"));
            	
            	System.out.println("============");
            	System.out.println(employee.toString());

            	System.out.println();
            	System.out.println();
            	

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;           

    }	

}
