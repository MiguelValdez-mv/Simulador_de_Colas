
package GUI;

import java.sql.Timestamp;
import java.io.*;

import Constantes.*;
import Componentes.*;
import Utils.*;

/**
 * En este JFrame el usuario podra especificar los parametros de entrada de la simulacion
 * 
 * @version Nº1 28/12/2020
 * @author Miguel Valdez
 */
public class ParametrosDeEntrada extends javax.swing.JFrame {
    
    private AdministradorArchivo manejadorArchivo;
    private TablaDistribucion tablaTELLManual;
    private TablaDistribucion tablaTELLArchivo;
    private TablaDistribucion tablaTiempoServicioManual;
    private TablaDistribucion tablaTiempoServicioArchivo;

    public ParametrosDeEntrada() {
        this.manejadorArchivo = new AdministradorArchivo();
        this.tablaTELLManual = new TablaDistribucion(Constantes.COPY_TELL);
        this.tablaTELLArchivo = new TablaDistribucion(Constantes.COPY_TELL);
        this.tablaTiempoServicioManual = new TablaDistribucion(Constantes.COPY_TIEMPO_SERVICIO);
        this.tablaTiempoServicioArchivo = new TablaDistribucion(Constantes.COPY_TIEMPO_SERVICIO);
        initComponents();
    }

    /**
     * Regresa la tabla manual de distribucion de tiempos entre llegadas
     * 
     * @return Tabla manual (actual) de distribucion de tiempos entre llegadas
     */
    public TablaDistribucion getTablaTELLManual() {
        return tablaTELLManual;
    }

    /** 
     * Establece la tabla manual de distribucion de tiempos entre llegadas
     * 
     * @param tablaTELLManual Tabla manual (nueva) de distribucion de tiempos entre llegadas
     */
    public void setTablaTELLManual(TablaDistribucion tablaTELLManual) {
        this.tablaTELLManual = tablaTELLManual;
    }

    /**
     * Regresa la tabla actual seleccionada (desde el archivo) de distribucion de 
     * tiempos entre llegadas
     * 
     * @return Tabla (actual) seleccionada (desde el archivo) de distribucion de 
     * tiempos entre llegadas
     */
    public TablaDistribucion getTablaTELLArchivo() {
        return tablaTELLArchivo;
    }

    /** 
     * Establece la tabla actual seleccionada (desde el archivo) de distribucion de 
     * tiempos entre llegadas
     * 
     * @param tablaTELLArchivo Tabla (nueva) seleccionada (desde archivo)  de distribucion 
     * de tiempos entre llegadas
     */
    public void setTablaTELLArchivo(TablaDistribucion tablaTELLArchivo) {
        this.tablaTELLArchivo = tablaTELLArchivo;
    }

    /**
     * Regresa la tabla manual de distribucion de tiempos de servicio
     * 
     * @return Tabla manual (actual) de distribucion de tiempos de servicio
     */
    public TablaDistribucion getTablaTiempoServicioManual() {
        return tablaTiempoServicioManual;
    }

    /** 
     * Establece la tabla manual de distribucion de tiempos de servicio
     * 
     * @param tablaTiempoServicioManual Tabla manual (nueva) de distribucion de tiempos de servicio
     */
    public void setTablaTiempoServicioManual(TablaDistribucion tablaTiempoServicioManual) {
        this.tablaTiempoServicioManual = tablaTiempoServicioManual;
    }

    /**
     * Regresa la tabla actual seleccionada (desde el archivo) de distribucion de 
     * tiempos de servicio
     * 
     * @return Tabla (actual) seleccionada (desde el archivo) de distribucion de 
     * tiempos de servicio
     */
    public TablaDistribucion getTablaTiempoServicioArchivo() {
        return tablaTiempoServicioArchivo;
    }

