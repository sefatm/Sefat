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
public class DeleteFileExample {
   
    public static void main(String[] args) {
        try {
            File newFile = new File("E:\\IO\\Mahmud.txt");

            if (newFile.delete()) {
                System.out.println("Delete successful.");
            } else {
                System.out.println("Delete failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
   
