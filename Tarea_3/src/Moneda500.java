/**
 * Tipo de moneda de valor 500, tiene un método para obtener su valor como número entero
 * @author Nikolexion
 */

class Moneda500 extends Moneda{
    /** Constructor con super() para llegar a la superclase */
    public Moneda500() {
        super();
    }

    /** Método para obtener el valor de la moneda como número entero
     * @return 500
     */
    @Override
    public int getValor() {
        return 500;
    }

}