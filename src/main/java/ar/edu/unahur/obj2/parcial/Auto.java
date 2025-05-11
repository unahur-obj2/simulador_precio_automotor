package ar.edu.unahur.obj2.parcial;

import ar.edu.unahur.obj2.parcial.accesorios.Calculable;

public class Auto implements Calculable {

    private Integer precioBase;
    private Integer cantidadPuertas;
    private Integer velociadMaxima;
    private Integer Superficie;

    public Auto(Integer precioBase, Integer cantidadPuertas, Integer velociadMaxima, Integer superficie) {
        this.precioBase = precioBase;
        this.cantidadPuertas = cantidadPuertas;
        this.velociadMaxima = velociadMaxima;
        Superficie = superficie;
    }

    public Boolean esDeportivo() {
        return cantidadPuertas.equals(2) && velociadMaxima >= 160;
    }

    public Boolean esVeloz() {
        return velociadMaxima >= 140;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Integer precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public Integer getVelociadMaxima() {
        return velociadMaxima;
    }

    public void setVelociadMaxima(Integer velociadMaxima) {
        this.velociadMaxima = velociadMaxima;
    }

    public Integer getSuperficie() {
        return Superficie;
    }

    @Override
    public Integer precioTotal(Auto auto) {
        return precioBase;
    }

}
