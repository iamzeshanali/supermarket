/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author zeesh
 */
public class ParentBilling {
    
    public String ProductId;
    public String ProductName;
    public String Manufacturer;
    public String Imported;
    
    public double cTax;
   
    
    public double cFindTax(double cAmount){
        
    double FindTax = cAmount-(cAmount * cTax);
        return (FindTax);
}
    private JFrame frame;
    public void iExitSystem(){
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Billing System",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }
    
    public void NumbersOnly(java.awt.event.KeyEvent evt){
    
        char iNumber = evt.getKeyChar();
          if(!(Character.isDigit(iNumber)) 
                  || (iNumber == KeyEvent.VK_BACK_SPACE)
                  || (iNumber == KeyEvent.VK_DELETE)){
                  evt.consume();
          } 
    }
    
}

