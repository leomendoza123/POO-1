/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Animacion;

import Logica.Main;
import static Logica.Mapa.ElementoDibujable.TamañoCuadricula;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Leonardo
 */
public class Golpe extends Thread {
    private String URLsonido;
    
    JLayeredPane Panel; 
    Point Salida;  Point Llegada;  Color color; 
    public JPanel DibujoDelGolpe(Point Salida, Point Llegada, Color color){
       JPanel panel;
        panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(color);
                g.drawLine(Salida.x * TamañoCuadricula,
                        Salida.y * TamañoCuadricula, 
                        Llegada.x * TamañoCuadricula,
                        Llegada.y * TamañoCuadricula);
                
            };
        };
       return panel; 
    }
    
    
    public synchronized void playSound() {
    new Thread(
            new Runnable() {

          public void run() {
              try {
                  Clip clip = AudioSystem.getClip();
                  AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                          Main.class.getResourceAsStream(URLsonido));
                  clip.open(inputStream);
                  clip.start();
              } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                  System.err.println(e.getMessage());
              } }
      })
            .start();
}
    
    

    @Override
    public void run() {
        
        if (URLsonido!=null )
            playSound(); 
        JPanel Dibujo = DibujoDelGolpe(Salida, Llegada, color); 
      
        try {
            Dibujo.setSize(1000,1000);
            Dibujo.setOpaque(false);
            Dibujo.setVisible(true);
            Panel.add(Dibujo,15);
            sleep(40);
            Panel.remove(Dibujo);
            Dibujo.setVisible(false);
            
        } catch (InterruptedException ex) {
        }
    }

    public Golpe(JLayeredPane Panel, Point Salida, Point Llegada, Color color) {
        this.Panel = Panel;
        this.Salida = Salida;
        this.Llegada = Llegada;
        this.color = color;
    }
    
    public Golpe(JLayeredPane Panel, Point Salida, Point Llegada, Color color, String URLsonido) {
        this.Panel = Panel;
        this.Salida = Salida;
        this.Llegada = Llegada;
        this.color = color;
        this.URLsonido = URLsonido; 
    }
      
}
