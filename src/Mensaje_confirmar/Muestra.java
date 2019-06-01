/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje_confirmar;

import javax.swing.JOptionPane;

/**
 *
 * @author Lugue
 */
public class Muestra {
    public void mostrarQueHaras(){
         int x = JOptionPane.showConfirmDialog(null, "Que haras", "Titulo", JOptionPane.YES_NO_CANCEL_OPTION, 0);
        switch(x){
            case 0:
                JOptionPane.showMessageDialog(null, "Yesssssssssssss");
                break;
                
            case 1:
                JOptionPane.showMessageDialog(null, "No.......lolllllllllll");
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Cancelaste omgggggggg");
                break;
                
            case -1:
                JOptionPane.showMessageDialog(null, "La x????? wtf men");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Nadaaaaaaaa");
                break;
        }
        

       
    }
}
