/*
Question:-01: Find out the Fibonacci number.
 */
package javaFinalExamPractice.logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        int first = 0;
        int second = 1;
        
        System.out.println("Fibonacci: " + a);
        
        for (int i = 0; i < a; i++) {
            System.out.println(" " + first);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
