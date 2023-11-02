package Logica;

/**
 * Subclase de Exception, sirve para determinar un error al momento de comprar y que no haya productos en el depósito,
 * ya sea porque no existen productos con ese índice o que no queden productos.
 * @author Nikolexion
 */

public class NoHayProductoException extends Exception{
    public static final long serialVersionUID =700L;

    public NoHayProductoException() {
        super();
    }
}
