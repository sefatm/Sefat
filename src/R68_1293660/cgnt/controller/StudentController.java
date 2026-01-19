/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package R68_1293660.cgnt.controller;

import R68_1293660.cgnt.service.StudentService;
import R68_1293660.cgnt.ui.Student;

/**
 *
 * @author Sefat Mahmud
 */
public class StudentController {
    public Student create(Student s){
        StudentService ss = new StudentService();
        Student s1 = ss.save(s);
        return s1;
    }
}
