/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.OrganizacionPrograma;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Jose
 */
public  class  MemoriaDePrograma implements Serializable{
    public ArrayList<Jugador> jugadores;
    
    public MemoriaDePrograma(){
    jugadores = new ArrayList<Jugador>();
    }
    
    public void RegistrarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
}
