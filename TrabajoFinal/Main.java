import personajes.*;
import armas.*;
import java.util.Scanner;

/**
 * Clase principal para ejecutar el juego de lucha.
 * 
 * Permite a los usuarios elegir las clases y armas de dos personajes,
 * crea los personajes correspondientes y luego inicia un combate entre ellos.
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * 
     * - Solicita al usuario elegir la clase y nombre para dos personajes.
     * - Permite elegir un arma entre dos opciones para cada personaje.
     * - Crea los personajes basados en las elecciones del usuario.
     * - Inicia un {@link JuegoLucha} entre los dos personajes creados.
     *
     */
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

    /**
     * Método auxiliar para permitir al usuario elegir un arma.
     * 
     * Presenta dos opciones: Espada Pesada o Daga Ligera.
     *
     * @param sc Scanner para leer la entrada del usuario.
     * @return Un objeto {@link Arma} según la elección.
     */
    public static Arma elegirArma(Scanner sc) {
        System.out.println("Elige arma: 1) Espada Pesada  2) Daga Ligera");
        String eleccion = sc.nextLine();
        return eleccion.equals("1") ? new EspadaPesada() : new DagaLigera();
    }

    /**
     * Método auxiliar para crear un personaje basado en la clase indicada.
     * 
     * @param clase Nombre de la clase (guerrero, mago, arquero o asesino).
     * @param nombre Nombre del personaje.
     * @param arma Arma que usará el personaje.
     * @return Instancia de {@link Personaje} correspondiente.
     * @throws IllegalArgumentException Si la clase no es válida.
     */
    
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
