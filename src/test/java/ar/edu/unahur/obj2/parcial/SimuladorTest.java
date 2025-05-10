package ar.edu.unahur.obj2.parcial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.parcial.accesorios.Alarma;
import ar.edu.unahur.obj2.parcial.accesorios.Estereo;
import ar.edu.unahur.obj2.parcial.accesorios.LevantaVidrio;
import ar.edu.unahur.obj2.parcial.accesorios.Personalizable;
import ar.edu.unahur.obj2.parcial.accesorios.Pulido;
import ar.edu.unahur.obj2.parcial.estrategias.PrecioFinal;
import ar.edu.unahur.obj2.parcial.estrategias.PrecioFinalConImporteDescuento;
import ar.edu.unahur.obj2.parcial.estrategias.PrecioFinalConPorcentajeDescuento;

class SimuladorTest {
    Auto auto = new Auto(5000000, 4, 170, 5);
    Personalizable autoConAccesorios = new Estereo(
            new Pulido(
                    new LevantaVidrio(auto, 30000), 25000),
            15000, 20000);
    Simulador simulador = new Simulador(new PrecioFinal(autoConAccesorios));

    @Test
    void datoUnAutoConAccesorio_cuandoUsaLaEstraregiaPrecioFinal_entoncesLaSimualcioDePrecioSeCalculaCorrectamente() {

        assertEquals(5315000, simulador.simulacionDePrecio(autoConAccesorios));

    }

    @Test
    void datoUnAutoConAccesorio_cuandoCambioLaEstraregiaPrecioFinalPorcentajeDescuento_entoncesLaSimualcioDePrecioSeCalculaCorrectamente() {
        simulador.setPrecioFinalStragegy(new PrecioFinalConPorcentajeDescuento(autoConAccesorios, 10));
        assertEquals(4783500, simulador.simulacionDePrecio(autoConAccesorios));
    }

    @Test
    void datoUnAutoConAccesorioYAlarma_cuandoCambioLaEstraregiaPrecioFinaPrecioDescuento_entoncesLaSimualcioDePrecioSeCalculaCorrectamente() {
        Personalizable autoConAccesoriosYAlama = new Alarma(autoConAccesorios, 50000);
        simulador.setPrecioFinalStragegy(new PrecioFinalConImporteDescuento(autoConAccesoriosYAlama, 200000));
        assertEquals(5165000, simulador.simulacionDePrecio(autoConAccesorios));
    }
}
