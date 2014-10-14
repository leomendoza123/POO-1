/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.OrganizacionPrograma;

import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class Administrador extends Jugador{
    
    public Administrador(Credencial miCredencial){
    super(miCredencial);
    }
    
    public Administrador(ArrayList<String> partidasDelJugador,Credencial miCredencial){
    super(partidasDelJugador,miCredencial);
    }
    
    public Administrador(ArrayList<String> partidasDelJugador){
    super(partidasDelJugador);
    }
    
    public static void crearUnaNuevaCreatura(){}
    
    public static void eliminarUnaCreatura(){}
    
    public static void crearOro(){}
    
}
