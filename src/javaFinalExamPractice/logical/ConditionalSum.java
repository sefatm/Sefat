/*
 Question:-08: Find out the Conditional Sum until input minus Integer.
 */
package javaFinalExamPractice.logical;

import java.util.Scanner;

public class ConditionalSum {
    public static void main(String[] args) {
        
        Scanner sc5 = new Scanner(System.in);
        int sum = 0;
        int num;
        
        System.out.println("Enter a Number: ");
        
        while (true) {            
            num = sc5.nextInt();
            if(num < 0){
                break;
            }
            sum += num;
        }
        System.out.print("Total Number: " + sum + " ");
        sc5.close();
    }
}
