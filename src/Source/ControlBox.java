/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import static Frames.Login.btnClose;

import javax.swing.ImageIcon;


/**
 *
 * @author Dhanuka Perera
 */
public class ControlBox {
    
    
    public  void test()
    {
        ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/close_hover.png"));
        btnClose.setIcon(changeIcon);
        
    }
    
   
    
}
