/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFinalExamPractice.oop.encapsulation;

/**
 *
 * @author user
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private int season;
    private String institution;

    public Student(int id, String name, int age, int season, String institution) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.season = season;
        this.institution = institution;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Season: " + season + ", Institution: " + institution;
    }
    
    public static void main(String[] args) {
        Student s = new Student(1010, "Sefat Mahmud", 27, 2025, "IDB");
        
        System.out.println(s);
    }
}
