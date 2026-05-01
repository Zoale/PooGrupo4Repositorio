public class ClienteNuevo implements Cliente {

    private String nombre;

    public ClienteNuevo(String nombre) {
    	this.nombre = nombre;
    }

    public String getNombre() {
    	return nombre;
    }

    public double calcularDescuento() {
        return 0.05;
    }
}