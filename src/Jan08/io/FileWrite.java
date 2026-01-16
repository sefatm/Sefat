/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan08.io;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FileWrite {

    public static void main(String[] args) {

        String id, name;
        try {
            Formatter formatter = new Formatter("C:/Users/user/OneDrive/Desktop/Io.txt");

            Scanner input = new Scanner(System.in);
            System.out.print("How many Student: ");
            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.print("Enter Student Id and Name: ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id, name);
            }

            formatter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
