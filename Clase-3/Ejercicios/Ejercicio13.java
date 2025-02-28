/* Dado un arreglo A de N elementos se desea almacenar los elementos mayores y
menores que la media, almacenarlos en vectores diferentes.  */

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroA = random.nextInt(10)+1;

        int[] base = new int[numeroA];
        int promedio = 0;

        for (int i = 0; i < base.length; i++) {
            base[i] = random.nextInt(20)+1;
            promedio += base[i];
        }

        promedio = promedio/numeroA;

        ArrayList<Integer> mayores = new ArrayList<>();
        ArrayList<Integer> menores = new ArrayList<>();

        System.out.println("El promedio es de: " + promedio);
        System.out.print("El arreglo principal es asi: [");
        for (int i = 0; i < base.length; i++) {
            if (base[i] < promedio) {
                menores.add(base[i]);
            } else {
                mayores.add(base[i]);
            }

            System.out.print(base[i] + ", ");
        }
        System.out.println("]");

        System.out.println("Arreglo de mayores al promedio: " + mayores);
        System.out.println("Arreglo de menores al promedio: " + menores);

   
    }
}