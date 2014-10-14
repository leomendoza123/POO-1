/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.TiposGuerrero;
import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import java.awt.Point;

/**
 *
 * @author dmora
 */
public abstract class ElementoJugable extends Thread  {
    
    // atributos
    int fuerza;
    int resistencia;
    public Point posicion = new Point(0,0); 
    private ElementoDibujable dibujante;
    Mapa refMapa; 
    public String URLapariencia;
    
    // refJuego
    boolean detener = false;

    public ElementoJugable(int fuerza, int resistencia, Mapa refMapa, String URLapariencia) {
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.refMapa = refMapa;
        this.URLapariencia = URLapariencia; 
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

    /**
     * @return the dibujante
     */
    public ElementoDibujable getDibujante() {
        return dibujante;
    }

    /**
     * @param dibujante the dibujante to set
     */
    public void setDibujante(ElementoDibujable dibujante) {
        this.dibujante = dibujante;
    }
    
}

