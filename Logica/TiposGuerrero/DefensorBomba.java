/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.TiposGuerrero;

import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import java.awt.Color;
import static java.lang.Math.abs;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author leoanardo
 */
public class DefensorBomba extends Defensor{ 

    public DefensorBomba(boolean DefensaAerea, boolean DefensaTerreste, int velocidad, int Alcance, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        super(DefensaAerea, DefensaTerreste, velocidad, Alcance, Nombre, URLapariencia, Nivel, Campos, NivelAparicion, Costo, GolpesPorSegundo, vida, refMapa, URLaparienciaAtaque);
    }

    
    public void atacar(){
        ElementoJugable Objetivo = EnemigoAtacable();
        if (Objetivo!=null && vivo){
                ArrayList<ElementoJugable> Enemigos = refMapa.getElementosGuerreroAtacante(); 
                for (ElementoJugable Enemigo : Enemigos) {
                    if (abs(Enemigo.posicion.x-posicion.x)<4 &&
                           abs(Enemigo.posicion.y-posicion.y)<4 
                            ){
                        Enemigo.vida --; 
                        if (Enemigo.vida<=0){
                             Enemigo.muerto();
            }
                        
                    }
                }
                this.muerto();
            }
          
        }
    }
    
   
    
    
    