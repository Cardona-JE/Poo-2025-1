import personajes.*;
import armas.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige clase del Jugador 1 (Guerrero/Mago/Arquero/Asesino): ");
        System.out.println("Guerrero: Reduce 10% el daño recibido.");
        System.out.println("Mago: Crítico con tiradas de 11 y 12.");
        System.out.println("Arquero: Menor probabilidad de fallo.");
        System.out.println("Asesino: 30% de posibilidad de doble ataque.");
        String clase1 = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        Arma arma1 = elegirArma(sc);

        System.out.println("Elige clase del Jugador 2 (Guerrero/Mago/Arquero/Asesino): ");
        System.out.println("Guerrero: Reduce 10% el daño recibido.");
        System.out.println("Mago: Crítico con tiradas de 11 y 12.");
        System.out.println("Arquero: Menor probabilidad de fallo.");
        System.out.println("Asesino: 30% de posibilidad de doble ataque.");
        String clase2 = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        Arma arma2 = elegirArma(sc);

        Personaje p1 = crearPersonaje(clase1, nombre1, arma1);
        Personaje p2 = crearPersonaje(clase2, nombre2, arma2);

        JuegoLucha juego = new JuegoLucha(p1, p2);
        juego.iniciar();
    }

    public static Arma elegirArma(Scanner sc) {
        System.out.println("Elige arma: 1) Espada Pesada  2) Daga Ligera");
        String eleccion = sc.nextLine();
        return eleccion.equals("1") ? new EspadaPesada() : new DagaLigera();
    }

    public static Personaje crearPersonaje(String clase, String nombre, Arma arma) {
        switch (clase.toLowerCase()) {
            case "guerrero":
                return new Guerrero(nombre, arma);
            case "mago":
                return new Mago(nombre, arma);
            case "arquero":
                return new Arquero(nombre, arma);
            case "asesino":
                return new Asesino(nombre, arma);
            default:
                throw new IllegalArgumentException("Clase no válida");
        }
    }
}