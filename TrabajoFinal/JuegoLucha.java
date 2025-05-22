import personajes.Personaje;

/**
 * Clase que representa un juego de lucha entre dos personajes.
 * 
 * Esta clase administra el combate entre dos {@link Personaje}es, controlando
 * el turno de ataque, aplicando pasivas al inicio y determinando el ganador
 * cuando uno de los personajes pierde toda su vida.
 */
public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    /**
     * Constructor que inicializa el juego con dos personajes que lucharán.
     *
     * @param p1 Primer personaje (jugador 1).
     * @param p2 Segundo personaje (jugador 2).
     */
    public JuegoLucha(Personaje p1, Personaje p2) {
        this.jugador1 = p1;
        this.jugador2 = p2;
    }

    /**
     * Método para iniciar el combate.
     * 
     * - Aplica las habilidades pasivas de ambos personajes.
     * - Alterna los turnos de ataque entre los jugadores.
     * - El combate termina cuando uno de los personajes muere.
     * - Imprime en consola los eventos relevantes del combate.
     */
    public void iniciar() {
        jugador1.aplicarPasiva();
        jugador2.aplicarPasiva();
        esperar(1000);
        System.out.println("\n--- COMBATE INICIA ---");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.println("\nTurno de " + jugador1.getNombre());
            jugador1.atacar(jugador2);
            if (!jugador2.estaVivo()) break;
            esperar(1500);

            System.out.println("\nTurno de " + jugador2.getNombre());
            jugador2.atacar(jugador1);
            esperar(1500);
        }

        System.out.println("\n--- COMBATE FINALIZADO ---");
        System.out.println(jugador1.estaVivo() ? jugador1.getNombre() + " ganó." : jugador2.getNombre() + " ganó.");
    }

    /**
     * Método auxiliar para pausar la ejecución durante una cantidad de milisegundos para que el juego no corra instantaneamente.
     * 
     * @param milisegundos Tiempo a esperar en milisegundos.
     */
    private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
