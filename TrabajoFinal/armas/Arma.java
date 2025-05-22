package armas;

/*
 * Clase abstracta que representa un arma en el juego de lucha.
 * Define los atributos y métodos comunes que todas las armas deben tener,
 * como su nombre, el daño base que infligen y su rapidez.
 */
public abstract class Arma {

    /**
     * Nombre del arma (ej: "Espada Pesada", "Daga Ligera").
     */
    protected String nombre;

    /**
     * Daño base que inflige el arma.
     */
    protected int dañoBase;

    /**
     * Probabilidad de realizar un segundo ataque (valor entre 0.0 y 1.0).
     */
    protected double rapidez;

    /**
     * Constructor de un arma.
     * 
     * @param nombre Nombre del arma.
     * @param dañoBase Cantidad de daño base que inflige.
     * @param rapidez Probabilidad de ataque adicional.
     */
    public Arma(String nombre, int dañoBase, double rapidez) {
        this.nombre = nombre;
        this.dañoBase = dañoBase;
        this.rapidez = rapidez;
    }

    /**
     * Devuelve el daño base del arma.
     * 
     * @return Valor numérico del daño base.
     */
    public int obtenerDañoBase() {
        return dañoBase;
    }

    /**
     * Devuelve la rapidez del arma.
     * 
     * @return Probabilidad (entre 0.0 y 1.0) de hacer un ataque extra.
     */
    public double obtenerRapidez() {
        return rapidez;
    }

    /**
     * Devuelve el nombre del arma.
     * 
     * @return Nombre del arma.
     */
    public String getNombre() {
        return nombre;
    }
}
