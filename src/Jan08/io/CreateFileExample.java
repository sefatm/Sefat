/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan08.io;

import java.io.File;

/**
 *
 * @author Sefat Mahmud
 */
public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\IO\\Sefat.txt");
            if(file.createNewFile()){
                System.out.println("File is created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
