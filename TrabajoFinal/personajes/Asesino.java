package personajes;

import armas.Arma;
import java.util.Random;

public class Asesino extends Personaje {

    public Asesino(String nombre, Arma arma) {
        super(nombre, arma);
    }

    @Override
    public void aplicarPasiva() {
        System.out.println(nombre + " (Asesino) activa su pasiva: Golpe sorpresa.");
    }

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
