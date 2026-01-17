/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFinalExamPractice.exceptionHandling;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExceptionHandling1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two integer Number: ");
        int number = input.nextInt();
        int number1 = input.nextInt();
        
        try {
            int value = number;
            if(value < number1)
                throw new Exception("Value is too Small");
            else
                throw new Exception("Value is too Big");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Continue after the catch block");
    }
}
