/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Mapa.Mapa;

/**
 *
 * @author leoanardo
 */
public class InicioDePartida {
    private static InicioDePartida iniciarPartida = new InicioDePartida();
    private Mapa mapa;
    

    
    public void setMapa(Mapa pMapa){
        mapa = pMapa;
    }
    
    void IniciarPartida (){
        
        for (int i = 0; i < 10; i++) {
                
            mapa.AgregaCreatura();
        }
         
    }
    
    public static InicioDePartida getInstance(){
        return iniciarPartida;
    }

    void RunCreaturas() {
        mapa.RunCreaturas();
    }
    
    
}
