public class Omnibus extends Vehiculo {

    private int cantidadPasajeros;

    public Omnibus(String patente, double nivelCombustible, int cantidadPasajeros) {
        super(patente, nivelCombustible);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public void acelerar() {
        nivelCombustible -= 5 + (cantidadPasajeros * 0.1);
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
}
