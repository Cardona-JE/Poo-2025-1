/*
 * Representa una impresión de fotos. Hereda de Producto.
 * Contiene una agregación de objetos Foto (las fotos existen independientemente).
 */
public class Impresion extends Producto {
    private String color;
    private Foto[] fotos;  // Agregación: Las fotos no dependen de la impresión

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    // Implementación polimórfica
    @Override
    public void mostrarDetalle() {
        System.out.println("Impresión en color: " + color);
        for (Foto foto : fotos) {
            foto.print();
        }
    }
}