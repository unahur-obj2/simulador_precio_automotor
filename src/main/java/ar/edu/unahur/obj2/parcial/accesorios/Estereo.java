package ar.edu.unahur.obj2.parcial.accesorios;

import ar.edu.unahur.obj2.parcial.Auto;

public class Estereo extends AutoDecorado {
    private Integer precioColocacion;
    private Integer precioParlante;

    public Estereo(Calculable autoDecorado, Integer precioColocacion, Integer precioParlante) {
        super(autoDecorado);
        this.precioColocacion = precioColocacion;
        this.precioParlante = precioParlante;
    }

    @Override
    public Integer precioAccesorio(Auto auto) {
        return precioColocacion + (precioParlante * auto.getCantidadPuertas());
    }

}
