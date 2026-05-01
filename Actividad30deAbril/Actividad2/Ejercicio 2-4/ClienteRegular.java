public class ClienteRegular implements Cliente {

    private String nombre;

    public ClienteRegular(String nombre) {
    	this.nombre = nombre;
    }

    public String getNombre() {
    	return nombre;
    }

    public double calcularDescuento() {
        return 0.10;
    }
}