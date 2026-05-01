public interface Cliente {

    String getNombre();
    double calcularDescuento();
    default double calcularPrecioFinal(double precio) {
        return precio * (1 - calcularDescuento());
    }
}