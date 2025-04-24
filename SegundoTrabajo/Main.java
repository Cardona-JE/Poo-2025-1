import java.util.Date;
/*
 * Clase principal con caso de prueba.
 * Demuestra la creación de productos y el uso de polimorfismo.
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("123456", "Ana Pérez");
        
        // Creación polimórfica de productos
        Producto[] productos = {
            new Camara(1, "Sony", "Alpha 7IV"),  // Subclase de Producto
            new Impresion(2, "CMYK", new Foto[]{
                new Foto("vacaciones.jpg"),
                new Foto("cumpleaños.png")
            })
        };

        Pedido pedido = new Pedido(cliente, productos, new Date(), 411111111);
        pedido.mostrarPedido();  // Llama a mostrarDetalle() polimórficamente
    }
}