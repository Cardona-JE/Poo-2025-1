package personajes;

import armas.Arma;
import java.util.Random;

/**
 * Clase concreta que representa a un personaje de tipo Mago.
 * 
 * El Mago posee una pasiva llamada "Poder arcano", que le permite tener mayor probabilidad de hacer un golpe critico
 * 
 * Esta clase hereda de {@link Personaje} y sobrescribe el método {@link #realizarAtaque(Personaje)}
 * para implementar su pasiva
 */
public class Mago extends Personaje {

    /**
     * Constructor que inicializa al Mago con su nombre y arma.
     *
     * @param nombre Nombre del personaje.
     * @param arma Arma que utilizará el Mago.
     */
    public Mago(String nombre, Arma arma) {
        super(nombre, arma);
    }

    /**
     * Implementación de la pasiva del Mago.
     * Imprime un mensaje indicando que se activa "Poder arcano".
     */
    @Override
    public void aplicarPasiva() {
        System.out.println(nombre + " (Mago) activa su pasiva: Poder arcano.");
    }

    /**
     * Método sobrescrito para realizar el ataque del Mago.
     * 
     * Se disminuye el numero necesario para hacer un critico de 12 a 11 para que este tenga mayor probabilidad de
     * Hacer que su ataque sea critico
     * 
     * Se imprime en consola el resultado de la tirada y el tipo de ataque realizado.
     *
     * @param oponente El personaje que recibe el ataque.
     */
    @Override
    protected void realizarAtaque(Personaje oponente) {
        Random random = new Random();
        int tirada = random.nextInt(12) + 1;

        System.out.println(nombre + " lanza el dado... (" + tirada + ")");
        esperar(1000);

        if (tirada <= 6) {
            System.out.println(nombre + " falló el ataque.");
        } else {
            int daño = arma.obtenerDañoBase();
            if (tirada >= 11) {
                daño *= 1.2;
                System.out.println(nombre + " hizo un ATAQUE CRÍTICO con " + arma.getNombre() + "!");
            } else {
                System.out.println(nombre + " ataca con " + arma.getNombre());
            }
            oponente.recibirDaño(daño);
        }
    }
}
