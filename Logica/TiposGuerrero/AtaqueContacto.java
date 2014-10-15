package Logica.TiposGuerrero;
import Logica.Mapa.DibujanteCreaturas;
import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import java.awt.Color;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author dmora
 */

public class AtaqueContacto extends ElementoJugable implements Cloneable{
    
    int velocidad;
    String URLruido; 
    boolean flag = false;

    public AtaqueContacto(int velocidad, String URLruido, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        super(Nombre, URLapariencia, Nivel, Campos, NivelAparicion, Costo, GolpesPorSegundo, vida, refMapa, URLaparienciaAtaque);
        this.velocidad = velocidad;
        this.URLruido = URLruido;
    }
    
    public void pegar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Object clone()
{
  return new AtaqueContacto(this.velocidad,this.URLruido,this.Nombre,this.URLapariencia,this.Nivel,this.Campos,this.NivelAparicion,this.Costo,this.GolpesPorSegundo,this.vida,this.refMapa,this.URLaparienciaAtaque);
}

    @Override
    public void LlamaAnimacionDeAtaque(ElementoJugable Objetivo) {
          ((DibujanteCreaturas)dibujante).AnimacionGolpe(posicion, Objetivo.posicion, colorDeGolpe,URLruido); 

    }

}

