
package GUI;

import Componentes.Estadisticas;


public class ParametrosDeSalida extends javax.swing.JFrame {

    private String salidaSimulacion;
    
    public ParametrosDeSalida() {
        initComponents();
    }

    public void mostrarSalida(Estadisticas estadisticas, boolean mostrarTablaEventos, String tablaEventos){
        cantClientesNoEsperan.setText(estadisticas.cadenaCantClientesNoEsperan());
        cantClientesSeVanSinAtender.setText(estadisticas.cadenaCantClientesSeVanSinAtender());
        probabilidadEsperar.setText(estadisticas.cadenaProbabilidadEspera());
        cantPromedioClientesEnCola.setText(estadisticas.cadenaCantPromedioClientesEnCola());
        cantPromedioClientesEnSistema.setText(estadisticas.cadenaCantPromedioClientesEnSistema());
        tiempoPromedioClienteEnCola.setText(estadisticas.cadenaTiempoPromedioEnCola());
        tiempoPromedioClienteEnSistema.setText(estadisticas.cadenaTiempoPromedioEnSistema());
        tiempoAdicional.setText(estadisticas.cadenaTiempoAdicional());
        relacionOptima.setText(estadisticas.cadenaRelacionOptima());
        porcentajeGeneralUtilizacionServidores.setText(estadisticas.cadenaPorcentajeUitlizacionGeneralServidores());
        porcentajesUtilizacionPorServidores.setText(estadisticas.cadenaPorcentajeUtilizacionPorServidor());
        
        if(mostrarTablaEventos){
            TablaEventos.setText(tablaEventos);
        }else{
            jScrollPanelTablaEventos.setVisible(false);
            jScrollPanelTablaEventos.setSize(0, 0);
            labelTablaEventos.setVisible(false);
            espacio.setVisible(false);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        subtitulo1 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        labelUnidadTiempo = new javax.swing.JLabel();
        labelPresentarTablaEventos = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        labelCantClientesPermitidos = new javax.swing.JLabel();
        labelCostoEsperaCliente = new javax.swing.JLabel();
        labelCantidadServidores = new javax.swing.JLabel();
        labelCostoServidor = new javax.swing.JLabel();
        labelTablaEventos = new javax.swing.JLabel();
        labelTELL1 = new javax.swing.JLabel();
        labelTELL2 = new javax.swing.JLabel();
        labelTELL3 = new javax.swing.JLabel();
        labelTELL4 = new javax.swing.JLabel();
        cantClientesNoEsperan = new javax.swing.JLabel();
        cantClientesSeVanSinAtender = new javax.swing.JLabel();
        probabilidadEsperar = new javax.swing.JLabel();
        cantPromedioClientesEnCola = new javax.swing.JLabel();
        cantPromedioClientesEnSistema = new javax.swing.JLabel();
        tiempoPromedioClienteEnCola = new javax.swing.JLabel();
        tiempoPromedioClienteEnSistema = new javax.swing.JLabel();
        tiempoAdicional = new javax.swing.JLabel();
        relacionOptima = new javax.swing.JLabel();
        porcentajeGeneralUtilizacionServidores = new javax.swing.JLabel();
        labelTELL5 = new javax.swing.JLabel();
        espacio = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        porcentajesUtilizacionPorServidores = new javax.swing.JTextArea();
        jScrollPanelTablaEventos = new javax.swing.JScrollPane();
        TablaEventos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(833, 633));

        jPanel2.setBackground(new java.awt.Color(144, 168, 246));
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

        regresar.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        regresar.setText("Hacer otra simulacion");
        regresar.setFocusable(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel2.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 30));

