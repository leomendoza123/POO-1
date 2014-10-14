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
public class Jugador implements Serializable{
    
    //ArrayList<Partida> partidasDelJugador = new ArrayList<Partida>();
    //Credencial miIdentificacion = new Credencial();
   //ArrayList<Partida> partidasDelJugador;
    ArrayList<String> partidasDelJugador;
    Credencial miIdentificacion;
    
   public Jugador(){
   partidasDelJugador = new ArrayList<String>();
   miIdentificacion = new Credencial();
    }
   
   public Jugador(Credencial miIdentificacion){
   this.miIdentificacion = miIdentificacion;
   this.partidasDelJugador = new ArrayList<String>();
   }
   
   public Jugador(ArrayList<String> partidasDelJugador){
   this.partidasDelJugador = partidasDelJugador;
   miIdentificacion = new Credencial();
   }
   
   public Jugador(ArrayList<String> partidasDelJugador, Credencial miIdentificacion){
   this.partidasDelJugador = partidasDelJugador;
   this.miIdentificacion = miIdentificacion;
   }
   
   public void insertarDireccionPartida(String dirPartida){
   partidasDelJugador.add(dirPartida);
   }
   
   public  ArrayList<String> getPartidasDelJugador(){
   return this.partidasDelJugador;
   }
   
   public Credencial getCredencial(){
   return this.miIdentificacion;
   }
}
