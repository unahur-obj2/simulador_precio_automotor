package ar.edu.unahur.obj2.parcial;

import ar.edu.unahur.obj2.parcial.accesorios.Personalizable;

public class Auto implements Personalizable {

    private Integer precioBase;
    private Integer cantidadPuertas;
    private Integer velociadMaxima;
    private Integer superficie;

    public Auto(Integer precioBase, Integer cantidadPuertas, Integer velociadMaxima, Integer superficie) {
        this.precioBase = precioBase;
        this.cantidadPuertas = cantidadPuertas;
        this.velociadMaxima = velociadMaxima;
        this.superficie = superficie;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Integer precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public Integer getVelociadMaxima() {
        return velociadMaxima;
    }

    public void setVelociadMaxima(Integer velociadMaxima) {
        this.velociadMaxima = velociadMaxima;
    }

    @Override
    public Integer getSuperficie() {
        return superficie;
    }

    @Override
    public Integer precioConAccesorios(Personalizable auto) {
        return precioBase;
    }

    @Override
    public Boolean esDeportivo() {
        return cantidadPuertas.equals(2) && velociadMaxima >= 160;
    }

    @Override
    public Boolean esVeloz() {
        return velociadMaxima >= 140;
    }

}
