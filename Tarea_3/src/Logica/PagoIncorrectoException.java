package Logica;

/**
 * Subclase de Exception, sirve para determinar un error al momento de comprar y que la moneda sea inválida, ya sea una
 * moneda nula o una moneda incorrecta (como Moneda1500).
 * @author Nikolexion
 */

public class PagoIncorrectoException extends Exception{
    public static final long serialVersionUID =700L;

    public PagoIncorrectoException() {
        super();
    }
}
