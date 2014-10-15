package Logica.TiposGuerrero;
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
return new AtaqueBestia(this.velocidad,this.Alcance,this.Nombre,this.URLapariencia,this.Nivel,this.Campos,this.NivelAparicion,this.Costo,this.GolpesPorSegundo,this.vida,this.refMapa,this.URLaparienciaAtaque);
}
    
}

