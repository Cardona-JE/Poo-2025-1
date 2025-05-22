package personajes;

import armas.Arma;
import java.util.Random;

/**
 * Clase concreta que representa a un personaje de tipo Asesino.
 * 
 * El Asesino posee una pasiva llamada "Golpe sorpresa", que le da un 30% de probabilidad
 * de realizar un segundo ataque adicional en su turno. Esto se suma a la posible repetición
 * del ataque que puede otorgar el arma equipada si su rapidez lo permite.
 * 
 * Esta clase hereda de {@link Personaje} e implementa su pasiva y sobrescribe el método
 * {@link #atacar(Personaje)} para modificar el comportamiento del turno de ataque.
 */
public class Asesino extends Personaje {

    /**
     * Constructor que inicializa al asesino con su nombre y arma.
     *
     * @param nombre Nombre del personaje.
     * @param arma Arma que utilizará el asesino.
     */
    public Asesino(String nombre, Arma arma) {
        super(nombre, arma);
    }

    /**
     * Implementación de la pasiva del asesino.
     * Imprime un mensaje indicando que se activa "Golpe sorpresa".
     */
    @Override
    public void aplicarPasiva() {
        System.out.println(nombre + " (Asesino) activa su pasiva: Golpe sorpresa.");
    }

    /**
     * Método sobrescrito para realizar un ataque.
     * El Asesino tiene dos oportunidades de realizar ataques adicionales:
     * 
     * - 30% de probabilidad por su pasiva ("Golpe sorpresa").
     * - Probabilidad adicional determinada por la rapidez del arma.
     *
     * @param oponente El personaje que recibe el ataque.
     */
    @Override
    public void atacar(Personaje oponente) {
        realizarAtaque(oponente);

        if (new Random().nextDouble() < 0.3) {
            System.out.println(nombre + " hace un segundo ataque gracias a su pasiva.");
            esperar(1000);
            realizarAtaque(oponente);
        }

        if (new Random().nextDouble() < arma.obtenerRapidez()) {
            System.out.println(nombre + " ataca una segunda vez gracias a la rapidez del arma.");
            esperar(1000);
            realizarAtaque(oponente);
        }
    }
}
