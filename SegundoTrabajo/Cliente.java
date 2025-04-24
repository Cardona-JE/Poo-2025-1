/*
 * Representa a un cliente del sistema.
 * Relación de uso con Pedido: Un pedido está asociado a un cliente.
 */
public class Cliente {
    private String cedula;
    private String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Getters
    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }
}