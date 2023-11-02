package Logica;

/**
 * Tipo de Dulce Snickers, tiene un método para retornar su sonido
 * @author Nikolexion
 */

 public class Snickers extends Dulce{
    /** Constructor vacío de la clase */
    public Snickers() {
    }

    /**
     * Método para retornar un String con el "sonido" del snickers
     * @return String "snickers"
     */
    @Override
    public String comer() {
        return "snickers";
    }
}
