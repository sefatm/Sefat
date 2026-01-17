
package javaFinalExamPractice.logical;

import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int per = sc.nextInt();
        
        if(per >= 90){
            System.out.println("Grade: A+");
        } else if (per >= 70){
            System.out.println("Grade: A");
        } else if (per >= 60){
            System.out.println("Grade: B");
        } else {
            System.out.println("Failed");
        }
        sc.close();
    }
}
