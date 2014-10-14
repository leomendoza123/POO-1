/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.OrganizacionPrograma;
import java.io.Serializable;
import java.util.ArrayList;
import Logica.TiposGuerrero.*;

/**
 *
 * @author Jose
 */
public class Partida implements Serializable {
    private int oro;
    private int nivelDelJugador;
    private ArrayList<ElementoJugable> ejercito;
    
    public Partida(int oro, int nivelDelJugador, ArrayList<ElementoJugable> ejercito){
   // this.oro = oro;
   // this.nivelDelJugador = nivelDelJugador;
   // this.ejercito = ejercito;
    setOro(oro);
    setNivelDelJugador(nivelDelJugador);
    setEjercito(ejercito);
    }
    
    public void setOro(int pOro){
    oro = pOro;
    }
    
    public void setNivelDelJugador(int pNivelDelJugador){
    nivelDelJugador = pNivelDelJugador;
    }
    
    public void setEjercito(ArrayList<ElementoJugable> pEjercito){
    ejercito = pEjercito;
    }
    
    public int getOro(){
    return this.oro;
    }
    
    public int getNivelDelJugador(){
    return this.nivelDelJugador;
    }
    
    public ArrayList<ElementoJugable> getGuerreros(){
    return this.ejercito;
    }
}
