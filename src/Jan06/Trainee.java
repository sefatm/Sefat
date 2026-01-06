/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06;

/**
 *
 * @author Sefat Mahmud
 */
public class Trainee {
    
    private Address address;

    public Trainee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Trainee{" + "address=" + address + '}';
    }
    
}
