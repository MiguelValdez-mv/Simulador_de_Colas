
package GUI;


public class ParametrosSalida extends javax.swing.JFrame {

    public ParametrosSalida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        labelUnidadTiempo = new javax.swing.JLabel();
        labelPresentarTablaEventos = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        unidadTiempoActual = new javax.swing.JLabel();
        labelCantClientesPermitidos = new javax.swing.JLabel();
        labelCostoEsperaCliente = new javax.swing.JLabel();
        labelCantidadServidores = new javax.swing.JLabel();
        labelCostoServidor = new javax.swing.JLabel();
        labelTELL = new javax.swing.JLabel();
        espacio = new javax.swing.JPanel();
        labelTELL1 = new javax.swing.JLabel();
        labelTELL2 = new javax.swing.JLabel();
        labelTELL3 = new javax.swing.JLabel();
        labelTELL4 = new javax.swing.JLabel();
        cantClientesNoEsperan = new javax.swing.JLabel();
        tiempoPromedioClienteSistema = new javax.swing.JLabel();
        tiempoPromedioEsperaClienteCola = new javax.swing.JLabel();
        tiempoAdicionalTrabajo = new javax.swing.JLabel();
        cantClientesSeVanSinAtender = new javax.swing.JLabel();
        probabilidadEsperar = new javax.swing.JLabel();
        cantPromedioClientesCola = new javax.swing.JLabel();
        cantPromedioClientesSistema = new javax.swing.JLabel();
        tiempoPromedioClienteCola = new javax.swing.JLabel();
        porcentajeUsoServidores = new javax.swing.JLabel();
        porcentajeUsoSistema = new javax.swing.JLabel();
        labelTELL5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEventos = new javax.swing.JTextArea();
        AgregarValorTELLManual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 248, 224));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Simulador de Colas");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        subtitulo.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(0, 0, 0));
        subtitulo.setText("ESTADISTICAS");
        jPanel1.add(subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 20));

        labelUnidadTiempo.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelUnidadTiempo.setForeground(new java.awt.Color(0, 0, 0));
        labelUnidadTiempo.setText("Cantidad de clientes que no esperan");
        jPanel1.add(labelUnidadTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        labelPresentarTablaEventos.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelPresentarTablaEventos.setForeground(new java.awt.Color(0, 0, 0));
        labelPresentarTablaEventos.setText("Cantidad de clientes que se van sin ser atentidos");
        jPanel1.add(labelPresentarTablaEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        labelDuracion.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelDuracion.setForeground(new java.awt.Color(0, 0, 0));
        labelDuracion.setText("Probabilidad de esperar");
        jPanel1.add(labelDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        unidadTiempoActual.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        unidadTiempoActual.setForeground(new java.awt.Color(0, 0, 0));
        unidadTiempoActual.setText("-");
        jPanel1.add(unidadTiempoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, 30));

        labelCantClientesPermitidos.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCantClientesPermitidos.setForeground(new java.awt.Color(0, 0, 0));
        labelCantClientesPermitidos.setText("Cantidad promedio de clientes en cola");
        jPanel1.add(labelCantClientesPermitidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        labelCostoEsperaCliente.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCostoEsperaCliente.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoEsperaCliente.setText("Cantidad promedio de clientes en el sistema");
        jPanel1.add(labelCostoEsperaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        labelCantidadServidores.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCantidadServidores.setForeground(new java.awt.Color(0, 0, 0));
        labelCantidadServidores.setText("Tiempo promedio de un cliente en cola");
        jPanel1.add(labelCantidadServidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        labelCostoServidor.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCostoServidor.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoServidor.setText("Tiempo promedio de un cliente en el sistema");
        jPanel1.add(labelCostoServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        labelTELL.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL.setText("Tabla de eventos");
        jPanel1.add(labelTELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 30));

        espacio.setBackground(new java.awt.Color(237, 248, 224));

        javax.swing.GroupLayout espacioLayout = new javax.swing.GroupLayout(espacio);
        espacio.setLayout(espacioLayout);
        espacioLayout.setHorizontalGroup(
            espacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        espacioLayout.setVerticalGroup(
            espacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(espacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 920, 760, 10));

        labelTELL1.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL1.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL1.setText("Tiempo promedio de espera del cliente que hace cola");
        jPanel1.add(labelTELL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        labelTELL2.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL2.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL2.setText("Tiempo adicional que se trabaja despues de cerrar");
        jPanel1.add(labelTELL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 30));

        labelTELL3.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL3.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL3.setText("Porcentaje de utilizacion de los servidores");
        jPanel1.add(labelTELL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 30));

        labelTELL4.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL4.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL4.setText("Porcentaje de utilizacion del sistema");
        jPanel1.add(labelTELL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, 30));

        cantClientesNoEsperan.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        cantClientesNoEsperan.setForeground(new java.awt.Color(0, 0, 0));
        cantClientesNoEsperan.setText("-");
        jPanel1.add(cantClientesNoEsperan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, 40));

        tiempoPromedioClienteSistema.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        tiempoPromedioClienteSistema.setForeground(new java.awt.Color(0, 0, 0));
        tiempoPromedioClienteSistema.setText("-");
        jPanel1.add(tiempoPromedioClienteSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, 40));

        tiempoPromedioEsperaClienteCola.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        tiempoPromedioEsperaClienteCola.setForeground(new java.awt.Color(0, 0, 0));
        tiempoPromedioEsperaClienteCola.setText("-");
        jPanel1.add(tiempoPromedioEsperaClienteCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 30));

        tiempoAdicionalTrabajo.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        tiempoAdicionalTrabajo.setForeground(new java.awt.Color(0, 0, 0));
        tiempoAdicionalTrabajo.setText("-");
        jPanel1.add(tiempoAdicionalTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, 30));

        cantClientesSeVanSinAtender.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        cantClientesSeVanSinAtender.setForeground(new java.awt.Color(0, 0, 0));
        cantClientesSeVanSinAtender.setText("-");
        jPanel1.add(cantClientesSeVanSinAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, 40));

        probabilidadEsperar.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        probabilidadEsperar.setForeground(new java.awt.Color(0, 0, 0));
        probabilidadEsperar.setText("-");
        jPanel1.add(probabilidadEsperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, 40));

        cantPromedioClientesCola.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        cantPromedioClientesCola.setForeground(new java.awt.Color(0, 0, 0));
        cantPromedioClientesCola.setText("-");
        jPanel1.add(cantPromedioClientesCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, 40));

        cantPromedioClientesSistema.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        cantPromedioClientesSistema.setForeground(new java.awt.Color(0, 0, 0));
        cantPromedioClientesSistema.setText("-");
        jPanel1.add(cantPromedioClientesSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, 40));

        tiempoPromedioClienteCola.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        tiempoPromedioClienteCola.setForeground(new java.awt.Color(0, 0, 0));
        tiempoPromedioClienteCola.setText("-");
        jPanel1.add(tiempoPromedioClienteCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, 40));

        porcentajeUsoServidores.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        porcentajeUsoServidores.setForeground(new java.awt.Color(0, 0, 0));
        porcentajeUsoServidores.setText("-");
        jPanel1.add(porcentajeUsoServidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, 30));

        porcentajeUsoSistema.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        porcentajeUsoSistema.setForeground(new java.awt.Color(0, 0, 0));
        porcentajeUsoSistema.setText("-");
        jPanel1.add(porcentajeUsoSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, 30));

        labelTELL5.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL5.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL5.setText("Relacion optima");
        jPanel1.add(labelTELL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 30));

        tablaEventos.setEditable(false);
        tablaEventos.setColumns(20);
        tablaEventos.setRows(5);
        jScrollPane1.setViewportView(tablaEventos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 780, 240));

        AgregarValorTELLManual.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        AgregarValorTELLManual.setText("Hacer otra simulacion");
        AgregarValorTELLManual.setFocusable(false);
        AgregarValorTELLManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarValorTELLManualActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarValorTELLManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 890, -1, 30));

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarValorTELLManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarValorTELLManualActionPerformed
       
    }//GEN-LAST:event_AgregarValorTELLManualActionPerformed

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
            java.util.logging.Logger.getLogger(ParametrosSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParametrosSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParametrosSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParametrosSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParametrosSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarValorTELLManual;
    private javax.swing.JLabel cantClientesNoEsperan;
    private javax.swing.JLabel cantClientesSeVanSinAtender;
    private javax.swing.JLabel cantPromedioClientesCola;
    private javax.swing.JLabel cantPromedioClientesSistema;
    private javax.swing.JPanel espacio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCantClientesPermitidos;
    private javax.swing.JLabel labelCantidadServidores;
    private javax.swing.JLabel labelCostoEsperaCliente;
    private javax.swing.JLabel labelCostoServidor;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelPresentarTablaEventos;
    private javax.swing.JLabel labelTELL;
    private javax.swing.JLabel labelTELL1;
    private javax.swing.JLabel labelTELL2;
    private javax.swing.JLabel labelTELL3;
    private javax.swing.JLabel labelTELL4;
    private javax.swing.JLabel labelTELL5;
    private javax.swing.JLabel labelUnidadTiempo;
    private javax.swing.JLabel porcentajeUsoServidores;
    private javax.swing.JLabel porcentajeUsoSistema;
    private javax.swing.JLabel probabilidadEsperar;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JTextArea tablaEventos;
    private javax.swing.JLabel tiempoAdicionalTrabajo;
    private javax.swing.JLabel tiempoPromedioClienteCola;
    private javax.swing.JLabel tiempoPromedioClienteSistema;
    private javax.swing.JLabel tiempoPromedioEsperaClienteCola;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel unidadTiempoActual;
    // End of variables declaration//GEN-END:variables
}
