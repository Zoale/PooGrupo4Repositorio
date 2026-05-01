public class ClienteVIP implements Cliente {

    private String nombre;

    public ClienteVIP(String nombre) {
    	this.nombre = nombre;
    }

    public String getNombre() {
    	return nombre;
    }

    public double calcularDescuento() {
        return 0.30;
    }
}