
package javaFinalExamPractice.exceptionHandling;

import java.util.Scanner;

public class ExceptionArithmetic1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter a Number: ");
            int n = sc.nextInt();
            int result = 10/n;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        }
    }
}
