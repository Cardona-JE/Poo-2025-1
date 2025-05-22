package personajes;

import armas.Arma;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, Arma arma) {
        super(nombre, arma);
    }

    @Override
    public void aplicarPasiva() {
        System.out.println(nombre + " (Guerrero) activa su pasiva: Resistencia física.");
    }

    @Override
    public void recibirDaño(int daño) {
        daño *= 0.9;
        super.recibirDaño(daño);
    }
}