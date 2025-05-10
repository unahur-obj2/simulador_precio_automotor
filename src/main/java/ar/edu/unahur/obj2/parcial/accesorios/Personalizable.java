package ar.edu.unahur.obj2.parcial.accesorios;

public interface Personalizable {
    Integer precioConAccesorios(Personalizable auto);

    Boolean esDeportivo();

    Boolean esVeloz();

    Integer getCantidadPuertas();

    public Integer getSuperficie();
}
