import java.util.Scanner;

public class Ejecutar {
    public static int calcularTarifa(int horaEntrada, int minEntrada, int horaSalida, int minSalida) {
        int entradaEnMin = horaEntrada * 60 + minEntrada;
        int salidaEnMin = horaSalida * 60 + minSalida;
        int tiempoEstacionado = salidaEnMin - entradaEnMin;
        if(tiempoEstacionado <= 0) {
            System.out.println("El tiempo ingresado no es válido. La hora de salida debe ser mayor que la de entrada.");
            return -1;
        }
        if(tiempoEstacionado <= 30) {
            return 0;
        } else if(tiempoEstacionado <= 60) {
            return 800;
        } else {
            return 2000;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();
        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Registro de Motos");
            System.out.println("2. Cobro de Tarifa");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion) {
                case 1:
                    System.out.println("\n--- Registro de Motos ---");
                    System.out.print("Ingrese 1 para moto de bajo cilindraje o 2 para moto de alto cilindraje: ");
                    int tipoMoto = sc.nextInt();
                    sc.nextLine();
                    boolean esAlto = (tipoMoto == 2);
                    parqueadero.mostrarEsquema(esAlto);
                    System.out.print("Ingrese el número de puesto que desea ocupar: ");
                    int puesto = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese la placa de la moto: ");
                    String placa = sc.nextLine();
                    if(parqueadero.registrarMoto(esAlto, puesto, placa)) {
                        System.out.println("Moto registrada correctamente en el puesto " + puesto);
                    }
                    break;
                case 2:
                    System.out.println("\n--- Cobro de Tarifa ---");
                    System.out.print("Ingrese 1 para moto de bajo cilindraje o 2 para moto de alto cilindraje: ");
                    int tipoCobro = sc.nextInt();
                    sc.nextLine();
                    boolean esAltoCobro = (tipoCobro == 2);
                    parqueadero.mostrarEsquema(esAltoCobro);
                    System.out.print("Ingrese el número de puesto de la moto que sale: ");
                    int puestoSalida = sc.nextInt();
                    sc.nextLine();
                    Moto moto = parqueadero.obtenerMoto(esAltoCobro, puestoSalida);
                    if(moto == null) {
                        System.out.println("No hay una moto registrada en el puesto seleccionado.");
                        break;
                    }
                    System.out.print("Ingrese la placa de la moto para confirmar: ");
                    String placaConfirmacion = sc.nextLine();
                    if(!moto.getPlaca().equals(placaConfirmacion)) {
                        System.out.println("La placa ingresada no coincide con la moto registrada en ese puesto.");
                        break;
                    }
                    System.out.println("Ingrese la hora de entrada:");
                    System.out.print("Hora (formato 24 horas, ejemplo 7): ");
                    int horaEntrada = sc.nextInt();
                    System.out.print("Minutos: ");
                    int minEntrada = sc.nextInt();
                    System.out.println("Ingrese la hora de salida:");
                    System.out.print("Hora (formato 24 horas, ejemplo 10): ");
                    int horaSalida = sc.nextInt();
                    System.out.print("Minutos: ");
                    int minSalida = sc.nextInt();
                    sc.nextLine();
                    int tarifa = calcularTarifa(horaEntrada, minEntrada, horaSalida, minSalida);
                    if(tarifa != -1) {
                        System.out.println("El monto a pagar es: $" + tarifa);
                        if(parqueadero.liberarPuesto(esAltoCobro, puestoSalida)) {
                            System.out.println("El puesto ha sido liberado.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while(opcion != 3);
        sc.close();
    }
}
