package ar.edu.unahur.obj2.parcial.accesorios;

public abstract class AutoDecorado implements Personalizable {
    private Personalizable decorado;

    protected AutoDecorado(Personalizable autoDecorado) {
        this.decorado = autoDecorado;
    }

    @Override
    public Integer precioConAccesorios(Personalizable auto) {
        return decorado.precioConAccesorios(auto) + precioAccesorio(auto);
    }

    public abstract Integer precioAccesorio(Personalizable auto);

    @Override
    public Boolean esDeportivo() {
        return decorado.esDeportivo();
    }

    @Override
    public Boolean esVeloz() {
        return decorado.esVeloz();
    }

    @Override
    public Integer getCantidadPuertas() {
        return decorado.getCantidadPuertas();
    }

    @Override
    public Integer getSuperficie() {
        return decorado.getSuperficie();
    }

    public Personalizable getDecorado() {
        return decorado;
    }

}
