import modulos.*;
import interfaces.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("=== PRUEBA DE CREACIÓN DE USUARIOS ===\n");


        Administrador admin = null; // Se inicializa fuera del try
        try {
            admin = new Administrador("Admins", "Boss@gmail.com");
            System.out.println("Administrador creado exitosamente.");
            // Mostramos el menú como lo tenías
            admin.mostrarMenu();
        } catch (IllegalArgumentException e) {
            // Este bloque se ejecutaría si los datos fueran inválidos
            System.out.println("Error al crear Administrador: " + e.getMessage());
        }

        System.out.println("---");


        try {
            Empleado empError1 = new Empleado("Ana", "ana@gmail.com"); // "Ana" tiene 3 letras
            System.out.println("Empleado (error 1) creado.");
            empError1.mostrarMenu();
        } catch (IllegalArgumentException e) {
            System.out.println("Error (esperado) al crear Empleado: " + e.getMessage());
        }

        System.out.println("---");


        try {
            Empleado empError2 = new Empleado("Carlos López", "carlos_gmail.com"); // Falta @
            System.out.println("Empleado (error 2) creado.");
            empError2.mostrarMenu();
        } catch (IllegalArgumentException e) {
            System.out.println("Error (esperado) al crear Empleado: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA DE IMPLEMENTACIÓN ARREGLOS INTERFACE ===\n");


        ManejadorLista manejo = new ManejadorLista();
        Empleado[] empleados = new Empleado[3]; // Crear el arreglo vacío

        try {

            empleados[0] = new Empleado("Juan Pérez", "corrego1@gmail.com");
            empleados[1] = new Empleado("María García", "corrego2@gmail.com");
            empleados[2] = new Empleado("Carlos López", "corrego3@gmail.com");

            System.out.println("Arreglo de empleados creado exitosamente.");
            System.out.println("---");

            empleados[0].mostrarMenu();
            System.out.println("---");





            System.out.println("\n1. ARREGLO ORIGINAL:");
            imprimirArreglo(empleados);


            System.out.println("\n2. ARREGLO EN REVERSA:");
            Empleado[] reversa = manejo.regresarReversa(empleados);
            imprimirArreglo(reversa);


            System.out.println("\n3. AGREGAR ELEMENTO:");
            Empleado nuevoEmpleado = new Empleado("Ana Martínez", "correo90@gmail.com");
            Empleado[] conNuevo = manejo.agregarElemento(empleados, nuevoEmpleado);
            System.out.println("Después de agregar: " + nuevoEmpleado);
            imprimirArreglo(conNuevo);


            System.out.println("\n4. BUSCAR ELEMENTO:");
            int posicionBuscar = 1;
            Empleado encontrado = manejo.buscarElemento(empleados, posicionBuscar);
            System.out.println("Empleado en posición " + posicionBuscar + ": " + encontrado);


            System.out.println("\n5. ELIMINAR ELEMENTO:");
            int posicionEliminar = 0;
            Empleado[] sinElemento = manejo.eliminarElemento(empleados, posicionEliminar);
            System.out.println("Después de eliminar posición " + posicionEliminar + ":");
            imprimirArreglo(sinElemento);

        } catch (IllegalArgumentException e) {

            System.out.println("Ocurrió un error inesperado al crear el arreglo de empleados: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("Ocurrió un error en las pruebas de ManejadorLista: " + e.getMessage());
        }



        System.out.println("\n=== PRUEBA DE EXCEPCIONES DE MANEJADORLISTA ===");
        try {
            manejo.regresarReversa(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada (correctamente): " + e.getMessage());
        }

        try {

            if (empleados[0] != null) {
                manejo.buscarElemento(empleados, 10);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción capturada (correctamente): " + e.getMessage());
        }
    }


    private static void imprimirArreglo(Empleado[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("Arreglo vacío o nulo");
            return;
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("  [" + i + "] " + arreglo[i]);
        }
        System.out.println("  Total elementos: " + arreglo.length);
    }
}