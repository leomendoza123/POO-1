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

public class AtaqueContacto extends ElementoJugable{
    
    int velocidad;
    String URLruido; 
    boolean flag = false;

    public AtaqueContacto(int velocidad, String URLruido, String Nombre, String URLapariencia, int Nivel, int Campos, int NivelAparicion, int Costo, int GolpesPorSegundo, int vida, Mapa refMapa, String URLaparienciaAtaque) {
        super(Nombre, URLapariencia, Nivel, Campos, NivelAparicion, Costo, GolpesPorSegundo, vida, refMapa, URLaparienciaAtaque);
        this.velocidad = velocidad;
        this.URLruido = URLruido;
    }
    
    
    

    @Override
    public void run() {
        while (!detener)
        {
            try {
                // se mueve "velocidad" segundos
                int segundos = velocidad*1000;
                
                //para mover la imagen
                while (segundos > 0)
                {
                    mover();
                    sleep(500);
                    segundos -= 500;
                }
                
            } catch (InterruptedException ex) {}
        }
    }

    @Override
    public void pegar() {
 
        
    }
    
    @Override
    public void atacar() {
        
    }

    
    @Override
    public void mover() {
        
        
     
       int lado = new Random().nextInt(4);
        
        if (lado == 0)
            posicion.x++;
        else if (lado == 1)
            posicion.x--;
        else if (lado == 2)
            posicion.y++;
        else 
            posicion.y--;
  
       getDibujante().posiciona(posicion);
        
    }
    
    
}

