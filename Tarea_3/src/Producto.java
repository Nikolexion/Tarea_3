/**
 * Esta clase abstracta es la generalización de las clases de productos disponibles a la venta
 * @author Nikolexion
 */

public abstract class Producto {
    /**
     * Este método abstracto es utilizado próximamente en las subclases decretar el "sonido" del producto consumido
     * @return String de producto consumido
     */
    public abstract String comer();
}
