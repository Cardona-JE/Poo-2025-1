package personajes;

import armas.Arma;
import java.util.Random;

/**
 * Clase concreta que representa a un personaje de tipo Arquero.
 * 
 * El Arquero tiene como pasiva una mayor precisión, lo que significa que
 * su ataque solo falla si la tirada de dados es 4 o menos (en lugar del fallo estándar de 6 o menos).
 * 
 * Hereda de la clase abstracta {@link Personaje} e implementa su pasiva y una versión modificada
 * del método {@link #realizarAtaque(Personaje)}.
 */
public class Arquero extends Personaje {

    /**
     * Constructor que inicializa un arquero con su nombre y arma equipada.
     *
     * @param nombre Nombre del personaje.
     * @param arma Arma que usará el arquero.
     */
    public Arquero(String nombre, Arma arma) {
        super(nombre, arma);
    }

    /**
     * Implementación de la pasiva del arquero.
     * Muestra un mensaje indicando que se activa su habilidad de precisión mejorada.
     */
    @Override
    public void aplicarPasiva() {
        System.out.println(nombre + " (Arquero) activa su pasiva: Precisión mejorada.");
    }

    /**
     * Método sobrescrito para definir un ataque con mayor precisión.
     * 
     * El ataque falla si la tirada es 1 a 4.
     * A partir de 5, inflige daño normal.
     * En caso de obtener 12, se aplica un daño crítico (1.2x).
     *
     * @param oponente Personaje que recibirá el ataque.
     */
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
