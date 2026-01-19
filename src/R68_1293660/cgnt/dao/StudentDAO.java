/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package R68_1293660.cgnt.dao;

import R68_1293660.cgnt.ui.Student;
import R68_1293660.cgnt.ui.StudentUI;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import R68_1293660.cgnt.util.DBConnection;


public class StudentDAO {
    public Student insert(Student s){
        int id = s.getId();
        String name = s.getName();
        String subject = s.getSubject();
        double marks = s.getMarks();
        double fees = s.getFees();
        String sql = "INSERT INTO student (name, subject, marks, fees) VALUES ( '"+name+"', '"+subject+"', '"+marks+"', '"+fees+"')";
        
        try {
            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            int status = stmt.executeUpdate(sql);
            
            if(status > 0){
                System.out.println("Inserted");
                JOptionPane.showMessageDialog(new StudentUI(), "Inserted");
            } else {
                System.out.println("fail");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }
}
