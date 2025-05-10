package ar.edu.unahur.obj2.parcial.accesorios;

public class LevantaVidrio extends AutoDecorado {

    private Integer precioPorPuerta;

    public LevantaVidrio(Personalizable autoDecorado, Integer precioPorPuerta) {
        super(autoDecorado);
        this.precioPorPuerta = precioPorPuerta;
    }

    @Override
    public Integer precioAccesorio(Personalizable auto) {
        return precioPorPuerta * auto.getCantidadPuertas();
    }

}
