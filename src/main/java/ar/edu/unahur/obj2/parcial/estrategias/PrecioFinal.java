package ar.edu.unahur.obj2.parcial.estrategias;

import ar.edu.unahur.obj2.parcial.accesorios.Personalizable;

public class PrecioFinal extends PrecioFinalStragegy {
    public PrecioFinal(Personalizable autoPersonalizable) {
        super(autoPersonalizable);
    }

    @Override
    public double precioTotal(Personalizable auto) {
        return this.getAutoPersonalizado().precioConAccesorios(auto);
    }

}
