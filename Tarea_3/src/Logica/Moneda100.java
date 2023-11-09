package Logica;

/**
 * Tipo de moneda de valor 100, tiene un método para obtener su valor como número entero
 * @author Nikolexion
 */
public class Moneda100 extends Moneda{
    /** Constructor con super() para llegar a la superclase */
    public Moneda100(int serie) {
        super(serie);
    }

    /** Método para obtener el valor de la moneda como número entero
     * @return 100
     */
    @Override
    public int getValor() {
        return 100;
    }

}