        labelUnidadTiempo.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelUnidadTiempo.setForeground(new java.awt.Color(0, 0, 0));
        labelUnidadTiempo.setText("Cantidad de clientes que no esperan");
        jPanel2.add(labelUnidadTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        labelPresentarTablaEventos.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelPresentarTablaEventos.setForeground(new java.awt.Color(0, 0, 0));
        labelPresentarTablaEventos.setText("Cantidad de clientes que se van sin ser atentidos");
        jPanel2.add(labelPresentarTablaEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        labelDuracion.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelDuracion.setForeground(new java.awt.Color(0, 0, 0));
        labelDuracion.setText("Probabilidad de esperar (expresado en porcentaje %)");
        jPanel2.add(labelDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 470, 20));

        labelCantClientesPermitidos.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCantClientesPermitidos.setForeground(new java.awt.Color(0, 0, 0));
        labelCantClientesPermitidos.setText("Cantidad promedio de clientes en cola");
        jPanel2.add(labelCantClientesPermitidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        labelCostoEsperaCliente.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCostoEsperaCliente.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoEsperaCliente.setText("Cantidad promedio de clientes en el sistema");
        jPanel2.add(labelCostoEsperaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        labelCantidadServidores.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCantidadServidores.setForeground(new java.awt.Color(0, 0, 0));
        labelCantidadServidores.setText("Tiempo promedio de un cliente en cola");
        jPanel2.add(labelCantidadServidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        labelCostoServidor.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCostoServidor.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoServidor.setText("Tiempo promedio de un cliente en el sistema");
        jPanel2.add(labelCostoServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        labelTablaEventos.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTablaEventos.setForeground(new java.awt.Color(0, 0, 0));
        labelTablaEventos.setText("Tabla de eventos");
        jPanel2.add(labelTablaEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, 30));

        labelTELL1.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL1.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL1.setText("Tiempo adicional");
        jPanel2.add(labelTELL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        labelTELL2.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL2.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL2.setText("Tiempo adicional");
        jPanel2.add(labelTELL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        labelTELL3.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL3.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL3.setText("Relacion optima");
        jPanel2.add(labelTELL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 30));

        labelTELL4.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL4.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL4.setText("Porcentaje de utilizacion de cada servidor");
        jPanel2.add(labelTELL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, 30));

        cantClientesNoEsperan.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        cantClientesNoEsperan.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(cantClientesNoEsperan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 20));

        cantClientesSeVanSinAtender.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        cantClientesSeVanSinAtender.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(cantClientesSeVanSinAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, 20));

        probabilidadEsperar.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        probabilidadEsperar.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(probabilidadEsperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, 20));

        cantPromedioClientesEnCola.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        cantPromedioClientesEnCola.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(cantPromedioClientesEnCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 20));

        cantPromedioClientesEnSistema.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        cantPromedioClientesEnSistema.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(cantPromedioClientesEnSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, 20));

        tiempoPromedioClienteEnCola.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        tiempoPromedioClienteEnCola.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tiempoPromedioClienteEnCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, 20));

        tiempoPromedioClienteEnSistema.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        tiempoPromedioClienteEnSistema.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tiempoPromedioClienteEnSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, 20));

        tiempoAdicional.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        tiempoAdicional.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tiempoAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, 30));

        relacionOptima.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        relacionOptima.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(relacionOptima, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, 30));

        porcentajeGeneralUtilizacionServidores.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        porcentajeGeneralUtilizacionServidores.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(porcentajeGeneralUtilizacionServidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, 30));

        labelTELL5.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL5.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL5.setText("Porcentaje de utilizacion general de los servidores");
        jPanel2.add(labelTELL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 30));

        espacio.setBackground(new java.awt.Color(144, 168, 246));

        javax.swing.GroupLayout espacioLayout = new javax.swing.GroupLayout(espacio);
        espacio.setLayout(espacioLayout);
        espacioLayout.setHorizontalGroup(
            espacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        espacioLayout.setVerticalGroup(
            espacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel2.add(espacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 980, 780, 180));

        porcentajesUtilizacionPorServidores.setEditable(false);
        porcentajesUtilizacionPorServidores.setColumns(20);
        porcentajesUtilizacionPorServidores.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        porcentajesUtilizacionPorServidores.setRows(5);
        jScrollPane3.setViewportView(porcentajesUtilizacionPorServidores);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 770, 110));

        jScrollPanelTablaEventos.setAutoscrolls(true);

        TablaEventos.setEditable(false);
        TablaEventos.setColumns(20);
        TablaEventos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TablaEventos.setRows(5);
        jScrollPanelTablaEventos.setViewportView(TablaEventos);

        jPanel2.add(jScrollPanelTablaEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 770, 250));

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JTextArea TablaEventos;
    private javax.swing.JLabel cantClientesNoEsperan;
    private javax.swing.JLabel cantClientesSeVanSinAtender;
    private javax.swing.JLabel cantPromedioClientesEnCola;
    private javax.swing.JLabel cantPromedioClientesEnSistema;
    private javax.swing.JPanel espacio;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPanelTablaEventos;
    private javax.swing.JLabel labelCantClientesPermitidos;
    private javax.swing.JLabel labelCantidadServidores;
    private javax.swing.JLabel labelCostoEsperaCliente;
    private javax.swing.JLabel labelCostoServidor;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelPresentarTablaEventos;
    private javax.swing.JLabel labelTELL1;
    private javax.swing.JLabel labelTELL2;
    private javax.swing.JLabel labelTELL3;
    private javax.swing.JLabel labelTELL4;
    private javax.swing.JLabel labelTELL5;
    private javax.swing.JLabel labelTablaEventos;
    private javax.swing.JLabel labelUnidadTiempo;
    private javax.swing.JLabel porcentajeGeneralUtilizacionServidores;
    private javax.swing.JTextArea porcentajesUtilizacionPorServidores;
    private javax.swing.JLabel probabilidadEsperar;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel relacionOptima;
    private javax.swing.JLabel subtitulo1;
    private javax.swing.JLabel tiempoAdicional;
    private javax.swing.JLabel tiempoPromedioClienteEnCola;
    private javax.swing.JLabel tiempoPromedioClienteEnSistema;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
