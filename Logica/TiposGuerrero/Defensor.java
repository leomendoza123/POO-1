/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.TiposGuerrero;

import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author leoanardo
 */
public class Defensor extends AtaqueMedianoAlcance{
    boolean DefensaAerea, DefensaTerreste;

    public Defensor(boolean DefensaAerea, boolean DefensaTerreste, int velocidad, int Alcance, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        super(velocidad, Alcance, Nombre, URLapariencia, Nivel, Campos, NivelAparicion, Costo, GolpesPorSegundo, vida, refMapa, URLaparienciaAtaque);
        this.DefensaAerea = DefensaAerea;
        this.DefensaTerreste = DefensaTerreste;
    }
}
