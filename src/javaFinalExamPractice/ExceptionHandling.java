/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFinalExamPractice;

/**
 *
 * @author user
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        
        try {
            int value = 30;
            if(value < 40)
                throw new Exception("value is too small");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Continue after the catch block");
    }
}
