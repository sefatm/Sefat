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
public class RenameFileExample {
    public static void main(String[] args) {
        
        File oldfile = new File("E:\\IO\\Sefat.txt");
        File newfile = new File("E:\\IO\\Mahmud.txt");
        
        if(oldfile.renameTo(newfile)){
            System.out.println("Rename successfull");
        } else {
            System.out.println("Rename failed");
        }
    }
}
