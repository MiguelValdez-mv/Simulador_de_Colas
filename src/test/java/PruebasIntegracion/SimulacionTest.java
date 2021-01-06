/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasIntegracion;

import Componentes.Simulacion;
import Componentes.TablaDistribucion;
import Constantes.Constantes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angel-rs
 */
public class SimulacionTest {

    public SimulacionTest() {
    }

    /**
     * Test of iniciar method, of class Simulacion Se asegura que una vez
     * ejecutada la simulacion, los eventos son generados
     */
    @Test
    public void testSimulacion() {
        TablaDistribucion tablaTELL = new TablaDistribucion(Constantes.COPY_TIEMPO_SERVICIO);
        TablaDistribucion tablaTS = new TablaDistribucion(Constantes.COPY_TIEMPO_SERVICIO);

        tablaTELL.agregarProbabilidad(1, 9);
        tablaTELL.agregarProbabilidad(2, 30);
        tablaTELL.agregarProbabilidad(3, 30);
        tablaTELL.agregarProbabilidad(4, 30);

        tablaTS.agregarProbabilidad(1, 9);
        tablaTS.agregarProbabilidad(2, 30);
        tablaTS.agregarProbabilidad(3, 30);
        tablaTS.agregarProbabilidad(4, 30);

        Simulacion simulacion = new Simulacion("Segundos",
                10,
                10,
                3,
                1,
                5,
                tablaTELL, tablaTS);

        System.out.println("Inicio de la simulacion");
        simulacion.iniciar();
        assertTrue(!simulacion.getSalidas().isEmpty());
    }
}
