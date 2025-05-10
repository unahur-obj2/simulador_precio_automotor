package ar.edu.unahur.obj2.parcial.accesorios;

public class Estereo extends AutoDecorado {
    private Integer precioColocacion;
    private Integer precioParlante;

    public Estereo(Personalizable autoDecorado, Integer precioColocacion, Integer precioParlante) {
        super(autoDecorado);
        this.precioColocacion = precioColocacion;
        this.precioParlante = precioParlante;
    }

    @Override
    public Integer precioAccesorio(Personalizable auto) {
        return precioColocacion + (precioParlante * auto.getCantidadPuertas());
    }

}
