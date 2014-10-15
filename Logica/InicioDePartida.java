/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Mapa.Mapa;
import Logica.OrganizacionPrograma.Partida;
import Logica.TiposGuerrero.AtaqueAereo;
import Logica.TiposGuerrero.Defensor;
import Logica.TiposGuerrero.AtaqueContacto;
import Logica.TiposGuerrero.AtaqueHeroe;
import Logica.TiposGuerrero.AtaqueMedianoAlcance;
import Logica.TiposGuerrero.DefensorBomba;
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
               x = rdm.nextInt(15);
               y = rdm.nextInt(15);
            creatura.posicion = new Point(x, y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia());
        }
        for (int i = 0; i < 5; i++) {
            AtaqueAereo creatura = new AtaqueAereo(50, "Avion", "/Imagenes/avion.png", 1, 1, 1, 1, 3, 20, mapa, null); 
            mapa.AgregaElementoAtacante(creatura);
               x = rdm.nextInt(15);
               y = rdm.nextInt(15);
            creatura.posicion = new Point(x, y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia());
        }
         for (int i = 0; i < 5; i++) {
         AtaqueMedianoAlcance creatura  = new AtaqueMedianoAlcance(1, 5, "Minotauro Arquero", "/Imagenes/minotauro.gif", 1, 1, 1, 1, 1, 2, mapa, null);
        mapa.AgregaElementoAtacante(creatura);
                x = rdm.nextInt(15);
               y = rdm.nextInt(15);
            creatura.posicion = new Point(x, y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia());
        }
        
        for (int i = 0; i < 1; i++) {
        AtaqueHeroe creatura  = new AtaqueHeroe(1, "/Sonido/goblin.wav", "Golblin", "/Imagenes/heroe.png",    1, 1, 1, 1, 1, 10, mapa, null); 
        mapa.AgregaElementoAtacante(creatura);
                x = rdm.nextInt(15);
               y = rdm.nextInt(15);
            creatura.posicion = new Point(x, y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia());
        }
                  
        
        
        }
        else {
            for (ElementoJugable  creatura : PartidaActual.getGuerreros()) {
               mapa.AgregaElementoAtacante(creatura);
               x = rdm.nextInt(15);
               y = rdm.nextInt(15);
               creatura.setRefMapa(mapa);
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
            
            Defensor creatura = new Defensor(true, true, 1, 1, "Muro", "/Imagenes/DefensaMuro.gif", 1, 1, 1, 1, 0, 3, mapa,null);
            mapa.AgregaElementoDefensor(creatura); 
               x = Mapa.cuadriculaAncho-15 +rdm.nextInt(3);
               y = Mapa.cuadriculaAlto-15 +rdm.nextInt(3);
            creatura.posicion = new Point (x,y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia()); 
        }
        for (int i = 0; i < 1; i++) {
            
            Defensor creatura = new Defensor(false, true, 1, 1, "Casa", "/Imagenes/casa.gif", 1, 1, 1, 1, 0, 10, mapa,null);
            mapa.AgregaElementoDefensor(creatura); 
            creatura.posicion = new Point (Mapa.cuadriculaAncho-3,Mapa.cuadriculaAlto-3); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia()); 
        }
        
        
        for (int i = 0; i < 5; i++) {
            
            Defensor creatura = new Defensor(false, true, 1, 4, "Cañon", "/Imagenes/cannon.gif", 1, 1, 1, 1, 1, 1, mapa,null);
            mapa.AgregaElementoDefensor(creatura); 
              x = Mapa.cuadriculaAncho-12 +rdm.nextInt(12);
               y = Mapa.cuadriculaAlto-12 +rdm.nextInt(12);
            creatura.posicion = new Point (x,y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia()); 
        }
        
        for (int i = 0; i < 4; i++) {
            
            Defensor creatura = new DefensorBomba(false, true, 1, 0, "Bomba", "/Imagenes/mina.gif", 1, 1, 1, 1, 1, 1, mapa,null);
            mapa.AgregaElementoDefensor(creatura); 
               x = rdm.nextInt(Mapa.cuadriculaAncho);
               y = rdm.nextInt(Mapa.cuadriculaAlto);
            creatura.posicion = new Point (x,y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia()); 
        }
        

         for (int i = 0; i < 5; i++) {
            
         Defensor creatura = new Defensor(true, false, 1, 50, "Defensa Aerea", "/Imagenes/rpg.gif", 1, 1, 1, 1, 5, 1, mapa,null);
            mapa.AgregaElementoDefensor(creatura); 
              x = Mapa.cuadriculaAncho-12 +rdm.nextInt(12);
               y = Mapa.cuadriculaAlto-12 +rdm.nextInt(12);
            creatura.posicion = new Point (x,y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia()); 
        }
         
        for (int i = 0; i < 5; i++) {
            
       Defensor creatura = new Defensor(true, true, 1, 5, "Defensa Aerea Terreste", "/Imagenes/arco.jpg", 1, 1, 1, 1, 1, 1, mapa,null);
            mapa.AgregaElementoDefensor(creatura); 
              x = Mapa.cuadriculaAncho-12 +rdm.nextInt(12);
               y = Mapa.cuadriculaAlto-12 +rdm.nextInt(12);
            creatura.posicion = new Point (x,y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia()); 
        }
        
        
        
        
        
        
        }
    public void RunCreaturas() {
        mapa.RunCreaturas();
    }

    public String Ganador() {
        if (TodaDefensaMuerta()){
            return ("A"); 
            
        }
        else if (TodoAtacanteMuerto() ){
            return ("D");
            
        }
        return null; 
    }

    private boolean TodaDefensaMuerta() {
        ArrayList<ElementoJugable> Elementos = mapa.getElementosGuerreroDefensor(); 
        for (ElementoJugable Elemento : Elementos) 
            if (!Elemento.isVivo())
                return false;
        return true;      
    }

    private boolean TodoAtacanteMuerto() {
        ArrayList<ElementoJugable> Elementos = mapa.getElementosGuerreroAtacante(); 
        for (ElementoJugable Elemento : Elementos) 
            if (!Elemento.isVivo())
                return false;
        return true;   
    }

    public void fin() {
        ArrayList<ElementoJugable> Elementos = mapa.getElementosGuerreroAtacante(); 
        for (ElementoJugable Elemento : Elementos) 
            Elemento.stop();
                
       ArrayList<ElementoJugable> Elementos2 = mapa.getElementosGuerreroDefensor(); 
        for (ElementoJugable Elemento : Elementos2)
            Elemento.stop();
                
        
        
    }


    
   
}
