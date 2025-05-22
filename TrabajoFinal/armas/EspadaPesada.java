package armas;

/**
 * Clase concreta que representa una espada pesada en el juego de lucha.
 * 
 * La espada pesada es un arma caracterizada por infligir un alto daño base (25),
 * pero con una rapidez baja (20% de probabilidad de ataque adicional).
 * 
 * Esta clase extiende a la clase abstracta {@link Arma} y define sus valores específicos.
 */
public class EspadaPesada extends Arma {

    /**
     * Constructor por defecto de la Espada Pesada.
     * Inicializa el arma con nombre "Espada Pesada", daño base de 25 y rapidez de 0.2.
     */
    public EspadaPesada() {
        super("Espada Pesada", 25, 0.2);
    }
}
