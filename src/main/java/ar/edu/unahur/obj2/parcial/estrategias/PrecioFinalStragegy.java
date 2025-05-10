package ar.edu.unahur.obj2.parcial.estrategias;

import ar.edu.unahur.obj2.parcial.accesorios.Personalizable;

public abstract class PrecioFinalStragegy {
    private Personalizable autoPersonalizado;

    protected PrecioFinalStragegy(Personalizable autoPersonalizable) {
        this.autoPersonalizado = autoPersonalizable;
    }

    public abstract double precioTotal(Personalizable auto);

    public Personalizable getAutoPersonalizado() {
        return autoPersonalizado;
    }
}
