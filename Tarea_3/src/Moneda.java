/**
 * Esta clase es la generalización de los tipos de monedas disponibles para comprar, implementa Comparable, toString,
 * getValor y getSerie
 * @author lulunkaii
 */

abstract class Moneda implements Comparable<Moneda> {
    /** Propiedad privada para guardar la serie inicializada en el constructor */
    protected int serie;

    /** Constructor vacío de la clase */
    public Moneda() {

    }

    /** Método para obtener la serie de la moneda actual */
    public Moneda getSerie(){
        return this;
    }

    /** Método abstracto para obtener en las subclases el valor de la moneda actual */
    public abstract int getValor();

    /** Método para obtener toString de la Moneda indicando su serie(puntero) y valor */
    @Override
    public String toString() {
        return "{" +
                " serie (puntero) = " + super.toString() + "; " +
                "valor = " + this.getValor() +
                '}';
    }

    /** Método para comparar una moneda con otra
     * @return -1 si es menor; 0 si son iguales; 1 si es mayor
     */
    @Override
    public int compareTo(Moneda moneda) {
        return Integer.compare(this.getValor(), moneda.getValor());
    }
}