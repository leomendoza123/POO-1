/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.TiposGuerrero;

import Logica.Mapa.DibujanteCreaturas;
import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import java.awt.Color;
import java.awt.Point;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dmora
 */
public class GuerreroAereo extends ElementoJugable{

   boolean flag;
    
    public GuerreroAereo(int fuerza, int resistencia, JLabel refLabel, JPanel refContenedor, Mapa refMapa, ElementoDibujable dibujante) {
        super(fuerza, resistencia, refMapa, null);
        dibujante.posiciona(posicion);
        flag = false;
    }

    @Override
    public void run() {
        while (!detener)
        {
            
               
            try {
               
                    sleep(500);
                    
                    atacar();
                    
                
                
                
            } catch (InterruptedException ex) {}
        }
        
    }

    @Override
    public void pegar() {
        

        
    }

    
    
    @Override
    public void atacar() {

        
    }

    @Override
    public void mover() {
        posicion.x ++;
        getDibujante().posiciona(posicion);
        
    }
    
}
