/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.TiposGuerrero;

import Logica.Mapa.DibujanteCreaturas;
import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dmora
 */
public abstract class Guerrero extends Thread  {
    
    // atributos
    int fuerza;
    int resistencia;
    public Point posicion = new Point(0,0); 
    public ElementoDibujable dibujante; 
    // 
    
    JLabel refLabel;
    JPanel refContenedor;
    Mapa refMapa; 
    
    // refJuego
    boolean detener = false;

    public Guerrero(int fuerza, int resistencia, JLabel refLabel, JPanel refContenedor, Mapa refMapa, ElementoDibujable dibujante) {
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.refLabel = refLabel;
        this.refContenedor = refContenedor;
        this.refMapa = refMapa; 
        this.dibujante = dibujante;  
    }


    
    
    
    @Override
    public abstract void run();
    public abstract void atacar();
    public abstract void mover();
    public abstract void pegar();
    
    public void detener()
    {
        this.detener = true;
    }
    
}

