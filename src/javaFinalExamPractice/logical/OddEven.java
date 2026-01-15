/*
 Question:-09: Find out the Odd-even number among n number of values.
 */
package javaFinalExamPractice.logical;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc6 = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc6.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is a Even Number.");
        } else {
            System.out.println(num + " is a Odd Number.");          
        }
        sc6.close();
    }
}