    /** 
     * Establece la tabla actual seleccionada (desde el archivo) de distribucion de 
     * tiempos de servicio
     * 
     * @param tablaTiempoServicioArchivo Tabla (nueva) seleccionada (desde archivo)  de distribucion 
     * tiempos de servicio
     */
    public void setTablaTiempoServicioArchivo(TablaDistribucion tablaTiempoServicioArchivo) {
        this.tablaTiempoServicioArchivo = tablaTiempoServicioArchivo;
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
        labelTELL = new javax.swing.JLabel();
        valoresManualesTELL = new javax.swing.JRadioButton();
        valoresArchivoTELL = new javax.swing.JRadioButton();
        labelValorTELL = new javax.swing.JLabel();
        valorTELL = new javax.swing.JTextField();
        labelPorcentajeTELL = new javax.swing.JLabel();
        porcentajeTELL = new javax.swing.JTextField();
        AgregarValorTELLManual = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        valoresTELLManuales = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        valoresTELLArchivo = new javax.swing.JTextArea();
        LeerArchivoTELL = new javax.swing.JButton();
        labelTiempoServicios = new javax.swing.JLabel();
        valoresManualesTiempoServicio = new javax.swing.JRadioButton();
        labelValorTiempoServicio = new javax.swing.JLabel();
        valorTiempoServicio = new javax.swing.JTextField();
        labelPorcentajeTiempoServicio = new javax.swing.JLabel();
        porcentajeTiempoServicio = new javax.swing.JTextField();
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

        jPanel1.setBackground(new java.awt.Color(144, 168, 246));
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

        presentarTablaEventos.setBackground(new java.awt.Color(144, 168, 246));
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

        labelTELL.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTELL.setForeground(new java.awt.Color(0, 0, 0));
        labelTELL.setText("Tiempos entre llegadas");
        jPanel1.add(labelTELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        valoresManualesTELL.setBackground(new java.awt.Color(144, 168, 246));
        grupoValoresTELL.add(valoresManualesTELL);
        valoresManualesTELL.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        valoresManualesTELL.setForeground(new java.awt.Color(0, 0, 0));
        valoresManualesTELL.setText("Valores manuales");
        valoresManualesTELL.setFocusable(false);
        jPanel1.add(valoresManualesTELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        valoresArchivoTELL.setBackground(new java.awt.Color(144, 168, 246));
        grupoValoresTELL.add(valoresArchivoTELL);
        valoresArchivoTELL.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        valoresArchivoTELL.setForeground(new java.awt.Color(0, 0, 0));
        valoresArchivoTELL.setText("Valores del archivo");
        valoresArchivoTELL.setFocusable(false);
        valoresArchivoTELL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valoresArchivoTELLActionPerformed(evt);
            }
        });
        jPanel1.add(valoresArchivoTELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        labelValorTELL.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        labelValorTELL.setForeground(new java.awt.Color(0, 0, 0));
        labelValorTELL.setText("Valor");
        jPanel1.add(labelValorTELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 20));
        jPanel1.add(valorTELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 38, -1));

        labelPorcentajeTELL.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        labelPorcentajeTELL.setForeground(new java.awt.Color(0, 0, 0));
        labelPorcentajeTELL.setText("Porcentaje (%)");
        jPanel1.add(labelPorcentajeTELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, 20));
        jPanel1.add(porcentajeTELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 38, -1));

        AgregarValorTELLManual.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        AgregarValorTELLManual.setText("Agregar");
        AgregarValorTELLManual.setFocusable(false);
        AgregarValorTELLManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarValorTELLManualActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarValorTELLManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 30));

        valoresTELLManuales.setEditable(false);
        valoresTELLManuales.setColumns(20);
        valoresTELLManuales.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        valoresTELLManuales.setRows(5);
        jScrollPane2.setViewportView(valoresTELLManuales);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 370, 110));

        valoresTELLArchivo.setEditable(false);
        valoresTELLArchivo.setColumns(20);
        valoresTELLArchivo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        valoresTELLArchivo.setLineWrap(true);
        valoresTELLArchivo.setRows(5);
        jScrollPane1.setViewportView(valoresTELLArchivo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 370, 110));

        LeerArchivoTELL.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        LeerArchivoTELL.setText("Leer Archivo");
        LeerArchivoTELL.setFocusable(false);
        LeerArchivoTELL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerArchivoTELLActionPerformed(evt);
            }
        });
        jPanel1.add(LeerArchivoTELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, 30));

        labelTiempoServicios.setFont(new java.awt.Font("Roboto Mono", 1, 15)); // NOI18N
        labelTiempoServicios.setForeground(new java.awt.Color(0, 0, 0));
        labelTiempoServicios.setText("Tiempos de servicio");
        jPanel1.add(labelTiempoServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 180, 20));

        valoresManualesTiempoServicio.setBackground(new java.awt.Color(144, 168, 246));
        grupoValoresTiempoServicio.add(valoresManualesTiempoServicio);
        valoresManualesTiempoServicio.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        valoresManualesTiempoServicio.setForeground(new java.awt.Color(0, 0, 0));
        valoresManualesTiempoServicio.setText("Valores manuales");
        valoresManualesTiempoServicio.setFocusable(false);
        jPanel1.add(valoresManualesTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 210, 30));

        labelValorTiempoServicio.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        labelValorTiempoServicio.setForeground(new java.awt.Color(0, 0, 0));
        labelValorTiempoServicio.setText("Valor");
        jPanel1.add(labelValorTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, -1, 20));

        valorTiempoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTiempoServicioActionPerformed(evt);
            }
        });
        jPanel1.add(valorTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, 38, -1));

        labelPorcentajeTiempoServicio.setFont(new java.awt.Font("Roboto Mono", 0, 15)); // NOI18N
        labelPorcentajeTiempoServicio.setForeground(new java.awt.Color(0, 0, 0));
        labelPorcentajeTiempoServicio.setText("Porcentaje (%)");
        jPanel1.add(labelPorcentajeTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 700, -1, 20));
        jPanel1.add(porcentajeTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 700, 38, -1));

        AgregarValorTiempoServicioManual.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        AgregarValorTiempoServicioManual.setText("Agregar");
        AgregarValorTiempoServicioManual.setFocusable(false);
        AgregarValorTiempoServicioManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarValorTiempoServicioManualActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarValorTiempoServicioManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 700, -1, 30));

        valoresTiempoServicioManuales.setEditable(false);
        valoresTiempoServicioManuales.setColumns(20);
        valoresTiempoServicioManuales.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        valoresTiempoServicioManuales.setRows(5);
        jScrollPane5.setViewportView(valoresTiempoServicioManuales);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, 370, 110));

        valoresArchivoTiempoServicio.setBackground(new java.awt.Color(144, 168, 246));
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
        jPanel1.add(valoresArchivoTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 660, -1, 20));

        LeerArchivoTiempoServicio.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        LeerArchivoTiempoServicio.setText("Leer Archivo");
        LeerArchivoTiempoServicio.setFocusable(false);
        LeerArchivoTiempoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerArchivoTiempoServicioActionPerformed(evt);
            }
        });
        jPanel1.add(LeerArchivoTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 700, -1, 30));

        valoresTiempoServicioArchivo.setEditable(false);
        valoresTiempoServicioArchivo.setColumns(20);
        valoresTiempoServicioArchivo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        valoresTiempoServicioArchivo.setRows(5);
        jScrollPane4.setViewportView(valoresTiempoServicioArchivo);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 750, 370, 110));

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
        jPanel1.add(ComenzarSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 880, -1, 30));

        espacio.setBackground(new java.awt.Color(144, 168, 246));

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

        jPanel1.add(espacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 910, 760, 10));

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void valoresArchivoTELLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valoresArchivoTELLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valoresArchivoTELLActionPerformed

    private void valoresArchivoTiempoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valoresArchivoTiempoServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valoresArchivoTiempoServicioActionPerformed

    private void ComenzarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarSimulacionActionPerformed

        if(validarTextField(duracion, Constantes.COPY_DURACION_SIMULACION, 1)){
            return ;
        }
        
        if(validarTextField(cantClientesPermitidos, Constantes.COPY_CANT_CLIENTES, 2)){
            return ;
        }
        
        if(validarTextField(costoEsperaCliente, Constantes.COPY_COSTO_ESPERA_CLIENTE, 1)){
            return ;
        }
        
        if(validarTextField(cantidadServidores, Constantes.COPY_CANT_SERVIDORES, 1)){
            return ;
        }
        
        if(validarTextField(costoServidor, Constantes.COPY_COSTO_SERVIDOR, 1)){
            return ;
        }
        
        if(validarRadioButton(valoresManualesTELL, tablaTELLManual, valoresArchivoTELL, getTablaTELLArchivo(), Constantes.COPY_TELL)){
           return ;
        }
        
        if(validarRadioButton(valoresManualesTiempoServicio, tablaTiempoServicioManual, valoresArchivoTiempoServicio, getTablaTiempoServicioArchivo(), Constantes.COPY_TIEMPO_SERVICIO)){
           return ;
        }
        
        TablaDistribucion tablaTELL = valoresManualesTELL.isSelected() ? tablaTELLManual : tablaTELLArchivo;
        TablaDistribucion tablaTS = valoresManualesTiempoServicio.isSelected() ? tablaTiempoServicioManual : tablaTiempoServicioArchivo;
        
        Simulacion simulacion = new Simulacion((String) unidadTiempo.getSelectedItem(), 
                                                Integer.parseInt(duracion.getText()),
                                                Integer.parseInt(cantClientesPermitidos.getText()), 
                                                Integer.parseInt(costoEsperaCliente.getText()),
                                                Integer.parseInt(cantidadServidores.getText()), 
                                                Integer.parseInt(costoServidor.getText()),
                                                tablaTELL, tablaTS);
        simulacion.iniciar();
        
        // Guardar estadisticas de la simulacion en el archivo
        Timestamp momentoActual = new Timestamp(System.currentTimeMillis());
        File archivoSalidaSimulacion = new File(Constantes.DIRECTORIO_ARCHIVOS + "simulacion_" + momentoActual.getTime() + ".txt");
        this.manejadorArchivo.setArchivoSalida(archivoSalidaSimulacion);
        this.manejadorArchivo.escribirSalida(simulacion.imprimirParametrosEntradaSimulacion() 
                                            + simulacion.imprimirEstadisticasSimulacion()
                                            + simulacion.getCadenaTablaEventos()
                                            , false);

        // Restaurar archivo salida, por si acaso
        this.manejadorArchivo.setArchivoSalida(new File(Constantes.DIRECCION_ARCHIVO_SALIDA));
        
        // Cerramos el JFrame de los parametros de entrada
        this.setVisible(false);
        
        ParametrosDeSalida parametrosSalida = new ParametrosDeSalida();
        
        // Mostramos en pantalla el JFrame de los parametros de salida
        parametrosSalida.setVisible(true);
        
        // Mostarmos los datos de la simulacion
        parametrosSalida.mostrarSalida(simulacion.getEstadisticas(), presentarTablaEventos.isSelected(), simulacion.getCadenaTablaEventos());
    }//GEN-LAST:event_ComenzarSimulacionActionPerformed

    private void AgregarValorTELLManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarValorTELLManualActionPerformed
        if(validarTextField(valorTELL, Constantes.COPY_VALOR_TELL, 1)){
            return ;
        }
        
        if(validarTextField(porcentajeTELL, Constantes.COPY_PORCENTAJE_TELL, 1)){
            return ;
        }
        
        agregarValoresManuales(valorTELL, porcentajeTELL, valoresTELLManuales, tablaTELLManual);
    }//GEN-LAST:event_AgregarValorTELLManualActionPerformed

    private void AgregarValorTiempoServicioManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarValorTiempoServicioManualActionPerformed
        if(validarTextField(valorTiempoServicio, Constantes.COPY_VALOR_TIEMPO_SERVICIO, 1)){
            return ;
        }
        
        if(validarTextField(porcentajeTiempoServicio, Constantes.COPY_PORCENTAJE_TIEMPO_SERVICIO, 1)){
            return ;
        }
        
        agregarValoresManuales(valorTiempoServicio, porcentajeTiempoServicio, valoresTiempoServicioManuales, tablaTiempoServicioManual);
    }//GEN-LAST:event_AgregarValorTiempoServicioManualActionPerformed

    private void LeerArchivoTELLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerArchivoTELLActionPerformed
        setTablaTELLArchivo(manejadorArchivo.leerEntrada(Constantes.COPY_TELL));  
        valoresTELLArchivo.setText(getTablaTELLArchivo().toString());
    }//GEN-LAST:event_LeerArchivoTELLActionPerformed

    private void valorTiempoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTiempoServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTiempoServicioActionPerformed

    private void LeerArchivoTiempoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerArchivoTiempoServicioActionPerformed
       setTablaTiempoServicioArchivo(manejadorArchivo.leerEntrada(Constantes.COPY_TIEMPO_SERVICIO)); 
       valoresTiempoServicioArchivo.setText(getTablaTiempoServicioArchivo().toString());
    }//GEN-LAST:event_LeerArchivoTiempoServicioActionPerformed

    /**
     * @param args Argumentos de la linea de comandos.
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
    private javax.swing.JButton AgregarValorTELLManual;
    private javax.swing.JButton AgregarValorTiempoServicioManual;
    private javax.swing.JButton ComenzarSimulacion;
    private javax.swing.JButton LeerArchivoTELL;
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
    private javax.swing.JLabel labelPorcentajeTELL;
    private javax.swing.JLabel labelPorcentajeTiempoServicio;
    private javax.swing.JLabel labelPresentarTablaEventos;
    private javax.swing.JLabel labelTELL;
    private javax.swing.JLabel labelTiempoServicios;
    private javax.swing.JLabel labelUnidadTiempo;
    private javax.swing.JLabel labelValorTELL;
    private javax.swing.JLabel labelValorTiempoServicio;
    private javax.swing.JTextField porcentajeTELL;
    private javax.swing.JTextField porcentajeTiempoServicio;
    private javax.swing.JCheckBox presentarTablaEventos;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel unidadCostoEsperaCliente;
    private javax.swing.JLabel unidadCostoServidor;
    private javax.swing.JComboBox<String> unidadTiempo;
    private javax.swing.JLabel unidadTiempoActual;
    private javax.swing.JTextField valorTELL;
    private javax.swing.JTextField valorTiempoServicio;
    private javax.swing.JRadioButton valoresArchivoTELL;
    private javax.swing.JRadioButton valoresArchivoTiempoServicio;
    private javax.swing.JRadioButton valoresManualesTELL;
    private javax.swing.JRadioButton valoresManualesTiempoServicio;
    private javax.swing.JTextArea valoresTELLArchivo;
    private javax.swing.JTextArea valoresTELLManuales;
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
    
     /**
     * Valida el contenido dentro de un input (JRadioButton)
     * 
     * @param jRadioButtonManual Input (valor manual) a validar
     * @param tablaManual Tabla de distribucion asociada al input (valor manual)
     * @param jRadioButtonArchivo Input (valor archivo) a validar
     * @param tablaArchivo Tabla de distribucion asociada al input (valor archivo)
     * @param nombreParametro Nombre del parametro asociado a los JRadioButton
     * @return Booleano que indica si hubo algun error
     */
    private boolean validarRadioButton(javax.swing.JRadioButton jRadioButtonManual, TablaDistribucion tablaManual, javax.swing.JRadioButton jRadioButtonArchivo, TablaDistribucion tablaArchivo, String nombreParametro){
        String mensajeError = "Fallo al ingresar parametro: " + nombreParametro.toUpperCase() + "\n\n"; 
        String cadenaErrorPorcentajeAcum = mensajeError + "El porcentaje acumulado no esta completo...";
        
        if(!jRadioButtonManual.isSelected() && !jRadioButtonArchivo.isSelected()){
            MensajeModal.error(mensajeError + "No se selecciono una opcion (valores manuales o leer archivo)...");
            return true;
        }else if(jRadioButtonManual.isSelected() && !tablaManual.hayPorcentajeCompleto()){
            MensajeModal.error(cadenaErrorPorcentajeAcum);
            return true;
        }else if (jRadioButtonArchivo.isSelected() && !tablaArchivo.hayPorcentajeCompleto()){
            MensajeModal.error(cadenaErrorPorcentajeAcum);
            return true;
        }
       
       return false;
    }
    
    /**
     * Agrega (y valida) el valor y el porcentaje de la probabilidad en la tabla 
     * correspondiente
     * 
     * @param jTextFieldValor Input del valor
     * @param jTextFieldPorcentaje Input del porcentaje
     * @param salida Input en donde se mostrara la tabla
     * @param tabla Tabla en la cual se agregara el valor y el porcentaje de la probabilidad
     */
    private void agregarValoresManuales(javax.swing.JTextField jTextFieldValor, javax.swing.JTextField jTextFieldPorcentaje,javax.swing.JTextArea salida,TablaDistribucion tabla){
        int valor = Integer.parseInt(jTextFieldValor.getText());
        int porcentaje =  Integer.parseInt(jTextFieldPorcentaje.getText());
        
      
        if(tabla.comprobarExistencia(valor)){
            jTextFieldValor.setText("");
        }
        
        if(tabla.getPorcentajeAcum() + porcentaje > 100){
            jTextFieldPorcentaje.setText("");
        }
        
        if(tabla.agregarProbabilidad(valor, porcentaje)){
            salida.setText(tabla.toString());   
            jTextFieldValor.setText("");
            jTextFieldPorcentaje.setText("");
            
            if(tabla.hayPorcentajeCompleto()){
                MensajeModal.info("La tabla ha sido completada \n\nEl porcentaje acumulado es del 100%");
            }
        }
    }
}
