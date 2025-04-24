/*
 * Representa a un cliente del sistema.
 * Relación de uso con Pedido: Un pedido está asociado a un cliente.
 */
public class Foto {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Imprimiendo foto desde: " + fichero);
    }
}
