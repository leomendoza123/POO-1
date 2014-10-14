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

        jPanelDeMapa = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDeMapa.setBackground(new java.awt.Color(204, 255, 255));
        jPanelDeMapa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDeMapa.setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanelDeMapa, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton1)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addContainerGap(304, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDeMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //generarSoldados(30);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelDeMapa;
    // End of variables declaration//GEN-END:variables
}
