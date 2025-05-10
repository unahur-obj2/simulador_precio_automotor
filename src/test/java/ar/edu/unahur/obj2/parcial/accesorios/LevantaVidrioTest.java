package ar.edu.unahur.obj2.parcial.accesorios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.parcial.Auto;

class LevantaVidrioTest {
    Auto auto = new Auto(5000000, 4, 170, 5);
    Personalizable levantaVidrios = new LevantaVidrio(auto, 30000);

    @Test
    void dadoAutoConLevantaVidrios_cuandoSeCalculaPrecioTotal_entoncesPrecioEsIncrementadoCorrectamente() {
        assertEquals(5120000, levantaVidrios.precioConAccesorios(auto));
    }
}
