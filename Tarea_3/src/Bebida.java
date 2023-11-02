/**
 * Esta clase abstracta es una extensión de Producto para crear la subcategoría Bebida dentro de los tipos de Producto
 * @author Nikolexion
 */

abstract class Bebida extends Producto{
    /** Propiedad privada de Bebida para guardar la serie inicializada en el constructor */
    private int serie;

    /**
     * Constructor de clase Bebida que inicializa la serie de Bebida
     * @param serie
     */
    public Bebida(int serie){
        this.serie = serie;
    }

    /**
     * Getter para obtener la serie de la bebida
     * @return Dato tipo int que representa la serie de la bebida
     */
    public int getSerie(){
        return this.serie;
    }

    /**
     * Este método abstracto es utilizado próximamente en las subclases decretar el "sonido" del producto consumido
     * @return String de producto consumido
     */
    public abstract String comer();
}