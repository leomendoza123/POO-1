/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Mapa.Mapa;
import Logica.TiposGuerrero.Defensor;
import Logica.TiposGuerrero.AtaqueContacto;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author leoanardo
 */
public class InicioDePartida {
    private Mapa mapa;
    

    
    public void setMapa(Mapa pMapa){
        mapa = pMapa;
    }
    
    public void IniciarCreaturasAtaque (){
         int x, y;
        Random rdm = new Random(); 
        
        for (int i = 0; i < 30; i++) {
            
            AtaqueContacto creatura = new AtaqueContacto(1, null, "Leo", "/Imagenes/dragon.gif" ,1, 1, 1, 1, 1, 1, mapa,null); 
            mapa.AgregaElementoAtacante(creatura);
            x = rdm.nextInt(Mapa.cuadriculaDeLado);
            y = rdm.nextInt(Mapa.cuadriculaDeLado);
            creatura.posicion = new Point(x, y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia());
        
    }
    }
    
    
    public void IniciarCreaturasDefensa() {
     
          int x, y;
        Random rdm = new Random(); 
        for (int i = 0; i < 10; i++) {
         
          
            Defensor creatura = new Defensor(true, true, 1, 1, "Test", "/Imagenes/DefensaMuro.gif", 1, 1, 1, 1, 1, 3, mapa,null);
            mapa.AgregaElementoDefensor(creatura); 
            x = rdm.nextInt(Mapa.cuadriculaDeLado);
            y = rdm.nextInt(Mapa.cuadriculaDeLado);
            creatura.posicion = new Point (x,y); 
            creatura.getDibujante().posiciona(creatura.getPosicion());
            creatura.getDibujante().pintar(creatura.getURLapariencia()); 
        
        }
        }
    void RunCreaturas() {
        mapa.RunCreaturas();
    }
    
    
}
