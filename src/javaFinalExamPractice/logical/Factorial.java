/*
Question:-02: Find out the Factorial number from n values.
 */
package javaFinalExamPractice.logical;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int b = sc1.nextInt();
        
        long fact = 1;
        
        for (int i = 1; i <= b; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
        
    }
}
