package ar.edu.unahur.obj2.parcial.estrategias;

import ar.edu.unahur.obj2.parcial.accesorios.Personalizable;

public class PrecioFinalConPorcentajeDescuento extends PrecioFinalStragegy {

    private double descuento;

    public PrecioFinalConPorcentajeDescuento(Personalizable autoPersonalizable, double descuento) {
        super(autoPersonalizable);
        this.descuento = descuento;
    }

    @Override
    public double precioTotal(Personalizable auto) {
        return this.getAutoPersonalizado().precioConAccesorios(auto) * (1 - (descuento / 100));
    }

}
