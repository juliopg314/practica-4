import interfaces.ArreglosInterface;
import modulos.*;


public class ManejadorLista implements ArreglosInterface {


    @Override
    public Empleado[] regresarReversa(Empleado[] arreglo)
            throws IllegalArgumentException {


        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }


        int n = arreglo.length;
        Empleado[] reverso = new Empleado[n];

        for (int i = 0; i < n; i++) {

            reverso[i] = arreglo[n - 1 - i];
        }


        return reverso;
    }


    @Override
    public Empleado[] agregarElemento(Empleado[] arreglo, Empleado empleado)
            throws IllegalArgumentException {


        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado a agregar no puede ser nulo.");
        }


        int n = arreglo.length;

        Empleado[] nuevoArreglo = new Empleado[n + 1];


        for (int i = 0; i < n; i++) {
            nuevoArreglo[i] = arreglo[i];
        }


        nuevoArreglo[n] = empleado;


        return nuevoArreglo;
    }


    @Override
    public Empleado buscarElemento(Empleado[] arreglo, int posicion)
            throws IllegalArgumentException, IndexOutOfBoundsException {


        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }


        if (posicion < 0 || posicion >= arreglo.length) {
            throw new IndexOutOfBoundsException("Posición fuera de rango. Se pidió " + posicion +
                    " pero el tamaño es " + arreglo.length);
        }


        return arreglo[posicion];
    }


    @Override
    public Empleado[] eliminarElemento(Empleado[] arreglo, int posicion)
            throws IllegalArgumentException, IndexOutOfBoundsException {


        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }


        if (posicion < 0 || posicion >= arreglo.length) {
            throw new IndexOutOfBoundsException("Posición fuera de rango. Se pidió " + posicion +
                    " pero el tamaño es " + arreglo.length);
        }


        int n = arreglo.length;

        Empleado[] nuevoArreglo = new Empleado[n - 1];


        for (int i = 0; i < posicion; i++) {
            nuevoArreglo[i] = arreglo[i];
        }


        for (int i = posicion + 1; i < n; i++) {
            nuevoArreglo[i - 1] = arreglo[i];
        }


        return nuevoArreglo;
    }
}
