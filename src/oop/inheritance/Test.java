/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.inheritance;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.supermethod();
        obj.submethod();
        
        Super obj1 = new Super();
        obj1.v();
    }
}
