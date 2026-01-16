
package javaFinalExamPractice.oop.abstraction;

public class Abstraction1 extends B implements A {
     public static void main(String[] args) {
        Abstraction1 obj = new Abstraction1();
        obj.v();
        obj.v1();
        obj.v2();
        obj.v3();
    }
     
     @Override
    public void v() {
        System.out.println("I am Interface"); //To change body of generated methods, choose Tools | Templates.
    }
}

interface A{
    void v();
}

abstract class C{
    void v3(){
        System.out.println("Sefat Mahmud");
    }
    abstract void v1();
}

class B extends C{
    void v2(){
        System.out.println("Non-abstract method");
    }

    @Override
    void v1(){
        System.out.println("Abstract Method");
    }

    @Override
    void v3() {
        super.v3();
    }
    
}