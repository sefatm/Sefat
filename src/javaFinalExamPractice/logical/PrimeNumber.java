/*
Question:-03: Find out the Prime number from n values.
 */
package javaFinalExamPractice.logical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int num = sc2.nextInt();
        
        boolean isPrime = true;
        
        if(num <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num% i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is Not a prime Number");
            }
            sc2.close();
        }
    }
}
