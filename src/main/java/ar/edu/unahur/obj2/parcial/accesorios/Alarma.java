package ar.edu.unahur.obj2.parcial.accesorios;

public class Alarma extends AutoDecorado {

    private Integer precioAlarma;

    public Alarma(Personalizable autoDecorado, Integer precioAlarma) {
        super(autoDecorado);
        this.precioAlarma = precioAlarma;
    }

    @Override
    public Integer precioAccesorio(Personalizable auto) {
        return Boolean.TRUE.equals(auto.esDeportivo()) ? precioAlarma + 30000 : precioAlarma;
    }

}
