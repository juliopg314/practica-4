package interfaces;
import modulos.*;
/**
 * Interfaz para el manejo de arreglos de Empleados
 */
public interface ArreglosInterface {

    /**
     * Regresa un nuevo arreglo con los elementos en orden inverso
     * @param arreglo Arreglo original de Empleados
     * @return Nuevo arreglo con elementos en orden reverso
     */
     Empleado[] regresarReversa(Empleado[] arreglo)
         throws IllegalArgumentException, IllegalStateException;

    /**
     * Agrega un empleado al final del arreglo
     * @param arreglo Arreglo original de Empleados
     * @param empleado Empleado a agregar
     * @return Nuevo arreglo con el empleado agregado
     */
     Empleado[] agregarElemento(Empleado[] arreglo, Empleado empleado)
         throws IllegalArgumentException;

    /**
     * Busca un empleado en el arreglo por posición
     * @param arreglo Arreglo donde buscar
     * @param posicion Posición a buscar
     * @return Empleado en la posición especificada
     */
     Empleado buscarElemento(Empleado[] arreglo, int posicion)
         throws IllegalArgumentException, IndexOutOfBoundsException;

    /**
     * Elimina un empleado del arreglo por posición
     * @param arreglo Arreglo original
     * @param posicion Posición del empleado a eliminar
     * @return Nuevo arreglo sin el empleado en la posición especificada
     */
     Empleado[] eliminarElemento(Empleado[] arreglo, int posicion)
         throws IllegalArgumentException, IndexOutOfBoundsException;
}
