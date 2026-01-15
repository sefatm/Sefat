/*
 Question:-06: Find out the Max-Min number among n number of values.
 */
package javaFinalExamPractice.logical;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc4 = new Scanner(System.in);
        
        System.out.println("Enter a Length: ");
        int m = sc4.nextInt();
        
        int[] arr = new int[m];
        System.out.println("Enter a Number");
        
        for (int i = 0; i < m; i++) {
            arr[i] = sc4.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < m; i++) {
            if(arr[i] > max){
                max = arr[i];
            } if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Miximum Number: " + max + "\n");
        System.out.println("Minimum Number: " + min + "\n");
    }
}
