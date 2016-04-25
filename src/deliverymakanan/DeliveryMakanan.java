/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverymakanan;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Yorozuya
 */
public class DeliveryMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception ex) {
            }
        }
        Driver dr=new Driver();
        dr.createCustomer();
        dr.createItem();
        dr.createStaff();
        dr.createBranch();
        dr.createOrder();
        
        try {
            dr.saveData(dr);
        } catch (IOException ex) {
            Logger.getLogger(DeliveryMakanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        try {
//            dr=dr.loadData();
//        } catch (IOException ex) {
//            Logger.getLogger(DeliveryMakanan.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DeliveryMakanan.class.getName()).log(Level.SEVERE, null, ex);
//        }
        UserHome uh=new UserHome(dr);
        StaffForm sf=new StaffForm(dr);
        uh.setVisible(true);
        sf.setVisible(true);
    }
    
}
