package personajes;

import armas.Arma;
import java.util.Random;

public class Arquero extends Personaje {

    public Arquero(String nombre, Arma arma) {
        super(nombre, arma);
    }

    @Override
    public void aplicarPasiva() {
        System.out.println(nombre + " (Arquero) activa su pasiva: Precisión mejorada.");
    }

    @Override
    protected void realizarAtaque(Personaje oponente) {
        Random random = new Random();
        int tirada = random.nextInt(12) + 1;

        System.out.println(nombre + " lanza el dado... (" + tirada + ")");
        esperar(1000);

        if (tirada <= 4) {
            System.out.println(nombre + " falló el ataque.");
        } else {
            int daño = arma.obtenerDañoBase();
            if (tirada == 12) {
                daño *= 1.2;
                System.out.println(nombre + " hizo un ATAQUE CRÍTICO con " + arma.getNombre() + "!");
            } else {
                System.out.println(nombre + " ataca con " + arma.getNombre());
            }
            oponente.recibirDaño((int) daño);
        }
    }
}