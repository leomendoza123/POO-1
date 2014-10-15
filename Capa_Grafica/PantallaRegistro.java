/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capa_Grafica;
import Capa_Datos.ManejadorDeArchivos;
import static Capa_Grafica.MainPrograma.memoriaDePrograma;
import static Capa_Grafica.MainPrograma.partidaPrincipalPrograma;
import static Capa_Grafica.MainPrograma.personajesJugables;
import Logica.OrganizacionPrograma.Jugador;
import Logica.OrganizacionPrograma.Credencial;
import Logica.OrganizacionPrograma.Partida;
import Logica.TiposGuerrero.ElementoJugable;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class PantallaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form PantallaRegistro
     */
    public PantallaRegistro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro");

        jLabel2.setText("Nombre Usuario");

        jLabel3.setText("Contraseña Usuario");

        jButton1.setText("Registar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new PantallaBienvenida().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombreUsuario = this.nombreTextField.getText();
        String passwordUsuario = this.passwordTextField.getText();
        
               
        boolean coincidenciaNombre = false;
        Jugador jugador;
        Jugador jugadorDeComparacion;
        //El programa no contiene jugadores registrados
        if(memoriaDePrograma.jugadores.size()==0){
        
         if((!(this.nombreTextField.getText().equals("falta nombre usuario")))&&
                 (!(this.passwordTextField.getText().equals("falta password")))){
        
            if(nombreUsuario.equals("")){
                this.nombreTextField.setText("falta nombre usuario");
            }
        
            if(passwordUsuario.equals("")){
                this.passwordTextField.setText("falta password");
            }
            
            if((!(nombreUsuario.equals("")))&&(!(passwordUsuario.equals("")))){
                
                jugador = new Jugador(new Credencial(nombreUsuario,passwordUsuario));
                memoriaDePrograma.RegistrarJugador(jugador);
                ManejadorDeArchivos.grabarObjeto(ManejadorDeArchivos.pathArchivoMemoriaPrograma,memoriaDePrograma);
        ArrayList<ElementoJugable> ejercitoInicial = new ArrayList<ElementoJugable>();
        System.out.println("---->Cantidad de personajes jugables ->"+personajesJugables.size());
        System.out.println("nombre creatura-> "+personajesJugables.get(0).getNombre());
        ejercitoInicial.add((ElementoJugable)personajesJugables.get(0).clone());
        System.out.println("Objeto clonado nombre ->"+ejercitoInicial.get(0).getNombre());
        partidaPrincipalPrograma = new Partida(1000,1,ejercitoInicial);
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrePartida().setVisible(true);
            }
        });
         
         this.dispose();
            }
         }
         
        }
        else{
        
             if((!(this.nombreTextField.getText().equals("falta nombre usuario")))&&
                 (!(this.passwordTextField.getText().equals("falta password")))&&
                   !(this.nombreTextField.getText().equals("Ya existe nombre usuario"))){
           if(nombreUsuario.equals("")){
                this.nombreTextField.setText("falta nombre usuario");
            }
        
            if(passwordUsuario.equals("")){
                this.passwordTextField.setText("falta password");
            }
            
            if((!(nombreUsuario.equals("")))&&(!(passwordUsuario.equals("")))){
                
                //jugador = new Jugador(new Credencial(nombreUsuario,passwordUsuario));
                //memoriaDePrograma.RegistrarJugador(jugador);
                //ManejadorDeArchivos.grabarObjeto(ManejadorDeArchivos.pathArchivoMemoriaPrograma,memoriaDePrograma);
                //this.dispose();
                
                for(int i=0; i<memoriaDePrograma.jugadores.size();i++){
                jugadorDeComparacion = memoriaDePrograma.jugadores.get(i);
                    if(jugadorDeComparacion.getCredencial().getNombreUsuario().equals(nombreUsuario)){
                        coincidenciaNombre = true;     
                       }
                }
                
                if(coincidenciaNombre==true){
                 this.nombreTextField.setText("Ya existe nombre usuario");
                }
                
                if(coincidenciaNombre==false){
                    jugador = new Jugador(new Credencial(nombreUsuario,passwordUsuario));
                    memoriaDePrograma.RegistrarJugador(jugador);
                    ManejadorDeArchivos.grabarObjeto(ManejadorDeArchivos.pathArchivoMemoriaPrograma,memoriaDePrograma);
                    ArrayList<ElementoJugable> ejercitoInicial = new ArrayList<ElementoJugable>();
        System.out.println("---->Cantidad de personajes jugables ->"+personajesJugables.size());
        System.out.println("nombre creatura-> "+personajesJugables.get(0).getNombre());
        ejercitoInicial.add((ElementoJugable)personajesJugables.get(0).clone());
        System.out.println("Objeto clonado nombre ->"+ejercitoInicial.get(0).getNombre());
        partidaPrincipalPrograma = new Partida(1000,1,ejercitoInicial);
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrePartida().setVisible(true);
            }
        });
         
         this.dispose();
                }
            
            }
        
             }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField passwordTextField;
    // End of variables declaration//GEN-END:variables
}
