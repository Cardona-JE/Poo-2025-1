package armas;

public abstract class Arma {
    protected String nombre;
    protected int dañoBase;
    protected double rapidez; 

    public Arma(String nombre, int dañoBase, double rapidez) {
        this.nombre = nombre;
        this.dañoBase = dañoBase;
        this.rapidez = rapidez;
    }

    public int obtenerDañoBase() {
        return dañoBase;
    }

    public double obtenerRapidez() {
        return rapidez;
    }

    public String getNombre() {
        return nombre;
    }
}