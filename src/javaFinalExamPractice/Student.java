/*
1) Make the instance variables private so that they cannot be accessed directly from outside the class. You can only set and get values of these variables through the methods of the class.
 2) Have getter and setter methods in the class to set and get the values of the fields.
 */
package javaFinalExamPractice;

public class Student {
    private String name;
    private int aqe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAqe() {
        return aqe;
    }

    public void setAqe(int aqe) {
        this.aqe = aqe;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Aqe: " + aqe;
    }
    
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Sefat Mahmud");
        obj.setAqe(27);
        
        System.out.println(obj);
    }
}
