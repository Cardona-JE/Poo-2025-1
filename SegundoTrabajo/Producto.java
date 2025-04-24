/*
 * Clase abstracta que representa un producto genérico.
 * Utiliza polimorfismo mediante el método mostrarDetalle().
 */
public abstract class Producto {
    private int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    // Método abstracto para polimorfismo
    public abstract void mostrarDetalle();
}