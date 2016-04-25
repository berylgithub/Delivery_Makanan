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
public class Item implements java.io.Serializable{
    String iditem, name;
    int stock;
    long price;

    public Item(String iditem, String name, int stock, long price) {
        this.iditem = iditem;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
    
    public void addStock(int stock){
        this.stock=this.stock+stock;
    }
    public void subStock(int stock){
        this.stock=this.stock-stock;
    }
    public Item getItem(){
        return this;
    }
    public void removeItem(){
        
    }
}
