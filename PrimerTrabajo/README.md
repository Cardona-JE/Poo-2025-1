# 🚀 Primer Trabajo de Clase – Parqueadero "ParkingNow"

**Autores:**  
- Juan Esteban Cardona Arango  
- Juan Sebastián Cano Valencia  

---

## 📌 Descripción del Proyecto  

Este proyecto es un sistema de administración de parqueaderos para la empresa *ParkingNow*, desarrollado en Java con Programación Orientada a Objetos.  

### 📑 **Clases y Archivos**  

### 🏍️ Clase `Moto`  
Representa una moto con los siguientes atributos:  
- `placa`: Identificador único de la moto.  
- `esAltoCilindraje`: Booleano que indica si la moto es de alto cilindraje.  

👉 Se usa para registrar motos en el parqueadero y validar la placa antes de realizar un cobro.  

---

### 🏢 Clase `Parqueadero`  
Administra los puestos de estacionamiento de motos mediante dos arreglos:  
- `puestosBajo` (20 espacios para motos de bajo cilindraje).  
- `puestosAlto` (10 espacios para motos de alto cilindraje).  

#### **Métodos principales:**  
1. **`registrarMoto(boolean esAlto, int puesto, String placa)`**  
   Registra una moto en un puesto disponible y valida que no esté ocupado.  
2. **`liberarPuesto(boolean esAlto, int puesto)`**  
   Libera un puesto ocupado tras el cobro.  
3. **`mostrarEsquema(boolean esAlto)`**  
   Muestra en consola el estado de ocupación de los puestos.  
4. **`obtenerMoto(boolean esAlto, int puesto)`**  
   Retorna la moto registrada en un puesto específico.  

---

### 🖥️ Clase `TarifadorParqueaderos` (Ejecución)  

#### **1️⃣ Método `calcularTarifa(int horaEntrada, int minEntrada, int horaSalida, int minSalida)`**  
Calcula el costo del estacionamiento en función del tiempo estacionado:  
- **≤ 30 min:** $0  
- **31 - 60 min:** $800  
- **> 60 min:** $2000  

#### **2️⃣ Método `main` (Menú interactivo)**  
Permite la interacción con el usuario a través de tres opciones:  

**🔹 Opción 1 - Registro de Motos**  
- Se solicita si la moto es de bajo o alto cilindraje.  
- Se muestra el esquema de puestos disponibles.  
- Se permite elegir un puesto y registrar la moto con su placa.  

**🔹 Opción 2 - Cobro de Tarifa**  
- Se selecciona el tipo de moto.  
- Se verifica si hay una moto en el puesto seleccionado.  
- Se solicita la placa para confirmar.  
- Se ingresan la hora de entrada y salida.  
- Se calcula la tarifa y se libera el puesto.  

**🔹 Opción 3 - Salir**  
- Finaliza la ejecución del programa.  

---

## ✅ Funcionalidades Implementadas  
✔ Registro y control de motos en el parqueadero.  
✔ Verificación de disponibilidad de puestos.  
✔ Cálculo de tarifas según tiempo estacionado.  
✔ Validaciones de placa y existencia de motos antes de cobrar.  

---
