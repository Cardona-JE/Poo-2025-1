import java.util.Date;
/*
 * Gestiona un pedido de productos. 
 * Demuestra polimorfismo al llamar a mostrarDetalle() sin verificar tipos.
 */
public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Tarjeta: " + numeroTarjetaCredito);
        
        // Polimorfismo: Llama al método común sin conocer el tipo concreto
        for (Producto p : productos) {
            p.mostrarDetalle();  // ¡Sin instanceof!
        }
    }
}