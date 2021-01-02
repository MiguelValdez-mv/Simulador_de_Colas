
package GUI;

import Constantes.Constantes;
import Componentes.TablaDistribucion;
import Utils.Cadena;
import Utils.MensajeModal;
import Utils.Numero;

/**
 * En este JFrame el usuario podra especificar los parametros de entrada de la simulacion
 * 
 * @version Nº1 28/12/2020 
 * @author Miguel Valdez
 */
public class ParametrosDeEntrada extends javax.swing.JFrame {

    public ParametrosDeEntrada() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoValoresTELL = new javax.swing.ButtonGroup();
        grupoValoresTiempoServicio = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        labelUnidadTiempo = new javax.swing.JLabel();
        unidadTiempo = new javax.swing.JComboBox<>();
        labelPresentarTablaEventos = new javax.swing.JLabel();
        presentarTablaEventos = new javax.swing.JCheckBox();
        labelDuracion = new javax.swing.JLabel();
        duracion = new javax.swing.JTextField();
        unidadTiempoActual = new javax.swing.JLabel();
        labelCantClientesPermitidos = new javax.swing.JLabel();
        cantClientesPermitidos = new javax.swing.JTextField();
        labelCostoEsperaCliente = new javax.swing.JLabel();
        costoEsperaCliente = new javax.swing.JTextField();
        unidadCostoEsperaCliente = new javax.swing.JLabel();
        labelCantidadServidores = new javax.swing.JLabel();
        cantidadServidores = new javax.swing.JTextField();
        labelCostoServidor = new javax.swing.JLabel();
        costoServidor = new javax.swing.JTextField();
        labelTiempoEntreLlegadas = new javax.swing.JLabel();
        valoresManualesTell = new javax.swing.JRadioButton();
        valoresArchivoTell = new javax.swing.JRadioButton();
        labelValorTell = new javax.swing.JLabel();
        valorTell = new javax.swing.JTextField();
        labelPorcentajeTell = new javax.swing.JLabel();
        porcentajeTell = new javax.swing.JTextField();
        AgregarValorTellManual = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        valoresTellManuales = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        valoresTellArchivo = new javax.swing.JTextArea();
        LeerArchivoTell = new javax.swing.JButton();
        labelTiempoServicios = new javax.swing.JLabel();
        valoresManualesTiempoServicio = new javax.swing.JRadioButton();
        labelValorTiempoServicio = new javax.swing.JLabel();
        valorTiempoServicio = new javax.swing.JTextField();
        labelPorcentajeTiempoServicio = new javax.swing.JLabel();
        valorPorcentajeTiempoServicio = new javax.swing.JTextField();
        AgregarValorTiempoServicioManual = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        valoresTiempoServicioManuales = new javax.swing.JTextArea();
        valoresArchivoTiempoServicio = new javax.swing.JRadioButton();
        LeerArchivoTiempoServicio = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        valoresTiempoServicioArchivo = new javax.swing.JTextArea();
        unidadCostoServidor = new javax.swing.JLabel();
        ComenzarSimulacion = new javax.swing.JButton();
        espacio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Colas - IO 2021");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 248, 224));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Simulador de Colas");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        subtitulo.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(0, 0, 0));
        subtitulo.setText("PARAMETROS DE ENTRADA");
        jPanel1.add(subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 20));

        labelUnidadTiempo.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelUnidadTiempo.setForeground(new java.awt.Color(0, 0, 0));
        labelUnidadTiempo.setText("Unidad de Tiempo");
        jPanel1.add(labelUnidadTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        unidadTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segundos", "Minutos", "Horas", "Dias", "Semanas", "Meses", "Años" }));
        unidadTiempo.setFocusable(false);
        unidadTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadTiempoActionPerformed(evt);
            }
        });
        jPanel1.add(unidadTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        labelPresentarTablaEventos.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelPresentarTablaEventos.setForeground(new java.awt.Color(0, 0, 0));
        labelPresentarTablaEventos.setText("Presentar tabla de eventos");
        jPanel1.add(labelPresentarTablaEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        presentarTablaEventos.setBackground(new java.awt.Color(237, 248, 224));
        presentarTablaEventos.setFocusable(false);
        presentarTablaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentarTablaEventosActionPerformed(evt);
            }
        });
        jPanel1.add(presentarTablaEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        labelDuracion.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelDuracion.setForeground(new java.awt.Color(0, 0, 0));
        labelDuracion.setText("Duracion de la simulacion");
        jPanel1.add(labelDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracionActionPerformed(evt);
            }
        });
        jPanel1.add(duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 42, -1));

        unidadTiempoActual.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        unidadTiempoActual.setForeground(new java.awt.Color(0, 0, 0));
        unidadTiempoActual.setText("Segundos");
        jPanel1.add(unidadTiempoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, 20));

        labelCantClientesPermitidos.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCantClientesPermitidos.setForeground(new java.awt.Color(0, 0, 0));
        labelCantClientesPermitidos.setText("Cantidad de clientes permitidos");
        jPanel1.add(labelCantClientesPermitidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));
        jPanel1.add(cantClientesPermitidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 42, -1));

        labelCostoEsperaCliente.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCostoEsperaCliente.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoEsperaCliente.setText("Costo de espera del cliente");
        jPanel1.add(labelCostoEsperaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));
        jPanel1.add(costoEsperaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 42, -1));

        unidadCostoEsperaCliente.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        unidadCostoEsperaCliente.setForeground(new java.awt.Color(0, 0, 0));
        unidadCostoEsperaCliente.setText("$/Segundo");
        jPanel1.add(unidadCostoEsperaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, 20));

        labelCantidadServidores.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCantidadServidores.setForeground(new java.awt.Color(0, 0, 0));
        labelCantidadServidores.setText("Cantidad de servidores");
        jPanel1.add(labelCantidadServidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));
        jPanel1.add(cantidadServidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 42, -1));

        labelCostoServidor.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelCostoServidor.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoServidor.setText("Costo de cada servidor");
        jPanel1.add(labelCostoServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));
        jPanel1.add(costoServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 42, -1));

        labelTiempoEntreLlegadas.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTiempoEntreLlegadas.setForeground(new java.awt.Color(0, 0, 0));
        labelTiempoEntreLlegadas.setText("Tiempos entre llegadas");
        jPanel1.add(labelTiempoEntreLlegadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        valoresManualesTell.setBackground(new java.awt.Color(237, 248, 224));
        grupoValoresTELL.add(valoresManualesTell);
        valoresManualesTell.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        valoresManualesTell.setForeground(new java.awt.Color(0, 0, 0));
        valoresManualesTell.setText("Valores manuales");
        valoresManualesTell.setFocusable(false);
        jPanel1.add(valoresManualesTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        valoresArchivoTell.setBackground(new java.awt.Color(237, 248, 224));
        grupoValoresTELL.add(valoresArchivoTell);
        valoresArchivoTell.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        valoresArchivoTell.setForeground(new java.awt.Color(0, 0, 0));
        valoresArchivoTell.setText("Valores del archivo");
        valoresArchivoTell.setFocusable(false);
        valoresArchivoTell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valoresArchivoTellActionPerformed(evt);
            }
        });
        jPanel1.add(valoresArchivoTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        labelValorTell.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        labelValorTell.setForeground(new java.awt.Color(0, 0, 0));
        labelValorTell.setText("Valor");
        jPanel1.add(labelValorTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 20));
        jPanel1.add(valorTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 38, -1));

        labelPorcentajeTell.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        labelPorcentajeTell.setForeground(new java.awt.Color(0, 0, 0));
        labelPorcentajeTell.setText("Porcentaje (%)");
        jPanel1.add(labelPorcentajeTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, 20));
        jPanel1.add(porcentajeTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 38, -1));

        AgregarValorTellManual.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        AgregarValorTellManual.setText("Agregar");
        AgregarValorTellManual.setFocusable(false);
        AgregarValorTellManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarValorTellManualActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarValorTellManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 30));

        valoresTellManuales.setEditable(false);
        valoresTellManuales.setColumns(20);
        valoresTellManuales.setRows(5);
        jScrollPane2.setViewportView(valoresTellManuales);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 370, -1));

        valoresTellArchivo.setEditable(false);
        valoresTellArchivo.setColumns(20);
        valoresTellArchivo.setRows(5);
        jScrollPane1.setViewportView(valoresTellArchivo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 370, -1));

        LeerArchivoTell.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        LeerArchivoTell.setText("Leer Archivo");
        LeerArchivoTell.setFocusable(false);
        jPanel1.add(LeerArchivoTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, 30));

        labelTiempoServicios.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTiempoServicios.setForeground(new java.awt.Color(0, 0, 0));
        labelTiempoServicios.setText("Tiempos de servicio");
        jPanel1.add(labelTiempoServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 180, 20));

        valoresManualesTiempoServicio.setBackground(new java.awt.Color(237, 248, 224));
        grupoValoresTiempoServicio.add(valoresManualesTiempoServicio);
        valoresManualesTiempoServicio.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        valoresManualesTiempoServicio.setForeground(new java.awt.Color(0, 0, 0));
        valoresManualesTiempoServicio.setText("Valores manuales");
        valoresManualesTiempoServicio.setFocusable(false);
        jPanel1.add(valoresManualesTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 210, 30));

        labelValorTiempoServicio.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        labelValorTiempoServicio.setForeground(new java.awt.Color(0, 0, 0));
        labelValorTiempoServicio.setText("Valor");
        jPanel1.add(labelValorTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, 20));
        jPanel1.add(valorTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 38, -1));

        labelPorcentajeTiempoServicio.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        labelPorcentajeTiempoServicio.setForeground(new java.awt.Color(0, 0, 0));
        labelPorcentajeTiempoServicio.setText("Porcentaje (%)");
        jPanel1.add(labelPorcentajeTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 670, -1, 20));
        jPanel1.add(valorPorcentajeTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 670, 38, -1));

        AgregarValorTiempoServicioManual.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        AgregarValorTiempoServicioManual.setText("Agregar");
        AgregarValorTiempoServicioManual.setFocusable(false);
        AgregarValorTiempoServicioManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarValorTiempoServicioManualActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarValorTiempoServicioManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, -1, 30));

        valoresTiempoServicioManuales.setEditable(false);
        valoresTiempoServicioManuales.setColumns(20);
        valoresTiempoServicioManuales.setRows(5);
        jScrollPane5.setViewportView(valoresTiempoServicioManuales);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 370, -1));

        valoresArchivoTiempoServicio.setBackground(new java.awt.Color(237, 248, 224));
        grupoValoresTiempoServicio.add(valoresArchivoTiempoServicio);
        valoresArchivoTiempoServicio.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        valoresArchivoTiempoServicio.setForeground(new java.awt.Color(0, 0, 0));
        valoresArchivoTiempoServicio.setText("Valores del archivo");
        valoresArchivoTiempoServicio.setFocusable(false);
        valoresArchivoTiempoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valoresArchivoTiempoServicioActionPerformed(evt);
            }
        });
        jPanel1.add(valoresArchivoTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 630, -1, 20));

        LeerArchivoTiempoServicio.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        LeerArchivoTiempoServicio.setText("Leer Archivo");
        LeerArchivoTiempoServicio.setFocusable(false);
        jPanel1.add(LeerArchivoTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 670, -1, 30));

        valoresTiempoServicioArchivo.setEditable(false);
        valoresTiempoServicioArchivo.setColumns(20);
        valoresTiempoServicioArchivo.setRows(5);
        jScrollPane4.setViewportView(valoresTiempoServicioArchivo);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 720, 370, -1));

        unidadCostoServidor.setFont(new java.awt.Font("Roboto Mono", 2, 15)); // NOI18N
        unidadCostoServidor.setForeground(new java.awt.Color(0, 0, 0));
        unidadCostoServidor.setText("$/Segundo");
        jPanel1.add(unidadCostoServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, 20));

        ComenzarSimulacion.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        ComenzarSimulacion.setText("Comenzar simulacion");
        ComenzarSimulacion.setFocusable(false);
        ComenzarSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarSimulacionActionPerformed(evt);
            }
        });
        jPanel1.add(ComenzarSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 820, -1, 30));

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

        jPanel1.add(espacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 850, 760, 10));

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unidadTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadTiempoActionPerformed
      String valorComboBoxUnidadTiempo = (String) unidadTiempo.getSelectedItem();
      String unidadCosto = "$/" + Cadena.extraerSufijoUnidadTiempo(valorComboBoxUnidadTiempo);
      unidadTiempoActual.setText(valorComboBoxUnidadTiempo);
      unidadCostoEsperaCliente.setText(unidadCosto);
      unidadCostoServidor.setText(unidadCosto);
    }//GEN-LAST:event_unidadTiempoActionPerformed

    private void presentarTablaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentarTablaEventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentarTablaEventosActionPerformed

    private void duracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracionActionPerformed

    private void valoresArchivoTellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valoresArchivoTellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valoresArchivoTellActionPerformed

    private void valoresArchivoTiempoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valoresArchivoTiempoServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valoresArchivoTiempoServicioActionPerformed

    private void ComenzarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarSimulacionActionPerformed
        validarTextField(duracion, Constantes.COPY_DURACION_SIMULACION, 1);
        validarTextField(cantClientesPermitidos, Constantes.COPY_CANT_CLIENTES, 2);
        validarTextField(costoEsperaCliente, Constantes.COPY_COSTO_ESPERA_CLIENTE, 1);
        validarTextField(cantidadServidores, Constantes.COPY_CANT_SERVIDORES, 1);
        validarTextField(costoServidor, Constantes.COPY_COSTO_SERVIDOR, 1);    
    }//GEN-LAST:event_ComenzarSimulacionActionPerformed

    private void AgregarValorTellManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarValorTellManualActionPerformed
        validarTextField(valorTell, Constantes.COPY_VALOR_TELL, 1);
        validarTextField(porcentajeTell, Constantes.COPY_PORCENTAJE_TELL, 1);  
    }//GEN-LAST:event_AgregarValorTellManualActionPerformed

    private void AgregarValorTiempoServicioManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarValorTiempoServicioManualActionPerformed
       validarTextField(valorTiempoServicio, Constantes.COPY_VALOR_TIEMPO_SERVICIO, 1);
       validarTextField(valorPorcentajeTiempoServicio, Constantes.COPY_PORCENTAJE_TIEMPO_SERVICIO, 1); 
    }//GEN-LAST:event_AgregarValorTiempoServicioManualActionPerformed

    /**
     * @param args Argumentos de la linea de comandos
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParametrosDeEntrada().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarValorTellManual;
    private javax.swing.JButton AgregarValorTiempoServicioManual;
    private javax.swing.JButton ComenzarSimulacion;
    private javax.swing.JButton LeerArchivoTell;
    private javax.swing.JButton LeerArchivoTiempoServicio;
    private javax.swing.JTextField cantClientesPermitidos;
    private javax.swing.JTextField cantidadServidores;
    private javax.swing.JTextField costoEsperaCliente;
    private javax.swing.JTextField costoServidor;
    private javax.swing.JTextField duracion;
    private javax.swing.JPanel espacio;
    private javax.swing.ButtonGroup grupoValoresTELL;
    private javax.swing.ButtonGroup grupoValoresTiempoServicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelCantClientesPermitidos;
    private javax.swing.JLabel labelCantidadServidores;
    private javax.swing.JLabel labelCostoEsperaCliente;
    private javax.swing.JLabel labelCostoServidor;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelPorcentajeTell;
    private javax.swing.JLabel labelPorcentajeTiempoServicio;
    private javax.swing.JLabel labelPresentarTablaEventos;
    private javax.swing.JLabel labelTiempoEntreLlegadas;
    private javax.swing.JLabel labelTiempoServicios;
    private javax.swing.JLabel labelUnidadTiempo;
    private javax.swing.JLabel labelValorTell;
    private javax.swing.JLabel labelValorTiempoServicio;
    private javax.swing.JTextField porcentajeTell;
    private javax.swing.JCheckBox presentarTablaEventos;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel unidadCostoEsperaCliente;
    private javax.swing.JLabel unidadCostoServidor;
    private javax.swing.JComboBox<String> unidadTiempo;
    private javax.swing.JLabel unidadTiempoActual;
    private javax.swing.JTextField valorPorcentajeTiempoServicio;
    private javax.swing.JTextField valorTell;
    private javax.swing.JTextField valorTiempoServicio;
    private javax.swing.JRadioButton valoresArchivoTell;
    private javax.swing.JRadioButton valoresArchivoTiempoServicio;
    private javax.swing.JRadioButton valoresManualesTell;
    private javax.swing.JRadioButton valoresManualesTiempoServicio;
    private javax.swing.JTextArea valoresTellArchivo;
    private javax.swing.JTextArea valoresTellManuales;
    private javax.swing.JTextArea valoresTiempoServicioArchivo;
    private javax.swing.JTextArea valoresTiempoServicioManuales;
    // End of variables declaration//GEN-END:variables

    /**
     * Valida el contenido dentro de un input (JTextField)
     * 
     * @param jTextField Input a validar
     * @param nombreParametro Nombre del parametro del input
     * @param valorMinimo valor minimo del parametro
     * @return Booleano que indica si hubo algun error
     */
    private boolean validarTextField(javax.swing.JTextField jTextField, String nombreParametro, int valorMinimo){
        boolean hayError = false;
        String mensajeError = "Fallo al ingresar parametro: " + nombreParametro.toUpperCase() + "\n\n";
        
        if(!Numero.esNumero(jTextField.getText())){
            MensajeModal.error(mensajeError + "Debe ser un numero...");
            hayError = true;
        }else if(Integer.parseInt(jTextField.getText()) < valorMinimo){
            MensajeModal.error(mensajeError + "Debe ser un numero mayor a " + (valorMinimo - 1) + "...");
            hayError = true; 
        }
        
        if(hayError){
            jTextField.setText("");
        }
        
        return hayError;
    }   
}
