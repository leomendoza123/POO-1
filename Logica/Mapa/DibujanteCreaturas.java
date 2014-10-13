/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Mapa;

import Logica.Mapa.ElementoDibujable;
import Logica.TiposGuerrero.Guerrero;
import java.awt.Color;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.text.Position;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author dmora
 */
public class DibujanteCreaturas implements ElementoDibujable {

    // remove final con new acá
    //public static final int TAMANO = 15;
    public boolean ocupado = false;
    public JLabel refLabel;
    public JPanel refContenedor;
    public Guerrero TipoGuerrero;

    public DibujanteCreaturas(JPanel panel) {
        this.TipoGuerrero = TipoGuerrero;
        refContenedor = panel;
        refLabel = new JLabel("-");
        refLabel.setOpaque(true);
       

        // agregar evento al dar clic
        refLabel.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animar();
            }
        });
        
        
        
        
    }

    @Override
    public void pintar() {
        ImageIcon iconLogo = new ImageIcon(this.getClass().getResource("/Imagenes/dragon.gif"));
        refLabel.setIcon(iconLogo);
        refLabel.update(refLabel.getGraphics());
    }

    @Override
    public void animar() {
    }

    @Override
    public JLabel getRefLabel() {
        return refLabel;
    }

    @Override
    public void posiciona(Point posicion) {
        refContenedor.add(refLabel);
        refLabel.setLocation((int) posicion.getX() * TAMANO, (int) posicion.getY() * TAMANO);
        refLabel.setSize(TAMANO, TAMANO);
        pintar();
        refLabel.repaint();
    }

}
