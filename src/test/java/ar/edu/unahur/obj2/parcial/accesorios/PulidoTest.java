package ar.edu.unahur.obj2.parcial.accesorios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.parcial.Auto;

class PulidoTest {
    Auto autoEsVeloz = new Auto(5000000, 4, 170, 5);
    Auto autoNoEsVeloz = new Auto(5000000, 4, 120, 5);

    @Test
    void dadoAutoVelozConPulidoEconomico_cuandoSeCalculaPrecioTotal_entoncesPrecioEsIncrementadoCorrectamente() {
        Personalizable pulido = new Pulido(autoEsVeloz, 10000);
        assertEquals(5055000, pulido.precioConAccesorios(autoEsVeloz));
    }

    @Test
    void dadoAutoVelozConPulidoCaro_cuandoSeCalculaPrecioTotal_entoncesPrecioEsIncrementadoCorrectamente() {
        Personalizable pulido = new Pulido(autoEsVeloz, 25000);
        assertEquals(5100000, pulido.precioConAccesorios(autoEsVeloz));
    }

    @Test
    void dadoAutoNoVelozConPulidoEconomico_cuandoSeCalculaPrecioTotal_entoncesPrecioEsIncrementadoCorrectamente() {
        Personalizable pulido = new Pulido(autoNoEsVeloz, 10000);
        assertEquals(5050000, pulido.precioConAccesorios(autoNoEsVeloz));
    }

    @Test
    void dadoAutoNoVelozConPulidoCaro_cuandoSeCalculaPrecioTotal_entoncesPrecioEsIncrementadoCorrectamente() {
        Personalizable pulido = new Pulido(autoNoEsVeloz, 25000);
        assertEquals(5100000, pulido.precioConAccesorios(autoNoEsVeloz));
    }

}
