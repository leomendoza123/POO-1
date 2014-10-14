/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.TiposGuerrero;

import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author leoanardo
 */
public class Defensor extends ElementoJugable{

    public Defensor(int fuerza, int resistencia,  Mapa refMapa, String UrlApariencia) {
        super(fuerza, resistencia, refMapa, UrlApariencia);
    }

    @Override
    public void run() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pegar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
