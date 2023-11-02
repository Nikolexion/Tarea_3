/**
 * Clase para generar un ArrayList arbitrario para guardar ya sea monedas o productos. Contiene métodos para agregar
 * elementos al array y sacar elementos del mismo.
 * @author lulunkaii
 */

import java.util.ArrayList;

class Deposito <T> {
    /** Propiedad ArrayList arbitrario para almacenar el array */
    private ArrayList<T>  al;

    /** Constructor para inicializar el arraylist */
    public Deposito() {
        al = new ArrayList();
    }

    /** Método para agregar un elemento al array, no retorna nada*/
    public void addElemento(T elemento) {
        al.add(elemento);
    }

    /** Método obtener un elemeto arbitrario del array
     * @return Elemento de tipo a elección dependiendo de lo que se quiera para Depósito
     */
    public T getElemento() {
        if (al.size() == 0) {
            return null;
        } else {
            return al.remove(0);
        }
    }
}
