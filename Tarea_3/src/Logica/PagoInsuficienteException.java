package Logica;

/**
 * Subclase de Exception, sirve para determinar un error al momento de comprar y que no alcance el dinero para el
 * producto solicitado.
 * @author Nikolexion
 */

public class PagoInsuficienteException extends Exception{
    public static final long serialVersionUID =700L;

    public PagoInsuficienteException() {
        super();
    }
}
