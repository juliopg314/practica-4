# Práctica 4: Manejo de Excepciones y Manipulación de Arreglos

## Objetivo
El objetivo de esta práctica es implementar el manejo de errores en tiempo de ejecución (Excepciones) para validar la creación de objetos. Además, se busca aplicar lógica de programación para manipular estructuras de datos (arreglos), permitiendo agregar, eliminar, buscar e invertir elementos mediante una clase manejadora.

## Descripción
Este proyecto consiste en una clase principal (`Main`) que ejecuta una serie de pruebas unitarias para validar dos aspectos clave del sistema:

1.  **Validación de Datos (Excepciones):**
    - Se intenta crear objetos `Administrador` y `Empleado`.
    - Se capturan y manejan excepciones del tipo `IllegalArgumentException` cuando los datos no cumplen las reglas (ej. nombres muy cortos o correos sin '@').

2.  **Operaciones con Arreglos (Clase `ManejadorLista`):**
    - Se crea un arreglo inicial de empleados.
    - Se prueban funciones avanzadas sobre el arreglo:
        - **Reversa:** Invierte el orden de los elementos.
        - **Agregar:** Añade un nuevo elemento al arreglo (redimensionándolo).
        - **Buscar:** Encuentra un objeto por su índice.
        - **Eliminar:** Borra un elemento y reorganiza el arreglo.
    - Se valida el manejo de errores al intentar acceder a índices inexistentes (`IndexOutOfBoundsException`) o manipular arreglos nulos.

## Tecnologías utilizadas
- Lenguaje: Java (JDK)
- Conceptos: POO, Excepciones, Arreglos, Paquetes e Interfaces.
- IDE: IntelliJ IDEA 
- Control de versiones: Git & GitHub


## Instrucciones de ejecución
Para ejecutar este proyecto, es necesario respetar la estructura de paquetes.

1. **Clonar el repositorio:**
   ```bash
   git clone [URL-DEL-REPOSITORIO]
