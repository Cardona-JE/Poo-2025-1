public class Ejercicio {
    public static void main(String[] args) {
        //Sumar separadamente los numeros pares e impares

        int[] num = {2, 3, 7, 9, 12, 13, 15, 10, 20, 28, 35};

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pares = pares + num[i];
            }
            else {
                impares = impares + num[i];
            }
        }

        System.out.println("La suma de los pares es: " + pares);
        System.out.println("La suma de los impares es: " + impares);
    }
}
