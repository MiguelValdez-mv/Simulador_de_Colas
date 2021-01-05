package Componentes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Componentes.Probabilidad;

/**
 *
 * @author angel-rs
 */
 public class ProbabilidadTest {
    /**
     * Test of getValor method, of class Probabilidad.
     * Al llamar "getValor", el valor retornado debe ser el mismo suministrado al constructor
     */
    @Test
    public void testGetValor() {
        int expResult = 1;
        Probabilidad p = new Probabilidad(expResult, 5, 3, 0, 5);
        assertEquals(p.getValor(), expResult);
    }

    /**
     * Test of setValor method, of class Probabilidad.
     * Después de hacer un llamado al método "setValor", el valor de "valor" debe ser el mismo suministrado
     * Al llamado en el método "setValor"
     */
    @Test
    public void testSetValor() {
        int newValor = 0;
        Probabilidad p = new Probabilidad(1, 5, 3, 0, 5);
        p.setValor(newValor);
        assertEquals(p.getValor(), newValor);
    }

    /**
     * Test of getPorcentaje method, of class Probabilidad.
     * Al llamar "getPorcentaje", el valor retornado debe ser el mismo suministrado al constructor
     */
    @Test
    public void testGetPorcentaje() {
        int expResult = 5;
        Probabilidad p = new Probabilidad(1, expResult, 3, 0, 5);
        assertEquals(p.getPorcentaje(), expResult);
    }

    /**
     * Test of setPorcentaje method, of class Probabilidad.
     * Después de hacer un llamado al método "setPorcentaje", el valor de "porcentaje" debe ser el mismo suministrado
     * Al llamado en el método "setPorcentaje"
     */
    @Test
    public void testSetPorcentaje() {
        int newValor = 0;
        Probabilidad p = new Probabilidad(1, newValor, 3, 0, 5);
        p.setPorcentaje(newValor);
        assertEquals(p.getPorcentaje(), newValor);
    }

    /**
     * Test of getPorcentajeAcum method, of class Probabilidad.
     * Al llamar "getPorcentajeAcum", el valor retornado debe ser el mismo suministrado al constructor
     */
    @Test
    public void testGetPorcentajeAcum() {
        int expResult = 0;
        Probabilidad p = new Probabilidad(1, 5, expResult, 0, 5);
        assertEquals(p.getPorcentajeAcum(), expResult);
    }

    /**
     * Test of setPorcentajeAcum method, of class Probabilidad.
     * Después de hacer un llamado al método "setPorcentajeAcum", el valor de "porcentaje" debe ser el mismo suministrado
     * Al llamado en el método "setPorcentajeAcum"
     */
    @Test
    public void testSetPorcentajeAcum() {
        int newValor = 0;
        Probabilidad p = new Probabilidad(1, 5, newValor, 0, 5);
        p.setPorcentajeAcum(newValor);
        assertEquals(p.getPorcentajeAcum(), newValor);
    }

    /**
     * Test of getBordeInferior method, of class Probabilidad.
     * Al llamar "getBordeInferior", el valor retornado debe ser el mismo suministrado al constructor
     */
    @Test
    public void testGetBordeInferior() {
        int expResult = 0;
        Probabilidad p = new Probabilidad(1, 5, 3, expResult, 5);
        assertEquals(p.getBordeInferior(), expResult);
    }

    /**
     * Test of setBordeInferior method, of class Probabilidad.
     * Después de hacer un llamado al método "setBordeInferior", el valor de "bordeInferior" debe ser el mismo suministrado
     * Al llamado en el método "setBordeInferior"
     */
    @Test
    public void testSetBordeInferior() {
        int newValor = 8;
        Probabilidad p = new Probabilidad(1, 5, 1, 0, 5);
        p.setBordeInferior(newValor);
        assertEquals(p.getBordeInferior(), newValor);
    }

    /**
     * Test of getBordeSuperior method, of class Probabilidad.
     * Al llamar "getBordeSuperior", el valor retornado debe ser el mismo suministrado al constructor
     */
    @Test
    public void testGetBordeSuperior() {
        int expResult = 10;
        Probabilidad p = new Probabilidad(1, 5, 3, 0, expResult);
        assertEquals(p.getBordeSuperior(), expResult);
    }

    /**
     * Test of setBordeSuperior method, of class Probabilidad.
     * Después de hacer un llamado al método "setBordeSuperior", el valor de "bordeSuperior" debe ser el mismo suministrado
     * Al llamado en el método "setBordeSuperior"
     */
    @Test
    public void testSetBordeSuperior() {
        int newValor = 5;
        Probabilidad p = new Probabilidad(1, 5, 1, 0, 10);
        p.setBordeSuperior(newValor);
        assertEquals(p.getBordeSuperior(), newValor);
    }
}
