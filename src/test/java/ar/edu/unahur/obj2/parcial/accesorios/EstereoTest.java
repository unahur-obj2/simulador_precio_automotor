package ar.edu.unahur.obj2.parcial.accesorios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.parcial.Auto;

class EstereoTest {
    Auto auto = new Auto(5000000, 4, 170, 5);
    Personalizable estereo = new Estereo(auto, 15000, 20000);

    @Test
    void dadoAutoConEstereo_cuandoSeCalculaPrecioTotal_entoncesPrecioEsIncrementadoCorrectamente() {
        assertEquals(5095000, estereo.precioConAccesorios(auto));
    }
}
