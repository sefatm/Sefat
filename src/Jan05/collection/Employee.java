/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan05.collection;

/**
 *
 * @author user
 */
public class Employee {
    private int id;
    private String employeeName;
    private Integer age;
    private SalaryStructure salary;
    private EmployeeAddress address;

    public Employee(int id, String employeeName, Integer age, SalaryStructure salary, EmployeeAddress address) {
        this.id = id;
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SalaryStructure getSalary() {
        return salary;
    }

    public void setSalary(SalaryStructure salary) {
        this.salary = salary;
    }

    public EmployeeAddress getAddress() {
        return address;
    }

    public void setAddress(EmployeeAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Id=" + id + ", EmployeeName= " + employeeName + ", Age= " + age + ", " + salary + ", " + address;
    }
    
    
    
}

class EmployeeAddress{
    private String address;
    private int road;
    private String area;
    private int postalCode;

    public EmployeeAddress(String address, int road, String area, int postalCode) {
        this.address = address;
        this.road = road;
        this.area = area;
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoad() {
        return road;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address: " + address + ", Road: " + road + ", Area: " + area + ", PostalCode: " + postalCode; //To change body of generated methods, choose Tools | Templates.
    } 
}

class SalaryStructure{
    private double minSalary;
    private double currentSalary;
    private double maxSalary;
    private String incrementType;
    private double incrementValue;

    public SalaryStructure(double minSalary, double currentSalary, double maxSalary, String incrementType, double incrementValue) {
        this.minSalary = minSalary;
        this.currentSalary = currentSalary;
        this.maxSalary = maxSalary;
        this.incrementType = incrementType;
        this.incrementValue = incrementValue;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getIncrementType() {
        return incrementType;
    }

    public void setIncrementType(String incrementType) {
        this.incrementType = incrementType;
    }

    public double getIncrementValue() {
        return incrementValue;
    }

    public void setIncrementValue(double incrementValue) {
        this.incrementValue = incrementValue;
    }

    @Override
    public String toString() {
        return "MinSalary= " + minSalary + ", CurrentSalary= " + currentSalary + ", MaxSalary= " + maxSalary + ", IncrementType= " + incrementType + ", IncrementValue= " + incrementValue;
    }
}
