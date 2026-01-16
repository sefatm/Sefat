/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFinalExamPractice.empmgt;

/**
 *
 * @author user
 */
public class Employee {
    private int id;
    private String fname;
    private String lname;
    private String designation;
    private String department;
    private int age;
    private double salary;
    private String address;

    public Employee(int id, String fname, String lname, String designation, String department, int age, double salary, String address) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.designation = designation;
        this.department = department;
        this.age = age;
        this.salary = salary;
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
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
}
