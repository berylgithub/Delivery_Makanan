/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverymakanan;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Yorozuya
 */
public class Branch implements java.io.Serializable{
    String idbranch, address;
    ArrayList<Staff> staff=new ArrayList<>(); 
    Staff manager;

    public Branch() {
    }

    
    public Branch(String idbranch, String address, ArrayList<Staff> staff, Staff manager) {
        this.idbranch = idbranch;
        this.address = address;
        this.staff=staff;
        this.manager = manager;
    }
    
    public void addStaff(Staff staff){
        this.staff.add(staff);
    }
    
    public void setManager(Staff manager){
        this.manager=manager;
    }
    
    public void removeStaff(){
        
    }
    public void removeManager(){
        
    }
}
