/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverymakanan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Yorozuya
 */
public class Driver implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    ArrayList<Branch> branch=new ArrayList<>();
    ArrayList<Customer> customer=new ArrayList<>();
    ArrayList<Item> item=new ArrayList<>();
    ArrayList<Staff> staff=new ArrayList<>();
    ArrayList<Order> order=new ArrayList<>();
    ArrayList<Jurnal> jurnal=new ArrayList<>();

    public Driver() {
    }
    
    public void createBranch(){
        ArrayList<Staff> st1=new ArrayList<>();
        ArrayList<Staff> st2=new ArrayList<>();
        
        st1.add(staff.get(0));
        st2.add(staff.get(3));
        Branch[] br=new Branch[2];
        br[0]=new Branch("b01", "jl Telekomunikasi no A12", st1, staff.get(1));
        br[1]=new Branch("b02", "jl Antareja No Z32", st2, staff.get(4));
        
        branch.addAll(Arrays.asList(br));
    }
    public void createCustomer(){
        Customer[] cust=new Customer[5];
        for(int i=0; i<cust.length; i++){
            cust[i]=new Customer();
            cust[i].setMember();
        }
        
        cust[0].setCustomer("Korosensei", "jl E no 1", "tako@gmail.com", "022334455", "korouser", "koropass", "c1");
        cust[1].setCustomer("Kishou Arima", "jl CCG no 99Z", "godofdeath@godmail.com", "undefined", "arimauser", "arimapass", "c2");
        cust[2].setCustomer("Lester Crest", "jl Los Santos no 011001", "crest@hackmail.com", "110100011010", "crestuser", "crestpass", "c3");
        cust[3].setCustomer("Juzou Suzuya", "jl CCG no 13Z", "jason13@gmail.com", "013131313", "suzuyauser", "suzuyapass", "c4");
        cust[4].setCustomer("Trevor Philips", "jl Los Santos no 3X", "wtfftw@gmail.com", "01932819283", "trevoruser", "trevorpass", "c5");
        
        customer.addAll(Arrays.asList(cust));
    }
    public void createItem(){
        Item[] it=new Item[5];
        it[0]=new Item("i1", "Nasi Goreng", 2, 10000);
        it[1]=new Item("i2", "Bawal Bakar", 1, 20000);
        it[2]=new Item("i3", "Gurame Asam Manis", 3, 40000);
        it[3]=new Item("i4", "Mie Goreng Seafood", 2, 25000);
        it[4]=new Item("i5", "Soup Ikan Spesial", 0, 45000);
        
        item.addAll(Arrays.asList(it));
    }
    public void createStaff(){
        Staff[] st=new Staff[5];
        for(int i=0; i<st.length; i++){
            st[i]=new Staff();
        }
        st[0].setStaff("Kardel", "Radiance Bottom 1", "kardel@sharpnel.com", "02265030", "kardel", "kardel", "s1");
        st[0].level="staff";
        st[1].setStaff("CJ", "Los Santos no A1", "CJ@thugmail.com", "02232323", "cj", "cj", "s2");
        st[1].level="manager";
        st[2].setStaff("Comstock", "New Columbia S12", "comprophet@columbia.com", "0999909", "comstock", "comstock", "s3");
        st[2].level="director";
        st[3].setStaff("Lanaya", "Dire Top 3", "templarassassin@meld.com", "0678768768", "lanaya", "lanaya", "s4");
        st[3].level="staff";
        st[4].setStaff("Gintoki", "Edo st no 11", "yorozuya@picknose.com", "092939892", "gintoki", "gintoki", "s5");
        st[4].level="manager";
        
        staff.addAll(Arrays.asList(st));
        
    }
    public void createOrder(){
        ArrayList<Item> it1=new ArrayList<>();
        ArrayList<Item> it2=new ArrayList<>();
        it1.add(item.get(0));
        it1.add(item.get(1));
        it1.add(item.get(2));
        it2.add(item.get(4));
        it2.add(item.get(3));
        
        Order[] od=new Order[2];
        System.out.println(branch.get(0).staff.get(0).idstaff);
        od[0]=new Order("01-01-2015","o1", it1, customer.get(0), branch.get(0).staff.get(0), branch.get(0), customer.get(0).address);
        od[0].sumPayment();
        od[1]=new Order("15-05-2015","o2", it2, customer.get(1), branch.get(1).staff.get(0), branch.get(1), customer.get(1).address);
        od[1].sumPayment();
        order.addAll(Arrays.asList(od));
        
    }
    public void createJurnal(){
        
    }
    public void saveData(Driver dr) throws FileNotFoundException, IOException{
        FileOutputStream f_out = new FileOutputStream("Database driver.data");
        ObjectOutputStream obj_out = new ObjectOutputStream (f_out);
        obj_out.writeObject (dr);
    }
    public Driver loadData() throws FileNotFoundException, IOException, ClassNotFoundException{
        Driver dr=null;
        FileInputStream f_in = new FileInputStream("Database driver.data");
        ObjectInputStream obj_in = new ObjectInputStream (f_in);
        Object obj = obj_in.readObject();
        if(obj instanceof Driver){
            dr=(Driver)obj;
        }
        return dr;
        
    }
    
    
//    public void saveBranch(){
//        
//    }
//    public void saveCustomer(){
//        
//    }
//    public void saveItem(){
//        
//    }
//    public void saveStaff(){
//        
//    }
//    public void saveOrder(){
//        
//    }
//    public void saveJurnal(){
//        
//    }
//    public void loadObject(){
//        
//    }
}
