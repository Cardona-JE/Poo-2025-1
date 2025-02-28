/*Obtener dos arreglos tal que sus elementos sean los números pares y números impares
del arreglo A de 10 elementos. */

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arregloA = new int[10];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        /*En esta primera parte defino los arreglos, el primero lo hago estatico ya que tiene una cantidad definida, 
         * pero los otros dos los defino dinamicos ya que la cantidad de numeros va ir variando
         */

        System.out.print("El arreglo principal es asi: [");
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextInt(25)+1;
            System.out.print(arregloA[i] + ", ");
            if (arregloA[i]%2 == 0) {
                pares.add(arregloA[i]);
            } else {
                impares.add(arregloA[i]);
            }
        }
        System.out.println("]");
        System.out.println("El arreglo de pares quedo asi: " + pares);
        System.out.println("El arreglo de impares quedo asi: " + impares);

        /* En esta parte usando un for voy llenando el arreglo principal con numeros aleatorios, y de paso voy llenando 
         * los otros arreglos segun si son numeros pares y numeros impares y ademas hago la impresion de los tres arreglos
         */

    }
}
