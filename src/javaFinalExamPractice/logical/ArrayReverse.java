/*
 Question:-05: Sort the Array in Reverse order.
 */
package javaFinalExamPractice.logical;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        
        System.out.print("Array in total input: ");
        int n = sc3.nextInt();
        
        int[] d = new int[n];
        
        System.out.println("Enter a Number: ");
        for (int i = 0; i < n; i++) {
            d[i] = sc3.nextInt();
        }
        Arrays.sort(d);
        System.out.print("Array in Reverse: ");
        for (int i = d.length -1; i >= 0; i--) {
            System.out.print(d[i] + " ");
        }
        sc3.close();
    }
}
