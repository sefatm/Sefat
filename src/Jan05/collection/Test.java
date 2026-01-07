/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan05.collection;

import java.util.*;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
    
        Employee e = new Employee(101, "Sefat", 27, new SalaryStructure(10000.0, 15000.0, 20000.0, "Normal", 1000.0), new EmployeeAddress("Rampura", 54, "Mohanagar", 1200));
        Employee e1 = new Employee(102, "Mahmud", 28, new SalaryStructure(11000.0, 16000.0, 21000.0, "Normal", 1100.0), new EmployeeAddress("Palton", 55, "Kakrail", 1210));
        Employee e2 = new Employee(103, "Naeem", 29, new SalaryStructure(12000.0, 17000.0, 22000.0, "Normal", 1200.0), new EmployeeAddress("Gulshan", 56, "Badda", 1220));
        
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
        
        System.out.println("--------------List---------------");
        
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(e);
        emp.add(e1);
        emp.add(e2);
        
        for (int i = 0; i < emp.size(); i++) {
            System.out.println(i + "" + emp.get(i));
        }
        
        System.out.println(".............Second Way..............");
        
        for (Employee emp1 : emp) {
            System.out.println(emp1);
        }
        
        System.out.println("----------Set-----------");
        
        Set set = new LinkedHashSet();
        
            set.add(e);
            set.add(e1);
            set.add(e2);
            
            for (Object set1 : set) {
                System.out.println(set1);
        }
            
            System.out.println("-------------Map-------------");
            
            Map map = new HashMap();
            
            map.put("A", e);
            map.put("B", e1);
            map.put("C", e2);
            
            System.out.println(map.get("B"));
    }
}
