/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.Mapa;


import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dmora
 */
public interface ElementoDibujable {
    
    public static final int TAMANO = 32;
    public void pintar();
    public void animar();
    public void posiciona(Point posicion);
    public JLabel getRefLabel();
    
}
