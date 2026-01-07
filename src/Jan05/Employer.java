/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan05;

/**
 *
 * @author user
 */
public class Employer {
    private int id;
    private String name;
    private double capital;
    
    
    
    Employer(int id, String name, double capital){
        this.id = id;
        this.name = name;
        this.capital = capital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    
    
    
    void show(){
        System.out.println(id + " " + name + " " + capital);
    }
}
