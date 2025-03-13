public class Parqueadero {
    private Moto[] puestosBajo;
    private Moto[] puestosAlto;
    
    public Parqueadero() {
        puestosBajo = new Moto[20];
        puestosAlto = new Moto[10];
    }
    
    public boolean registrarMoto(boolean esAlto, int puesto, String placa) {
        if(esAlto) {
            if(puesto < 0 || puesto >= puestosAlto.length) {
                System.out.println("Número de puesto inválido para motos de alto cilindraje.");
                return false;
            }
            if(puestosAlto[puesto] != null) {
                System.out.println("El puesto " + puesto + " ya está ocupado.");
                return false;
            }
            puestosAlto[puesto] = new Moto(placa, true);
            return true;
        } else {
            if(puesto < 0 || puesto >= puestosBajo.length) {
                System.out.println("Número de puesto inválido para motos de bajo cilindraje.");
                return false;
            }
            if(puestosBajo[puesto] != null) {
                System.out.println("El puesto " + puesto + " ya está ocupado.");
                return false;
            }
            puestosBajo[puesto] = new Moto(placa, false);
            return true;
        }
    }
    
    public boolean liberarPuesto(boolean esAlto, int puesto) {
        if(esAlto) {
            if(puesto < 0 || puesto >= puestosAlto.length) {
                System.out.println("Número de puesto inválido para motos de alto cilindraje.");
                return false;
            }
            if(puestosAlto[puesto] == null) {
                System.out.println("El puesto " + puesto + " ya está libre.");
                return false;
            }
            puestosAlto[puesto] = null;
            return true;
        } else {
            if(puesto < 0 || puesto >= puestosBajo.length) {
                System.out.println("Número de puesto inválido para motos de bajo cilindraje.");
                return false;
            }
            if(puestosBajo[puesto] == null) {
                System.out.println("El puesto " + puesto + " ya está libre.");
                return false;
            }
            puestosBajo[puesto] = null;
            return true;
        }
    }
    
    public void mostrarEsquema(boolean esAlto) {
        if(esAlto) {
            System.out.println("Puestos para motos de alto cilindraje:");
            for (int i = 0; i < puestosAlto.length; i++) {
                if(puestosAlto[i] == null) {
                    System.out.print("[" + i + ": Libre] ");
                } else {
                    System.out.print("[" + i + ": Ocupado] ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Puestos para motos de bajo cilindraje:");
            for (int i = 0; i < puestosBajo.length; i++) {
                if(puestosBajo[i] == null) {
                    System.out.print("[" + i + ": Libre] ");
                } else {
                    System.out.print("[" + i + ": Ocupado] ");
                }
            }
            System.out.println();
        }
    }
    
    public Moto obtenerMoto(boolean esAlto, int puesto) {
        if(esAlto) {
            if(puesto < 0 || puesto >= puestosAlto.length) {
                return null;
            }
            return puestosAlto[puesto];
        } else {
            if(puesto < 0 || puesto >= puestosBajo.length) {
                return null;
            }
            return puestosBajo[puesto];
        }
    }
}
