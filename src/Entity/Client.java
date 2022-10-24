/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author pupil
 */
public class Client {
    private String firstname;
    private String lastname;
    private String cash;
    
    public Client() {
    }

    public Client(String firstname, String lastname, String cash){
        this.firstname = firstname;
        this.lastname = lastname;
        this.cash = cash;
   
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Client{" + "firstname=" + firstname 
                + ", lastname=" + lastname 
                + ", cash=" + cash 
                + '}';
    }
    
}
