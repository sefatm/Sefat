/*
Question:-03: Find out the Prime number from n values.
*/
package javaFinalExamPractice.logical;

import java.util.Scanner;


public class PrimeNumber1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        
        boolean prime = true;
        if(n <= 1) prime = false;
        
        for (int i = 2; i < n / 2; i++) {
            if(n % i == 0){
                prime = false;
                break;
            }
        }
        System.out.println(prime ? n + " is a Prime Number." : n + " is a Not-Prime Number.");
    }
}
