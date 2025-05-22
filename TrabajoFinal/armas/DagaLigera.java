package armas;

/**
 * Clase concreta que representa una daga ligera en el juego de lucha.
 * 
 * La daga ligera es un arma caracterizada por tener una alta rapidez
 * (60% de probabilidad de realizar un segundo ataque), pero un daño base moderado.
 * 
 * Esta clase extiende a la clase abstracta {@link Arma} y define sus valores específicos.
 */
public class DagaLigera extends Arma {

    /**
     * Constructor por defecto de la Daga Ligera.
     * Inicializa el arma con nombre "Daga Ligera", daño base de 20 y rapidez de 0.6.
     */
    public DagaLigera() {
        super("Daga Ligera", 20, 0.6);
    }
}
