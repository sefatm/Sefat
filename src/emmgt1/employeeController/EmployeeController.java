/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmgt1.employeeController;

import empmgt.model.Employee;
import empmgt.service.EmployeeService;

/**
 *
 * @author user
 */
public class EmployeeController {
    public Employee create(Employee e){
        EmployeeService es = new EmployeeService();
        Employee emp = es.save(e);
        return emp;
    }
}
