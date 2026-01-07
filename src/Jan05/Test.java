/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan05;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        
        Set<Employer> set = new HashSet<>();
        
        set.add(new Employer(101, "Sefat", 10000.00));
        set.add(new Employer(102, "Jayed", 12000.00));
        set.add(new Employer(103, "Mahadi", 14000.00));
        
        for(Employer e : set){
            e.show();
        }
    }
}
