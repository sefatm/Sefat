/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan08.io;

import java.io.*;

public class BufferedReader {

    public BufferedReader(FileReader fr) {
    }
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Sefat Mahmud\\Desktop\\ss.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            
            String sCurrentLine;
            
//            while((sCurrentLine = br.readLine()) != null){
//                System.out.println(sCurrentLine);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }           

    private boolean readLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
