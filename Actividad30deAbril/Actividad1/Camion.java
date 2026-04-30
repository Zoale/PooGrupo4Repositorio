public class Camion extends Vehiculo {

    private double capacidadCarga;

    public Camion(String patente, double nivelCombustible, double capacidadCarga) {
        super(patente, nivelCombustible);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void acelerar() {
        nivelCombustible -= 5 + (capacidadCarga * 0.01);
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
