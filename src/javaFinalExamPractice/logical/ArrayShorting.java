
package javaFinalExamPractice.logical;

import java.util.Arrays;

public class ArrayShorting {
    static int[][] a = {{3,1,2}, {5,4,6}, {8,9,7}};
    
    public static void main(String[] args) {

        for (int i = 0; i < a.length; i++) {
           Arrays.sort(a[i]);
           // int temp[] = a[i];
           // Arrays.sort(temp);
            
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
