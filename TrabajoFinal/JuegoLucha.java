import personajes.Personaje;

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje p1, Personaje p2) {
        this.jugador1 = p1;
        this.jugador2 = p2;
    }

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

    private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}