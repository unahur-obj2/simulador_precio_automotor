package ar.edu.unahur.obj2.parcial.accesorios;

import ar.edu.unahur.obj2.parcial.Auto;

public abstract class AutoDecorado implements Calculable {
    public Calculable autoDecorado;

    public AutoDecorado(Calculable autoDecorado) {
        this.autoDecorado = autoDecorado;
    }

    @Override
    public Integer precioTotal(Auto auto) {
        return autoDecorado.precioTotal(auto) + precioAccesorio(auto);
    }

    public abstract Integer precioAccesorio(Auto auto);
}
