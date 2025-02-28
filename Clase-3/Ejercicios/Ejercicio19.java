/*Codificar un programa que genere un matriz de n x m, en la cual asigne ceros a todos
los elementos, excepto a los de la diagonal principal donde se asignarán unos. */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero n: ");
        int n = lectura.nextInt();
        System.out.println("Ingrese el numero m: ");
        int m = lectura.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("Los numeros n y m deben ser mayores a 0");
            lectura.close();
            
        }
        int matriz[][] = new int[n][m];
        lectura.close();

        /*En la primera parte se leyeron los numeros n y m dados por el usuario
         * que son las variables a usar para determinar las dimensiones de la matriz, y ademas
         * se puso un condicional para determinar que los numeros deben ser mayores que 0*/

        int min = Math.min(n, m);
        for (int i = 0; i < min; i++) {
            matriz[i][i] = 1;
        }

        /*En este primer for se llena la diagonal principal con 1, usando el Math.min 
         * para asegurarse de que los 1 no se desborden de la matriz, si no que tome el numero mas bajo
         * de los dados por el usuario y que llene con los 1
         */

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            
        }

        /*Ya con este for se hace la impresion de la matriz completa para ver el resultado completo */
    }
}