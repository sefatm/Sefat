/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFinalExamPractice.exceptionHandling;

/**
 *
 * @author user
 */
public class ExceptionArithmetic {
    public static void main(String[] args) {
        
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Connot divide by Zero");
        }
    }
}
