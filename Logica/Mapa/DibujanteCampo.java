/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.Mapa;

import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author dmora
 */
public class DibujanteCampo implements ElementoDibujable{
     
    // remove final con new acá
    //public static final int TamañoCuadricula = 15;

    public JLabel refLabel;
    public JLayeredPane refContenedor;

    public DibujanteCampo (JLayeredPane panel)
    {
        refContenedor = panel;
        refLabel = new JLabel();
        refContenedor.add(refLabel,1);
        // agregar evento al dar clic
        refLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animar();
            }            
        });
    }
    
    @Override
    public void pintar(String URL) {
        ImageIcon iconLogo = new ImageIcon(this.getClass().getResource(URL));
        refLabel.setIcon(iconLogo);
        refLabel.update(refLabel.getGraphics());
        
    }

    @Override
    public void animar() {
       this.refLabel.setText("X");
    }

    @Override
    public void posiciona(Point posicion) {
        // se coloca el label en el panel
         //TODO hacer que se dibuje el suelo
        refLabel.setLocation((int)posicion.getX()*TamañoCuadricula, (int)posicion.getY()*TamañoCuadricula);
        refLabel.setSize(TamañoCuadricula, TamañoCuadricula);
    }
    
    
    @Override
    public JLabel getRefLabel() {
        return refLabel;
    }

    @Override
    public void disminuirPosicionZ() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
