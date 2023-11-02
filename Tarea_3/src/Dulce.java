/**
 * Esta clase abstracta es una extensión de Producto para crear la subcategoría Dulce dentro de los tipos de Producto
 * @author Nikolexion
 */

abstract class Dulce extends Producto{
    /** Constructor vacío de la clase */
    public Dulce() {
    }

    /**
     * Este método abstracto es utilizado próximamente en las subclases decretar el "sonido" del producto consumido
     * @return String de producto consumido
     */
    public abstract String comer();
}
