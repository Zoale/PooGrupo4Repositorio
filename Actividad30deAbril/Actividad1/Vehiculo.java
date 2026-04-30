public class Vehiculo {

    private String patente;
    protected double nivelCombustible;
    private static int cantidadVehiculos = 0;

    public Vehiculo(String patente, double nivelCombustible) {
        this.patente = patente;
        this.nivelCombustible = nivelCombustible;
        cantidadVehiculos++;
    }

    public void acelerar() {
        nivelCombustible -= 5;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(double nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }
}
