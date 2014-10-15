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

public class AtaqueHeroe extends AtaqueContacto implements Cloneable{

    public AtaqueHeroe(int velocidad, String URLruido, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        super(velocidad, URLruido, Nombre, URLapariencia, Nivel, Campos, NivelAparicion, Costo, GolpesPorSegundo, vida, refMapa, URLaparienciaAtaque);
    }    
    
public Object clone()
{
    return new AtaqueHeroe(this.velocidad,this.URLruido,this.Nombre,this.URLapariencia,this.Nivel,this.Campos,this.NivelAparicion,this.Costo,this.GolpesPorSegundo,this.vida,this.refMapa,this.URLaparienciaAtaque);
}
    
}

