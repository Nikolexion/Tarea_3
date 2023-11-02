package Logica;

/**
 * Tipo de Dulce Super8, tiene un método para retornar su sonido
 * @author Nikolexion
 */

public class Super8 extends Dulce{
    /** Constructor vacío de la clase */
    public Super8() {
    }

    /**
     * Método para retornar un String con el "sonido" del super8
     * @return String "super8"
     */
    @Override
    public String comer() {
        return "super8";
    }
}
