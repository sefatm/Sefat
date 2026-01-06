/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgt.model;

/**
 *
 * @author user
 */
public class Employee {
    private int id;
    private String fname;
    private String lname;
    private String designation;
    private String Department;
    private double salary;
    private int age;
    private String address;

    public Employee(int id, String fname, String lname, String designation, String Department, double salary, int age, String address) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.designation = designation;
        this.Department = Department;
        this.salary = salary;
        this.age = age;
        this.address = address;
    }
    
    public Employee(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
