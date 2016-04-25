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
public class Staff extends Person implements java.io.Serializable{
    String level, idstaff;
    public Staff() {
    }

    public void setStaff(String name, String address, String email, String phone, String username, String password, String idstaff){
        this.name=name;
        this.address=address;
        this.email=email;
        this.phone=phone;
        this.username=username;
        this.password=password;
        this.idstaff=idstaff;
    }
    public void removeStaff(){
        
    }
    public void editStaff(){
        
    }
    public Staff getStaff(){
        return this;
    }
    public void checkLevel(){
        
    }
}
