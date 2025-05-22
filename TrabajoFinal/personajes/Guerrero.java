package personajes;

import armas.Arma;

/**
 * Clase concreta que representa a un personaje de tipo Guerrero.
 * 
 * El Guerrero posee una pasiva llamada "Resistencia física" que reduce en un 10% 
 * el daño recibido. Esta bonificación se aplica cada vez que el Guerrero recibe daño.
 * 
 * Esta clase hereda de {@link Personaje} y sobrescribe el método {@link #recibirDaño(int)}
 * para implementar la reducción del daño.
 */
public class Guerrero extends Personaje {

    /**
     * Constructor que inicializa al Guerrero con su nombre y arma.
     * 
     * @param nombre Nombre del personaje.
     * @param arma Arma que utilizará el Guerrero.
     */
    public Guerrero(String nombre, Arma arma) {
        super(nombre, arma);
    }

    /**
     * Implementación de la pasiva del Guerrero.
     * Imprime un mensaje indicando que se activa "Resistencia física".
     */
    @Override
    public void aplicarPasiva() {
        System.out.println(nombre + " (Guerrero) activa su pasiva: Resistencia física.");
    }

    /**
     * Método sobrescrito para recibir daño.
     * 
     * El daño recibido se reduce en un 10% gracias a la pasiva "Resistencia física".
     * Luego se llama al método original {@link Personaje#recibirDaño(int)} con el daño
     * modificado.
     * 
     * @param daño Cantidad de daño entrante.
     */
    @Override
    public void recibirDaño(int daño) {
        daño *= 0.9;  // Reduce el daño un 10%
        super.recibirDaño(daño);
    }
}
