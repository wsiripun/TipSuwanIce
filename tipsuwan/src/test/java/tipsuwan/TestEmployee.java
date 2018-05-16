package tipsuwan;

import com.erp.tipsuwan.db.dao.EmployeeDAO;

public class TestEmployee {
    public static void main(String[] args) {

    	EmployeeDAO employeeDAO = new EmployeeDAO();
    	System.out.println("TEST DiR");
    	employeeDAO.getAllEmployees();
    }

}
