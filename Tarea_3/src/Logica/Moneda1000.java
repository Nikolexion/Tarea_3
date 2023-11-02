package Logica;

/**
 * Tipo de moneda de valor 1000, tiene un método para obtener su valor como número entero
 * @author Nikolexion
 */

public class Moneda1000 extends Moneda{
    /** Constructor con super() para llegar a la superclase */
    public Moneda1000() {
        super();
    }

    /** Método para obtener el valor de la moneda como número entero
     * @return 1000
     */
    @Override
    public int getValor() {
        return 1000;
    }

}
