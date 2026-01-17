/*
Create a class with a method that prints â€œThis is parent classâ€� and its subclass with another method that prints â€œThis is child classâ€�. Now, create an object for each of the class and call
1.	Method of parent class by object of parent class
2.	Method of child class by object of child class
3.	Method of parent class by object of child class.
 */
package javaFinalExamPractice;

public class Parent {
    public void ParentMethod(){
        System.out.println("This is a Parent class");
    }
}

class Child extends Parent{
    public void ChildMethod(){
        System.out.println("This is a Child class");
    }
}

class Test{
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.ParentMethod();
        
        Child obj1 = new Child();
        obj1.ChildMethod();
        obj1.ParentMethod();
    }
}