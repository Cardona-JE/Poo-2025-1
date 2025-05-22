package personajes;

import armas.Arma;
import java.util.Random;

public class Mago extends Personaje {

    public Mago(String nombre, Arma arma) {
        super(nombre, arma);
    }

    @Override
    public void aplicarPasiva() {
        System.out.println(nombre + " (Mago) activa su pasiva: Poder arcano.");
    }

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
            oponente.recibirDaño((int) daño);
        }
    }
}