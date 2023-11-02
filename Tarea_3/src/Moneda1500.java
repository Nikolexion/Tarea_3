/**
 * Tipo de moneda de valor 1500, tiene un método para obtener su valor como número entero
 * @author Nikolexion
 */

class Moneda1500 extends Moneda{
    /** Constructor con super() para llegar a la superclase */
    public Moneda1500() {
        super();
    }

    /** Método para obtener el valor de la moneda como número entero
     * @return 1500
     */
    @Override
    public int getValor() {
        return 1500;
    }

}
