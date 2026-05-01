public class ClienteMayorista implements Cliente {

    private String nombre;

    public ClienteMayorista(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
    	return nombre;
    	}

    public double calcularDescuento() {
        return 0.25;
    }
}