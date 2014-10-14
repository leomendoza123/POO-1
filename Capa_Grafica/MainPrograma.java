/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capa_Grafica;
import Capa_Datos.ManejadorDeArchivos;
import Logica.OrganizacionPrograma.*;
import Logica.TiposGuerrero.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
/**
 *
 * @author Jose
 */
public class MainPrograma {
    public static MemoriaDePrograma memoriaDePrograma; //estatico para tener acceso global para logeo u otras acciones 
    public static ArrayList<ElementoJugable> personajesJugables = new ArrayList<ElementoJugable>(); //Personajes jugables disponibles para el menu y clonacion
    public static Administrador administradorPrincipalPrograma;
    public static Jugador jugadorPrincipalPrograma;
    public static Partida partidaPrincipalPrograma;
    public static int indexGuardado;
    
    public static void main(String args[]){
        
        //try {
          
            //MemoriaDePrograma memoriaDePrograma = new MemoriaDePrograma();
           
        /*
         try {
            
            ManejadorDeArchivos.inicializarArchivos();
            Credencial credencial = new Credencial("juan","aaa");
            Jugador player1 = new Jugador(credencial);
            ArrayList<ElementoJugable> ejercito1 = new ArrayList();
            Partida partida1 = new Partida(0,1,ejercito1);
            ManejadorDeArchivos.grabarObjeto("programfiles/Partidas/partida1.txt", partida1);
            player1.insertarDireccionPartida("programfiles/Partidas/partida1.txt");
            memoriaDePrograma.jugadores.add(player1);
            ManejadorDeArchivos.grabarObjeto("programfiles/MemoriaPrograma.txt",memoriaDePrograma);
           
            /*
            //////////
            Object memorium = ManejadorDeArchivos.leerObjeto("programfiles/MemoriaPrograma.txt");
            memoriaDePrograma = (MemoriaDePrograma) memorium;
            System.out.println(memoriaDePrograma.jugadores.get(0).getCredencial().getNombreUsuario());
            System.out.println(memoriaDePrograma.jugadores.get(0).getCredencial().getPasswordUsuario());
            System.out.println(memoriaDePrograma.jugadores.get(0).getPartidasDelJugador().get(0));
            
            Object memorium2 = ManejadorDeArchivos.leerObjeto(memoriaDePrograma.jugadores.get(0).getPartidasDelJugador().get(0));
            Partida partida1 = (Partida) memorium2;
            System.out.println(partida1.getOro());
            System.out.println(partida1.getNivelDelJugador());
            
            } catch (Exception ex) {
            Logger.getLogger(MainPrograma.class.getName()).log(Level.SEVERE, null, ex);
            }
         */
          /*
            Object memoria = ManejadorDeArchivos.leerObjeto("programfiles/MemoriaPrograma.txt");
            //MemoriaDePrograma memoria2 = (MemoriaDePrograma) memoria;
            if(memoria == null){
            memoriaDePrograma = new MemoriaDePrograma(); 
            System.out.println("Se parte con el programa en blanco");
            }
            else{
            memoriaDePrograma = (MemoriaDePrograma) memoria;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPrograma.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
       
       ManejadorDeArchivos.inicializarArchivos();//Se carga todo el contenido necesario desde los archivos
        /*
        File dir = new File("programfiles/creaturas");
        if(!dir.exists()){
        System.out.println("Directorio TRUFA");
        }
        else{
        String[] ficheros = dir.list();
        if (ficheros == null)
            System.out.println("No hay ficheros en el directorio especificado");
        else { 
               for (int x=0;x<ficheros.length;x++)
                System.out.println(ficheros[x]);
             }
        
        }*/
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaBienvenida().setVisible(true);
            }
        });
        
        
    }

}
