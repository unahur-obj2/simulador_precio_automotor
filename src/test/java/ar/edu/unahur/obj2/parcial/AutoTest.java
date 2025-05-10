package ar.edu.unahur.obj2.parcial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AutoTest {
    Auto auto = new Auto(5000000, 4, 170, 5);
    Auto autoDeporitivo = new Auto(5000000, 2, 170, 5);
    Auto autoNoDeporitivoPorPuertas = new Auto(5000000, 4, 170, 5);
    Auto autoNoDeporitivoPorVelocidad = new Auto(5000000, 2, 130, 5);

    @Test
    void testEsDeportivo() {
        assertTrue(autoDeporitivo.esDeportivo());
    }

    @Test
    void testNoEsDeportivoPorPuertas() {
        assertFalse(autoNoDeporitivoPorPuertas.esDeportivo());
    }

    @Test
    void testNoEsDeportivoPorVelocidad() {
        assertFalse(autoNoDeporitivoPorVelocidad.esDeportivo());
    }

    @Test
    void testEsVeloz() {
        assertTrue(autoDeporitivo.esVeloz());
    }

    @Test
    void testNoEsVeloz() {
        assertFalse(autoNoDeporitivoPorVelocidad.esVeloz());
    }

    @Test
    void testGetCantidadPuertas() {
        assertEquals(4, auto.getCantidadPuertas());
    }

    @Test
    void testGetPrecioBase() {
        assertEquals(5000000, auto.getPrecioBase());
    }

    @Test
    void testGetSuperficie() {
        assertEquals(5, auto.getSuperficie());
    }

    @Test
    void testGetVelociadMaxima() {
        assertEquals(170, auto.getVelociadMaxima());
    }

    @Test
    void testPrecioTotal() {
        assertEquals(5000000, auto.getPrecioBase());
    }

    @Test
    void testSetPrecioBase() {
        auto.setPrecioBase(5500000);
        assertEquals(5500000, auto.getPrecioBase());
    }

    @Test
    void testSetVelociadMaxima() {
        auto.setVelociadMaxima(180);
        assertEquals(180, auto.getVelociadMaxima());
    }
}
