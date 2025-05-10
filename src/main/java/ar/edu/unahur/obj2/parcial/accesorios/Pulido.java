package ar.edu.unahur.obj2.parcial.accesorios;

public class Pulido extends AutoDecorado {

    private Integer precioPulido;

    public Pulido(Personalizable autoDecorado, Integer precioPulido) {
        super(autoDecorado);
        this.precioPulido = precioPulido;
    }

    @Override
    public Integer precioAccesorio(Personalizable auto) {
        Integer pulidoPorSuperficie = precioPulido * auto.getSuperficie()
                + (Boolean.TRUE.equals(auto.esVeloz()) ? 5000 : 0);
        return Integer.min(100000, pulidoPorSuperficie);
    }

}
