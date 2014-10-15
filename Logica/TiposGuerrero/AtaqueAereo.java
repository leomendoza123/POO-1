package Logica.TiposGuerrero;
import Logica.Mapa.Mapa;
import java.awt.Color;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author dmora
 */

public class AtaqueAereo extends AtaqueMedianoAlcance implements Cloneable{
    
    int Alcance; 
    boolean flag = false;
    private boolean YaPosicionado = false;

    public AtaqueAereo(int Alcance, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        super (0, Alcance, Nombre, URLapariencia, Nivel, Campos, NivelAparicion, Costo, GolpesPorSegundo, vida, refMapa, URLaparienciaAtaque);
        this.Alcance = Alcance;
    }
 
    
    @Override
    public void mover() {
              if (!YaPosicionado) {
        super.getDibujante().posiciona(posicion);
        YaPosicionado = true;
       }
    }
    
    
    public Object clone()
{
    //Object clone = null;
    //return new AtaqueAereo(this.);
    //return clone;
    return new AtaqueAereo(this.Alcance,this.Nombre,this.URLapariencia,this.Nivel,this.Campos,this.NivelAparicion,this.Costo,this.GolpesPorSegundo,this.vida,this.refMapa,this.URLaparienciaAtaque);
}
    
}

