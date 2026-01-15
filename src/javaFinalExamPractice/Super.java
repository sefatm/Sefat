/*
Create a class with a method that prints â€œThis is parent classâ€� and its subclass with another method that prints â€œThis is child classâ€�. Now, create an object for each of the class and call
1.	Method of parent class by object of parent class
2.	Method of child class by object of child class
3.	Method of parent class by object of child class.
 */
package javaFinalExamPractice;

public class Super {
    public void SuperMethod(){
        System.out.println("This is a Parent class");
    }
}

class Sub extends Super{
    public void SubMethod(){
        System.out.println("This is a Child class");
    }
}

class Test{
    public static void main(String[] args) {
        Super obj = new Super();
        obj.SuperMethod();
        
        Sub obj1 = new Sub();
        obj1.SubMethod();
        obj1.SuperMethod();
    }
}