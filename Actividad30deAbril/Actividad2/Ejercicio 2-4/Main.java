import java.util.List;

public class Main {

    static void mostrarPrecio(Cliente cliente, double precio) {
        double descuento   = cliente.calcularDescuento();
        double precioFinal = cliente.calcularPrecioFinal(precio);
        System.out.printf("%-22s |  %15.1f%% |  $%,.2f%n",
                cliente.getNombre(), descuento * 100, precioFinal);
    }

    public static void main(String[] args) {
        double precioBase = 10000.0;

        List<Cliente> clientes = List.of(
            new ClienteVIP("Ana Garcia"),
            new ClienteRegular("Carlos Lopez"),
            new ClienteMayorista("Distribuidora Norte"),
            new ClienteMayorista("Kiosco Central"),
            new ClienteNuevo("Pedro Ramirez")
        );

        System.out.printf("%-22s | %-17s | %s%n", "Cliente", "Descuento", "Precio final");
        System.out.println("-".repeat(62));

        for (Cliente x: clientes) {
            mostrarPrecio(x, precioBase);
        }

        //se agrega un cliente a ClienteEmpleado sin tocar nada de lo anterior
        
        System.out.println();
        mostrarPrecio(new ClienteEmpleado("Juan Perez"), precioBase);
    }
}