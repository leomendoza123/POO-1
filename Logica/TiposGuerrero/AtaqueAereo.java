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

public class AtaqueAereo extends ElementoJugable implements Cloneable{
    
    int Alcance; 
    boolean flag = false;
    private boolean YaPosicionado = false;

    public AtaqueAereo(int Alcance, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        super(Nombre, URLapariencia, Nivel, Campos, NivelAparicion, Costo, GolpesPorSegundo, vida, refMapa, URLaparienciaAtaque);
        this.Alcance = Alcance;
    }
    
    @Override
    public void pegar() {
        
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

