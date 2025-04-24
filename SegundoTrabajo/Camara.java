/*
 * Representa una cámara fotográfica. Hereda de Producto.
 * Demuestra herencia y sobrescribe mostrarDetalle() para polimorfismo.
 */
public class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    // Implementación polimórfica
    @Override
    public void mostrarDetalle() {
        System.out.println("Cámara: " + marca + " " + modelo);
    }

    // Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}