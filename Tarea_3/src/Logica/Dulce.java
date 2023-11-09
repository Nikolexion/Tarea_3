package Logica;

/**
 * Esta clase abstracta es una extensión de Producto para crear la subcategoría Dulce dentro de los tipos de Producto
 * @author Nikolexion
 */

public abstract class Dulce extends Producto{
    /** Constructor vacío de la clase */
    int serie;
    public Dulce(int serie) {
        this.serie = serie;
    }
    public int getSerie(){
        return this.serie;
    }

    /**
     * Este método abstracto es utilizado próximamente en las subclases decretar el "sonido" del producto consumido
     * @return String de producto consumido
     */
    public abstract String comer();
}
