/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Mapa.Mapa;
import Logica.TiposGuerrero.Defensor;
import Logica.TiposGuerrero.GuerreroTerrestre;
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
        for (int i = 0; i < 10; i++) {
            GuerreroTerrestre GT = new GuerreroTerrestre(i, i, i, mapa, "/Imagenes/DefensaWall.gif");
            mapa.AgregaElementoAtacante(GT);
            GT.getDibujante().posiciona(new Point(15, 15));
            GT.getDibujante().pintar(GT.URLapariencia);
        }
    }
    
    
    public void IniciarCreaturasDefensa() {
        int x, y;
        Random rdm = new Random(); 
        for (int i = 0; i < 10; i++) {
            Defensor GD = new Defensor(1, 1, mapa, "/Imagenes/DefensaWall.gif");
            mapa.AgregaElementoDefensor(GD); 
            x = rdm.nextInt(Mapa.cuadriculaDeLado);
            y = rdm.nextInt(Mapa.cuadriculaDeLado);
            GD.getDibujante().posiciona(new Point (x,y));
            GD.getDibujante().pintar(GD.URLapariencia); 
        }
    }
    void RunCreaturas() {
        mapa.RunCreaturas();
    }
    
    
}
