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
public class Jurnal implements java.io.Serializable{
    String idjurnal, month;
    ArrayList<Order> order=new ArrayList<>();
    double income=0, expend=0, balance=0;

    public Jurnal() {
    }

    public Jurnal(String idjurnal, ArrayList<Order> order) {
        this.idjurnal = idjurnal;
        this.order = order;
    }
    
    public void calIncome(){
        for(int i=0; i<order.size(); i++){
            this.income=this.income+order.get(i).totalpayment;
        }
    }
    
    public void calExpend(){
        for(int i=0; i<order.size(); i++){
            Order tempod=new Order();
            tempod=order.get(i);
            if(tempod.statePayment==false){
                this.expend=this.expend+tempod.totalpayment;
            }
        }
    }
    public void calBalance(){
        balance=income-expend;
    }
}
