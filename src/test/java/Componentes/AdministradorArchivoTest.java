package Componentes;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Componentes.AdministradorArchivo;

/**
 *
 * @author angel-rs
 */
public class AdministradorArchivoTest {
    /* TODO */

    /**
     * Test of getArchivoEntrada method, of class AdministradorArchivo.
     */
    @Test
    public void testGetArchivoEntrada() {
        System.out.println("getArchivoEntrada");
        AdministradorArchivo instance = new AdministradorArchivo();
        File expResult = null;
        File result = instance.getArchivoEntrada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivoEntrada method, of class AdministradorArchivo.
     */
    @Test
    public void testSetArchivoEntrada() {
        System.out.println("setArchivoEntrada");
        File archivoEntrada = null;
        AdministradorArchivo instance = new AdministradorArchivo();
        instance.setArchivoEntrada(archivoEntrada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArchivoSalida method, of class AdministradorArchivo.
     */
    @Test
    public void testGetArchivoSalida() {
        System.out.println("getArchivoSalida");
        AdministradorArchivo instance = new AdministradorArchivo();
        File expResult = null;
        File result = instance.getArchivoSalida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivoSalida method, of class AdministradorArchivo.
     */
    @Test
    public void testSetArchivoSalida() {
        System.out.println("setArchivoSalida");
        File archivoSalida = null;
        AdministradorArchivo instance = new AdministradorArchivo();
        instance.setArchivoSalida(archivoSalida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalida method, of class AdministradorArchivo.
     */
    @Test
    public void testGetSalida() {
        System.out.println("getSalida");
        AdministradorArchivo instance = new AdministradorArchivo();
        String expResult = "";
        String result = instance.getSalida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalida method, of class AdministradorArchivo.
     */
    @Test
    public void testSetSalida() {
        System.out.println("setSalida");
        String salida = "";
        AdministradorArchivo instance = new AdministradorArchivo();
        instance.setSalida(salida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarArchivo method, of class AdministradorArchivo.
     */
    @Test
    public void testValidarArchivo() {
        System.out.println("validarArchivo");
        File archivo = null;
        AdministradorArchivo instance = new AdministradorArchivo();
        boolean expResult = false;
        boolean result = instance.validarArchivo(archivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerEntrada method, of class AdministradorArchivo.
     */
    @Test
    public void testLeerEntrada() {
        System.out.println("leerEntrada");
        String nombreParametro = "";
        AdministradorArchivo instance = new AdministradorArchivo();
        TablaDistribucion expResult = null;
        TablaDistribucion result = instance.leerEntrada(nombreParametro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escribirSalida method, of class AdministradorArchivo.
     */
    @Test
    public void testEscribirSalida() {
        System.out.println("escribirSalida");
        String valor = "";
        AdministradorArchivo instance = new AdministradorArchivo();
        instance.escribirSalida(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPosicion method, of class AdministradorArchivo.
     */
    @Test
    public void testObtenerPosicion() {
        System.out.println("obtenerPosicion");
        String linea = "";
        AdministradorArchivo instance = new AdministradorArchivo();
        int expResult = 0;
        int result = instance.obtenerPosicion(linea);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarLinea method, of class AdministradorArchivo.
     */
    @Test
    public void testActualizarLinea() {
        System.out.println("actualizarLinea");
        String linea = "";
        AdministradorArchivo instance = new AdministradorArchivo();
        String expResult = "";
        String result = instance.actualizarLinea(linea);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extraerNumero method, of class AdministradorArchivo.
     */
    @Test
    public void testExtraerNumero() {
        System.out.println("extraerNumero");
        String linea = "";
        int posicion = 0;
        AdministradorArchivo instance = new AdministradorArchivo();
        int expResult = 0;
        int result = instance.extraerNumero(linea, posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
