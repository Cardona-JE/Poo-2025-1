/*El Departamento de personal de una escuela tiene información sobre nombre, edad y
sexo de cada uno de los profesores adscritos al mismo. Escriba un programa que calcule
e imprima lo siguiente:
    a. Edad promedio del grupo de profesores.
    b. Nombre del profesor más joven del grupo.
    c. Nombre del profesor con mayor edad.
    d. Número de profesoras con edad mayor al promedio.
    e. Número de profesores con edad menor al promedio.  */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero de profesores deseado: ");
        int numeroP = lectura.nextInt();

        if (numeroP <= 0) {
            System.out.println("El numero de profesores debe ser mayor a 0");
            lectura.close();
        }

        String[] nombres = new String[numeroP];
        int[] edad = new int[numeroP];
        char[] sexo = new char[numeroP];

        int promedio = 0;
        int min = 0;
        String nombreMin = new String();
        int max = 0;
        String nombreMax = new String();
        Boolean primerProfesor = true;

        for (int i = 0; i < numeroP; i++) {
            System.out.println("Ingrese el nombre del profesor: ");
            nombres[i] = lectura.next();
            System.out.println("Ingrese la edad: ");
            edad[i] = lectura.nextInt();
            promedio += edad[i];
            System.out.println("Ingrese el sexo: ");
            sexo[i] = lectura.next().charAt(0);
            System.out.println(nombres[i] + " edad: " + edad[i] + " y sexo: " + sexo[i] + " fue añadido");
            System.out.println();
            
            if (primerProfesor == true) {
                min = edad[i];
                nombreMin = nombres[i];
                primerProfesor = false;
            }

            if (edad[i] > max) {
                max = edad[i];
                nombreMax = nombres[i];
            } else if (edad[i] < min) {
                min = edad[i];
                nombreMin = nombres[i];
            }
        }

        lectura.close();
        promedio = promedio/numeroP;
        int pH = 0;
        int pM = 0;
        for (int i = 0; i < numeroP-1; i++) {
            if (edad[i] > promedio && sexo[i] == 'M') {
                pM += 1;  
            } else if (edad[i] < promedio && sexo[i] == 'H') {
                pH += 1;
            }
        }

        System.out.println("EL promedio de edad entre todos los profesores es: " + promedio);
        System.out.println("El nombre del profesor mas joven del grupo es: " + nombreMin + " con la edad de: " + min);
        System.out.println("El nombre del profesor mas viejo del grupo es: " + nombreMax + " con la edad de: " + max);
        System.out.println("El numero de profesoras con edad mayor al promedio es de: " + pM);
        System.out.println("El numero de profesores con edad menor al promedio es de: " + pH);
    }
    
}
