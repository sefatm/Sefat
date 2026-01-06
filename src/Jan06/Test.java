/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

/**
 *
 * @author Sefat Mahmud
 */
public class Test {
    public static void main(String[] args) {
        Trainee t = new Trainee(new Address("Rampura", 1200));
        Trainee t1 = new Trainee(new Address("Palton", 1210));
        Trainee t2 = new Trainee(new Address("Motijheel", 1220));
        
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);
        
        for (Object object : t2) {
            
        }
    }
}
