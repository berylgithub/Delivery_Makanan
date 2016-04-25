/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverymakanan;

/**
 *
 * @author Yorozuya
 */
public class Customer extends Person implements java.io.Serializable{
    boolean state_member=false;
    String idcust;

    public Customer() {
        
    }
    
    public void setCustomer(String name, String address, String email, String phone, String username, String password, String idcust){
        this.name=name;
        this.address=address;
        this.email=email;
        this.phone=phone;
        this.username=username;
        this.password=password;
        this.idcust=idcust; 
   }
    
    public void setMember(){
        this.state_member=true;
    }
    public void removeMember(){
        this.state_member=false;
    }
    public boolean checkMember(){
        return state_member;
    }
    public Customer getCustomer(){
        return this;
    }
    
    public void removeCustomer(){
        
    }
}
