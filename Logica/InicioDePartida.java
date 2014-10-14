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
        for (int i = 0; i < 10; i++) {
            AtaqueContacto GT = new AtaqueContacto(1, null, "Leo", "/Imagenes/dragon.gif" ,1, 1, 1, 1, 1, 1, mapa); 
            mapa.AgregaElementoAtacante(GT);
            GT.getDibujante().posiciona(new Point(15, 15));
            GT.getDibujante().pintar(GT.getURLapariencia());
        }
    }
    
    
    public void IniciarCreaturasDefensa() {
        int x, y;
        Random rdm = new Random(); 
        for (int i = 0; i < 10; i++) {
            Defensor GD = new Defensor(true, true, 1, 1, "Test", "/Imagenes/dragon.gif", 1, 1, 1, 1, 1, 1, mapa);
            mapa.AgregaElementoDefensor(GD); 
            x = rdm.nextInt(Mapa.cuadriculaDeLado);
            y = rdm.nextInt(Mapa.cuadriculaDeLado);
            GD.getDibujante().posiciona(new Point (x,y));
            GD.getDibujante().pintar(GD.getURLapariencia()); 
        }
    }
    void RunCreaturas() {
        mapa.RunCreaturas();
    }
    
    
}
