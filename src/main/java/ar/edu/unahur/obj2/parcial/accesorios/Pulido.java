package ar.edu.unahur.obj2.parcial.accesorios;

import ar.edu.unahur.obj2.parcial.Auto;

public class Pulido extends AutoDecorado {

    private Integer precioPulido;

    public Pulido(Calculable autoDecorado, Integer precioPulido) {
        super(autoDecorado);
        this.precioPulido = precioPulido;
    }

    @Override
    public Integer precioAccesorio(Auto auto) {
        Integer pulidoPorSuperficie = precioPulido * auto.getSuperficie() + (auto.esVeloz() ? 5000 : 0);
        return Integer.min(100000, pulidoPorSuperficie);
    }

}
