/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Logica.Mapa.Mapa;
import Logica.Mapa.ElementoDibujable;
import Logica.TiposGuerrero.AtaqueAereo;
import Logica.TiposGuerrero.AtaqueContacto;
import Logica.TiposGuerrero.ElementoJugable;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author dmora
 */
public class Pantalla extends javax.swing.JFrame {


    
    public ElementoDibujable matriz[][];
    
    public ArrayList<ElementoJugable> ejercito = new ArrayList();
    
    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        
        initComponents();
         
        this.setSize(1000,1000);
        
        
        
        ///// LE EXPLICO MAE OJO:  para iniciar una partida
        
        // CREA UN JPANEL
        jPanelDeMapa.setSize(800, 800);
        // CREA UN MAPA, que resive el JPANEL
        Mapa MapaObj = new Mapa(jPanelDeMapa);
        
        //Y aqui empieza la partida: 
        InicioDePartida Partida = new InicioDePartida(); 
        //Asigna el  Mapa a la partida
        Partida.setMapa(MapaObj);
        //Le mete creturas al mapa
        Partida.IniciarCreaturasAtaque();
        //Le mete la creaturas de defensa; 
        Partida.IniciarCreaturasDefensa();
        //Corre los hilos de las creaturas
        Partida.RunCreaturas();
        
        
        
        //Hay que agregarle una funcion como InicioDePartida.getInstance().setParametrosDePartida(level, creaturas, blbablabalbal);
        // Que sería lo que usted me manda para iniciar partida
        
       

    }
        
    /*
    
    void generarEjercito()
    {
        
        for (int i = 0; i < 5; i++) {
            JLabel etiqueta = new JLabel();
            etiqueta.setOpaque(true);
            //jPanel1.add(etiqueta);

            AtaqueAereo nuevo = new AtaqueAereo(3, 10, etiqueta, this.jPanelDeMapa);
            ejercito.add(nuevo);
            nuevo.pegar();
            //

        }
        for (int i = 0; i < 10; i++) {
            JLabel etiqueta = new JLabel();
            etiqueta.setOpaque(true);
            //jPanel1.add(etiqueta);

            AtaqueContacto nuevo = new AtaqueContacto(5, 3, 10, etiqueta, this.jPanelDeMapa);
            nuevo.pegar();
            
            ejercito.add(nuevo);
        }
        
        for (int i = 0; i < ejercito.size(); i++) {
            ejercito.get(i).start();
            
        }
        
    
    }
   
    
    
    void generarSoldados(int cantidad)
    {
        for (int i = 0; i < cantidad; i++) {
            int x = new Random().nextInt(30);
            int y = new Random().nextInt(30);
            
            jPanelDeMapa.remove(matriz[x][y].getRefLabel());
            
            matriz[x][y] = new Soldado(jPanelDeMapa, new Point(x, y));
            matriz[x][y].pegarEnPanel();
            
        }
    
    }
   */
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanelDeMapa = new javax.swing.JLayeredPane();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDeMapa.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanelDeMapa.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanelDeMapaLayout = new javax.swing.GroupLayout(jPanelDeMapa);
        jPanelDeMapa.setLayout(jPanelDeMapaLayout);
        jPanelDeMapaLayout.setHorizontalGroup(
            jPanelDeMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanelDeMapaLayout.setVerticalGroup(
            jPanelDeMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDeMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDeMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jPanelDeMapa;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
