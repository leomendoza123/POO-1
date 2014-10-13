/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica.TiposGuerrero;

import Logica.Mapa.DibujanteCreaturas;
import Logica.Mapa.ElementoDibujable;
import Logica.Mapa.Mapa;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dmora
 */
public class GuerreroTerrestre extends Guerrero{

    // atributo
    
    int espera;
    boolean flag = false;
    
    public GuerreroTerrestre(int espera, int fuerza, int resistencia, JLabel refLabel, JPanel refContenedor,Mapa refMapa, ElementoDibujable dibujante) {
        super(fuerza, resistencia, refLabel, refContenedor, refMapa,dibujante);
        this.espera = 1;
        dibujante.posiciona(new Point(15, 15));
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
        if (flag)
            refLabel.setBackground(Color.red);
        else
            refLabel.setBackground(Color.yellow);



        flag = !flag;
        
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
  
     dibujante.posiciona(posicion);
        
    }
    
    
}
