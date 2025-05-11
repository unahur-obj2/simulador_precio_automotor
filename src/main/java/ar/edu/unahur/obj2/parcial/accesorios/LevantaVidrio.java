package ar.edu.unahur.obj2.parcial.accesorios;

import ar.edu.unahur.obj2.parcial.Auto;

public class LevantaVidrio extends AutoDecorado {

    private Integer precioPorPuerta;

    public LevantaVidrio(Calculable autoDecorado, Integer precioPorPuerta) {
        super(autoDecorado);
        this.precioPorPuerta = precioPorPuerta;
    }

    @Override
    public Integer precioAccesorio(Auto auto) {
        return precioPorPuerta * auto.getCantidadPuertas();
    }

}
