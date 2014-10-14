package Logica.TiposGuerrero;
import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import java.awt.Color;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author dmora
 */

public class AtaqueBestia extends AtaqueMedianoAlcance implements Cloneable{
    
    boolean flag = false;
    public AtaqueBestia(int velocidad, int Alcance, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        super(velocidad, Alcance, Nombre, URLapariencia, Nivel, Campos, NivelAparicion, Costo, GolpesPorSegundo, vida, refMapa, URLaparienciaAtaque);
    }
    
    
    public Object clone()
{
    Object clone = null;
    try
    {
        clone = super.clone();
    } 
    catch(Exception e)
    {
        // No deberia suceder
    }
    return clone;
}
    
}

