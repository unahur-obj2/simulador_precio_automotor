package ar.edu.unahur.obj2.parcial;

import ar.edu.unahur.obj2.parcial.accesorios.Personalizable;
import ar.edu.unahur.obj2.parcial.estrategias.PrecioFinalStragegy;

public class Simulador {
    private PrecioFinalStragegy precioFinalStragegy;

    public Simulador(PrecioFinalStragegy precioFinalStragegy) {
        this.precioFinalStragegy = precioFinalStragegy;
    }

    public void setPrecioFinalStragegy(PrecioFinalStragegy precioFinalStragegy) {
        this.precioFinalStragegy = precioFinalStragegy;
    }

    public double simulacionDePrecio(Personalizable auto) {
        return precioFinalStragegy.precioTotal(auto);
    }

}
