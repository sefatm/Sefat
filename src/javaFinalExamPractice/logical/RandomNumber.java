/*
 Question:-07: Find out the ten unique Random Numbers.
 */
package javaFinalExamPractice.logical;

import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        
        while (set.size() < 3){
            int number = random.nextInt(14);
            set.add(number); 
        }
        System.out.println("Unique random number: " + set);
    }
}
