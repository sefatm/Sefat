/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmgt1.employeeDAO;


import emmgt1.EmployeeUI.EmployeeUI;
import emmgt1.model.Employee;
import emmgt1.util.BDConnection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class EmployeeDAO {
    public Employee insert(Employee e){
        int id = e.getId();
        String fname = e.getFname();
        String lname = e.getLname();
        String designation = e.getDesignation();
        String department = e.getDepartment();
        double salary = e.getSalary();
        int age = e.getAge();
        String address = e.getAddress();
        String sql = "INSERT INTO EMPLOYEE (fName, lName, designation, department, salary, age, address) VALUES ('"+fname+"', '"+lname+"', '"+designation+"', '"+department+"', '"+salary+"', '"+age+"', '"+address+"')";
        
        try {
            Connection con = BDConnection.getConnection();
            Statement stmt = con.createStatement();
            int status = stmt.executeUpdate(sql);
            
            if(status > 0){
                System.out.println("Inserted");
                JOptionPane.showMessageDialog(new EmployeeUI(), "Inserted");
            } else {
                System.out.println("fail");
            }
            
        } catch (Exception e1) {
            System.out.println(e1);
        }
        return e;
    }
}
