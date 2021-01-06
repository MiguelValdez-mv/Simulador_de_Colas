
package GUI;


public class ParametrosDeSalida extends javax.swing.JFrame {

    private String salidaSimulacion;
    
    public ParametrosDeSalida() {
        initComponents();
    }

    public void mostrarSalida(String salidaSimulacion){
        resumenSimulacion.setText(salidaSimulacion);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        subtitulo1 = new javax.swing.JLabel();
        espacio1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        resumenSimulacion = new javax.swing.JTextArea();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(237, 248, 224));
        jPanel2.setFocusable(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo1.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 0, 0));
        titulo1.setText("Simulador de Colas");
        jPanel2.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        subtitulo1.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        subtitulo1.setForeground(new java.awt.Color(0, 0, 0));
        subtitulo1.setText("ESTADISTICAS");
        jPanel2.add(subtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 20));

        espacio1.setBackground(new java.awt.Color(237, 248, 224));

        javax.swing.GroupLayout espacio1Layout = new javax.swing.GroupLayout(espacio1);
        espacio1.setLayout(espacio1Layout);
        espacio1Layout.setHorizontalGroup(
            espacio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        espacio1Layout.setVerticalGroup(
            espacio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(espacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 920, 760, 10));

        resumenSimulacion.setEditable(false);
        resumenSimulacion.setColumns(20);
        resumenSimulacion.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        resumenSimulacion.setRows(5);
        jScrollPane4.setViewportView(resumenSimulacion);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 780, 510));

        regresar.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        regresar.setText("Hacer otra simulacion");
        regresar.setFocusable(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel2.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.setVisible(false);
        ParametrosDeEntrada parametrosEntrada = new ParametrosDeEntrada();
        parametrosEntrada.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    /**
     * @param args Argumentos de la linea de comandos
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
            java.util.logging.Logger.getLogger(ParametrosDeSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParametrosDeSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParametrosDeSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParametrosDeSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParametrosDeSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel espacio1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton regresar;
    private javax.swing.JTextArea resumenSimulacion;
    private javax.swing.JLabel subtitulo1;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
