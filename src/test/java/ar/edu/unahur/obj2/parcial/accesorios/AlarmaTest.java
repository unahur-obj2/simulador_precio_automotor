package ar.edu.unahur.obj2.parcial.accesorios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.parcial.Auto;

class AlarmaTest {
    Auto autoDepotivo = new Auto(5000000, 2, 170, 5);
    Auto autoNoDeportivoPuertas = new Auto(5000000, 4, 170, 5);
    Auto autoNoDeportivoVelocidad = new Auto(5000000, 2, 140, 5);

    @Test
    void dadoAutoDeportivo_cuandoSeCalculaPrecioTotal_entoncesPrecioEsIncrementadoCorrectamente() {
        Personalizable alarma = new Alarma(autoDepotivo, 50000);
        assertEquals(5080000, alarma.precioConAccesorios(autoDepotivo));
    }

    @Test
    void dadoAutoNoDeportivoPuertas_cuandoSeCalculaPrecioTotal_entoncesPrecioEsIncrementadoCorrectamente() {
        Personalizable alarma = new Alarma(autoNoDeportivoPuertas, 50000);
        assertEquals(5050000, alarma.precioConAccesorios(autoNoDeportivoPuertas));
    }

    @Test
    void dadoAutoNoDeportivoVelocidad_cuandoSeCalculaPrecioTotal_entoncesPrecioEsIncrementadoCorrectamente() {
        Personalizable alarma = new Alarma(autoNoDeportivoVelocidad, 50000);
        assertEquals(5050000, alarma.precioConAccesorios(autoNoDeportivoVelocidad));
    }
}
