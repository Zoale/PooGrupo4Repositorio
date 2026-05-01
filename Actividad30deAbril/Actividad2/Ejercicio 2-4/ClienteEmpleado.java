public class ClienteEmpleado implements Cliente {

    private String nombre;

    public ClienteEmpleado(String nombre) {
    	this.nombre = nombre;
    }

    public String getNombre() {
    	return nombre;
    }

    public double calcularDescuento() {
        return 0.40;
    }
}