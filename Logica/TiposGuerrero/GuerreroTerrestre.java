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

public class GuerreroTerrestre extends ElementoJugable{
    
    int espera;
    boolean flag = false;
    
    public GuerreroTerrestre(int espera, int fuerza, int resistencia, Mapa refMapa, String URLapariencia) {
        super(fuerza, resistencia, refMapa, URLapariencia);
        this.espera = 1;
    }

    @Override
    public void run() {
        while (!detener)
        {
            try {
                // se mueve "espera" segundos
                int segundos = espera*1000;
                
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

