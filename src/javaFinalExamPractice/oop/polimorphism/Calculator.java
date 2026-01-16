
package javaFinalExamPractice.oop.polimorphism;


public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(5.5, 15.5));
        System.out.println(c.add(10, 20, 30));
    }
    
    public int add(int a, int b){
        return a + b;
    }
    
    public double add(double a, double b){
        return a + b;
    }
    
    public int add(int a, int b, int c){
        return a + b + c;
    }
}

class Shape{
    public void draw(){
        System.out.println("Drawing a Shape");
    }
    
    void v(){
        System.out.println("v");
    }
}

class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Drawing a Circle"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void v() {
        System.out.println("V Circle"); //To change body of generated methods, choose Tools | Templates.
    }
    
    void v1(){
        System.out.println("V1");
    }
}

class Test{
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        s.v();
        
        Shape s1 = new Circle();
        s1.draw();
        s1.v();
        
        Circle s2 = new Circle();
        s2.draw();
        s2.v();
        s2.v1();
    }
}