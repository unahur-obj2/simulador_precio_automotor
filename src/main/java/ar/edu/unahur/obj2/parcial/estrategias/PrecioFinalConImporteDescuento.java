package ar.edu.unahur.obj2.parcial.estrategias;

import ar.edu.unahur.obj2.parcial.accesorios.Personalizable;

public class PrecioFinalConImporteDescuento extends PrecioFinalStragegy {
    private double importeDescuento;

    public PrecioFinalConImporteDescuento(Personalizable autoPersonalizable, double importeDescuento) {
        super(autoPersonalizable);
        this.importeDescuento = importeDescuento;
    }

    @Override
    public double precioTotal(Personalizable auto) {
        return this.getAutoPersonalizado().precioConAccesorios(auto) - importeDescuento;
    }

}
