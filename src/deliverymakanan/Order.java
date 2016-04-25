/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverymakanan;

import java.util.ArrayList;

/**
 *
 * @author Yorozuya
 */
public class Order implements java.io.Serializable {
    String orderdate, delivereddate, deliveredtime, idorder, address;
    ArrayList<Item> item=new ArrayList<>();
    Customer cust;
    Staff deliverystaff;
    Branch branch;
    long totalpayment;
    boolean stateDelivered, statePayment;
    public Order() {
    }

    
    public Order(String orderdate, String idorder, ArrayList<Item> item, Customer cust, Staff deliverystaff, Branch branch, String address) {
        this.orderdate = orderdate;
        this.idorder = idorder;
        this.item = item;
        this.cust = cust;
        this.deliverystaff = deliverystaff;
        this.branch = branch;
        this.address=address;
        sumPayment();
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }


    public String getDelivereddate() {
        return delivereddate;
    }

    public void setDelivereddate(String delivereddate) {
        this.delivereddate = delivereddate;
    }

    public String getDeliveredtime() {
        return deliveredtime;
    }

    public void setDeliveredtime(String deliveredtime) {
        this.deliveredtime = deliveredtime;
    }

    public String getIdorder() {
        return idorder;
    }

    public void setIdorder(String idorder) {
        this.idorder = idorder;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void addItem(Item item) {
        this.item.add(item);
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public Staff getDeliverystaff() {
        return deliverystaff;
    }

    public void setDeliverystaff(Staff deliverystaff) {
        this.deliverystaff = deliverystaff;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public long getTotalpayment() {
        return totalpayment;
    }

    public void setTotalpayment(long totalpayment) {
        this.totalpayment = totalpayment;
    }
    
    public void setDeliverState(){
        this.stateDelivered=true;
    }
    public void setPaymentState(){
        this.statePayment=true;
    }
    public void sumPayment(){
        for(int i=0; i<item.size(); i++){
            this.totalpayment=this.totalpayment+item.get(i).price;
        }
        
    }
    public void removeOrder(){
        
    }
}
