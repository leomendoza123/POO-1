package Logica.TiposGuerrero;
import Logica.Mapa.Mapa;
import java.awt.Color;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author dmora
 */

public class AtaqueBestia extends AtaqueMedianoAlcance{
    
    boolean flag = false;
    public AtaqueBestia(int velocidad, int Alcance, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        super(velocidad, Alcance, Nombre, URLapariencia, Nivel, Campos, NivelAparicion, Costo, GolpesPorSegundo, vida, refMapa, URLaparienciaAtaque);
    }
    
    
    
}

