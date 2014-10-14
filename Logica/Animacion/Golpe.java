/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Animacion;

import static Logica.Mapa.ElementoDibujable.TamañoCuadricula;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Leonardo
 */
public class Golpe extends Thread {
    
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

    @Override
    public void run() {
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
            System.err.println("Error al dibujar golpe");
        }
    }

    public Golpe(JLayeredPane Panel, Point Salida, Point Llegada, Color color) {
        this.Panel = Panel;
        this.Salida = Salida;
        this.Llegada = Llegada;
        this.color = color;
    }
    
    

    
    
    
               
    
    
}
