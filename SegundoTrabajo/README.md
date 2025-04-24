# 📸 Sistema de Gestión de Pedidos Fotográficos  
**Curso:** Programación Orientada a Objetos  

---

## 🔍 **Introducción**  
Este proyecto implementa un sistema para gestionar pedidos de productos fotográficos, demostrando los principios fundamentales de la **Programación Orientada a Objetos (POO)**. El diseño se centra en tres pilares clave: **herencia**, **polimorfismo** y **agregación**, cumpliendo con los requisitos de la guía proporcionada y alineándose con los criterios de la rúbrica de evaluación.  

---

## ✅ **Cumplimiento de la Guía y Rúbrica**  

### 1. **Herencia**  
- **Implementación:**  
  Las clases `Camara` e `Impresion` heredan de la clase abstracta `Producto`, reutilizando atributos y métodos comunes.  
- **Relevancia:**  
  Permite estructurar jerárquicamente los productos y facilita la extensión del sistema.  

### 2. **Polimorfismo**  
- **Implementación:**  
  El método abstracto `mostrarDetalle()` en `Producto` se sobrescribe en las subclases (`Camara` e `Impresion`) para personalizar su comportamiento.  
- **Relevancia:**  
  Elimina la necesidad de usar `instanceof` en la clase `Pedido`

### 3. **Agregación**  
- **Implementación:**  
  La clase `Impresion` contiene un array de objetos `Foto`, los cuales existen independientemente de la impresión.  
- **Relevancia:**  
  Demuestra una relación de agregación, donde las fotos pueden ser utilizadas en múltiples contextos fuera de la impresión.  

---

## 🛠 **Estructura del Proyecto**  

### Clases Principales  
1. **`Producto` (Clase Abstracta):**  
   - Define el método polimórfico `mostrarDetalle()`.  
   - Base para la jerarquía de productos.  

2. **`Camara`:**  
   - Hereda de `Producto`.  
   - Implementa `mostrarDetalle()` para mostrar marca y modelo.  

3. **`Impresion`:**  
   - Hereda de `Producto`.  
   - Utiliza **agregación** con la clase `Foto`.  
   - Implementa `mostrarDetalle()` para listar las fotos incluidas.  

4. **`Pedido`:**  
   - Gestiona productos de forma polimórfica mediante el método `mostrarDetalle()`.  

5. **`Foto`:**  
   - Entidad independiente utilizada por `Impresion`.  

---
