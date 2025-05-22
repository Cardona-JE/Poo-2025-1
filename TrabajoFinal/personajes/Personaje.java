package personajes;

import armas.Arma;
import java.util.Random;

public abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected Arma arma;

    public Personaje(String nombre, Arma arma) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.arma = arma;
    }

    public abstract void aplicarPasiva();

    public void atacar(Personaje oponente) {
        realizarAtaque(oponente);

        if (new Random().nextDouble() < arma.obtenerRapidez()) {
            System.out.println(nombre + " ataca una segunda vez gracias a la rapidez del arma.");
            esperar(1000);
            realizarAtaque(oponente);
        }
    }

    protected void realizarAtaque(Personaje oponente) {
        Random random = new Random();
        int tirada = random.nextInt(12) + 1;

        System.out.println(nombre + " lanza el dado... (" + tirada + ")");
        esperar(1000);

        if (tirada <= 6) {
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

    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
        if (puntosDeVida < 0) puntosDeVida = 0;
        System.out.println(nombre + " recibe " + daño + " de daño. Vida restante: " + puntosDeVida);
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    protected void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}