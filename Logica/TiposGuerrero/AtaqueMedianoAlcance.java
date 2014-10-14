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

public class AtaqueMedianoAlcance extends ElementoJugable{
    
    int velocidad;
    int Alcance; 
    boolean flag = false;

    public AtaqueMedianoAlcance(int velocidad, int Alcance, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        super(Nombre, URLapariencia, Nivel, Campos, NivelAparicion, Costo, GolpesPorSegundo, vida, refMapa, URLaparienciaAtaque);
        this.velocidad = velocidad;
        this.Alcance = Alcance;
    }
   

    @Override
    public void pegar() {
 
        
    }
    
    @Override
    public void atacar() {
        
    }

    
    
}

