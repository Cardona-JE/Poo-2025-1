package personajes;

import armas.Arma;
import java.util.Random;

/**
 * Clase abstracta que representa un personaje en el juego de lucha.
 * 
 * Todos los personajes del juego heredan de esta clase. Define atributos comunes como
 * nombre, puntos de vida y el arma equipada. También proporciona la lógica de ataque,
 * recepción de daño y verificación de estado.
 * 
 */
public abstract class Personaje {
    
    /**
     * Nombre del personaje.
     */
    protected String nombre;

    /**
     * Puntos de vida del personaje. Empiezan en 100.
     */
    protected int puntosDeVida;

    /**
     * Arma equipada por el personaje.
     */
    protected Arma arma;

    /**
     * Constructor base para cualquier personaje.
     *
     * @param nombre Nombre del personaje.
     * @param arma Arma que usará el personaje.
     */
    public Personaje(String nombre, Arma arma) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.arma = arma;
    }

    /**
     * Método abstracto que define la pasiva del personaje.
     * Debe ser implementado por cada subclase.
     */
    public abstract void aplicarPasiva();

    /**
     * Ejecuta el ataque del personaje hacia un oponente.
     * Si el arma tiene suficiente rapidez, puede realizar un segundo ataque.
     *
     * @param oponente Personaje que recibe el ataque.
     */
    public void atacar(Personaje oponente) {
        realizarAtaque(oponente);

        if (new Random().nextDouble() < arma.obtenerRapidez()) {
            System.out.println(nombre + " ataca una segunda vez gracias a la rapidez del arma.");
            esperar(1000);
            realizarAtaque(oponente);
        }
    }

    /**
     * Realiza una tirada de dados (1 a 12) para determinar el resultado del ataque:
     * - 1 a 6: Falla
     * - 7 a 11: Daño normal
     * - 12: Ataque crítico (1.2x daño)
     *
     * @param oponente Personaje que recibe el ataque.
     */
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

    /**
     * Reduce los puntos de vida del personaje cuando recibe daño.
     *
     * @param daño Cantidad de daño a recibir.
     */
    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
        if (puntosDeVida < 0) puntosDeVida = 0;
        System.out.println(nombre + " recibe " + daño + " de daño. Vida restante: " + puntosDeVida);
    }

    /**
     * Verifica si el personaje sigue con vida.
     *
     * @return true si los puntos de vida son mayores a 0, false en caso contrario.
     */
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    /**
     * Obtiene el nombre del personaje.
     *
     * @return Nombre del personaje.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene los puntos de vida actuales del personaje.
     *
     * @return Puntos de vida actuales.
     */
    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    /**
     * Pausa la ejecución durante una cantidad de milisegundos para simular realismo en combate.
     *
     * @param milisegundos Tiempo a esperar.
     */
    protected void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
