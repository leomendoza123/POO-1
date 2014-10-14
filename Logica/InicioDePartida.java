/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Mapa.Mapa;
import Logica.OrganizacionPrograma.Partida;
import Logica.TiposGuerrero.Defensor;
import Logica.TiposGuerrero.AtaqueContacto;
import Logica.TiposGuerrero.ElementoJugable;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author leoanardo
 */
public class InicioDePartida {
    private Mapa mapa;
    Partida PartidaActual; 
    boolean MODOTEST = false; /// SI ES TRUE NO USA LOS DATOS EN "PartidaActual", crea mouestos propios

    public InicioDePartida(Partida partidaPrincipalPrograma) {
        PartidaActual = partidaPrincipalPrograma; 
        if (partidaPrincipalPrograma==null){
            MODOTEST = true; 
        }
        
    }
    
    public void setMapa(Mapa pMapa){
        mapa = pMapa;
    }
    
    public void IniciarCreaturasAtaque (){
         int x, y;
        Random rdm = new Random(); 
        
        if (MODOTEST){
        for (int i = 0; i < 40; i++) {
            AtaqueContacto creatura = new AtaqueContacto(1, "/Sonidos/espada.wav", "Leo", "/Imagenes/dragon.gif" ,1, 1, 1, 1, 1, 1, mapa,null); 
            mapa.AgregaElementoAtacante(creatura);
               x = rdm.nextInt(Mapa.cuadriculaAncho);
               y = rdm.nextInt(Mapa.cuadriculaAlto);
            creatura.posicion = new Point(x, y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia());
        }
        }
        else {
            for (ElementoJugable  creatura : PartidaActual.getGuerreros()) {
               mapa.AgregaElementoAtacante(creatura);
               x = rdm.nextInt(Mapa.cuadriculaAncho);
               y = rdm.nextInt(Mapa.cuadriculaAlto);
               creatura.posicion = new Point(x, y); 
               creatura.getDibujante().posiciona(creatura.getPosicion());
               creatura.getDibujante().pintar(creatura.getURLapariencia());   
            }
        }
        
        
        
        
        
    }
    
    
    public void IniciarCreaturasDefensa() {
     
          int x, y;
        Random rdm = new Random(); 
        for (int i = 0; i < 10; i++) {
         
          
            Defensor creatura = new Defensor(true, true, 1, 1, "Test", "/Imagenes/DefensaMuro.gif", 1, 1, 1, 1, 1, 3, mapa,null);
            mapa.AgregaElementoDefensor(creatura); 
               x = rdm.nextInt(Mapa.cuadriculaAncho);
               y = rdm.nextInt(Mapa.cuadriculaAlto);
            creatura.posicion = new Point (x,y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia()); 
        
        }
        }
    public void RunCreaturas() {
        mapa.RunCreaturas();
    }
    
    
}
