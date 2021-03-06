/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Grafica;
import static Capa_Grafica.MainPrograma.jugadorPrincipalPrograma;
import static Capa_Grafica.MainPrograma.partidaPrincipalPrograma;
import static Capa_Grafica.MainPrograma.personajesJugables;
import Logica.TiposGuerrero.ElementoJugable;
/**
 *
 * @author curso
 */
public class PantallaTienda extends javax.swing.JFrame {

    /**
     * Creates new form PantallaTienda
     */
    
    public void ImprimirEjercito(){
    String ejercito = "Nombre/Costo/Nivel/NivelDeAparicion \n";
        for(int i =0; i<partidaPrincipalPrograma.getGuerreros().size(); i++){
         ejercito += partidaPrincipalPrograma.getGuerreros().get(i).getNombre()+" / ";
         ejercito += partidaPrincipalPrograma.getGuerreros().get(i).getCosto()+" / ";
         ejercito += partidaPrincipalPrograma.getGuerreros().get(i).getNivel()+" / ";
         ejercito += partidaPrincipalPrograma.getGuerreros().get(i).getNivelAparicion()+"\n";
        }
        textAreaMiEjercito.setText(ejercito);
    }
    
    public void ImprimirTienda(){
       String variedadTienda = "Index/Nombre/Costo/Nivel/NivelDeAparicion/GolpesPS/vida \n";
        for(int i =0; i<personajesJugables.size(); i++){
         variedadTienda += ""+i+"->";
         variedadTienda += personajesJugables.get(i).getNombre()+" / ";
         variedadTienda += personajesJugables.get(i).getCosto()+" / ";
         variedadTienda += personajesJugables.get(i).getNivel()+" / ";
         variedadTienda += personajesJugables.get(i).getNivelAparicion()+"/";
         variedadTienda += personajesJugables.get(i).getGolpesPorSegundo()+"/";
         variedadTienda += personajesJugables.get(i).getVida()+"\n";
        }
        textAreaTienda.setText(variedadTienda);
    }
    
    public void ImprimirOro(){
    textAreaOro.setText(partidaPrincipalPrograma.getOro()+"");
    }
    
    public void ReImprimirTodo(){
    ImprimirEjercito();
        ImprimirTienda();
        ImprimirOro();
    }
    public PantallaTienda() {
        initComponents();
        ImprimirEjercito();
        ImprimirTienda();
        ImprimirOro();
       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaMiEjercito = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaTienda = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaOro = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        textFieldIndex = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaAvisos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tienda");

        textAreaMiEjercito.setColumns(20);
        textAreaMiEjercito.setRows(5);
        jScrollPane1.setViewportView(textAreaMiEjercito);

        jLabel2.setText("Mi Ejercito");

        textAreaTienda.setColumns(20);
        textAreaTienda.setRows(5);
        jScrollPane2.setViewportView(textAreaTienda);

        jLabel3.setText("Creaturas para comprar");

        jLabel4.setText("Oro");

        textAreaOro.setColumns(20);
        textAreaOro.setRows(5);
        jScrollPane3.setViewportView(textAreaOro);

        jButton1.setText("Comprar Segun Index");
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

        jLabel5.setText("Avisos");

        textAreaAvisos.setColumns(20);
        textAreaAvisos.setRows(5);
        jScrollPane4.setViewportView(textAreaAvisos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldIndex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(135, 135, 135))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(35, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean esNumero(String string){
    
        try{
            Integer.parseInt(string);
        }catch (Exception e){
        return false;
        }
    
        return true;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                String inputUsuario = textFieldIndex.getText();
        int cantidadPartidasGuardadas = personajesJugables.size();
        if(!(esNumero(inputUsuario))){
        textFieldIndex.setText("por favor introducir un entero");
        }
        if(esNumero(inputUsuario)){
           int indexCarga = Integer.parseInt(inputUsuario);
           if(indexCarga<0){
           textFieldIndex.setText("por favor introducir i>0");
           }
           if((indexCarga>cantidadPartidasGuardadas)||(indexCarga == cantidadPartidasGuardadas)){
           textFieldIndex.setText("porfavor introducir index valido");
           }
           if(((indexCarga<cantidadPartidasGuardadas)||(indexCarga==0))&&(indexCarga>-1)){
                 if(partidaPrincipalPrograma.getOro() >= personajesJugables.get(indexCarga).getCosto()){
                 partidaPrincipalPrograma.getGuerreros().add((ElementoJugable)personajesJugables.get(indexCarga).clone());
                 int OroActual = partidaPrincipalPrograma.getOro();
                 partidaPrincipalPrograma.setOro(OroActual - personajesJugables.get(indexCarga).getCosto());
                 ReImprimirTodo();
                 }
                 else{
                 textAreaAvisos.setText("oro insuficiente");
                 }
           }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrePartida().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaTienda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea textAreaAvisos;
    private javax.swing.JTextArea textAreaMiEjercito;
    private javax.swing.JTextArea textAreaOro;
    private javax.swing.JTextArea textAreaTienda;
    private javax.swing.JTextField textFieldIndex;
    // End of variables declaration//GEN-END:variables
}
