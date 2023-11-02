package Logica;

/**
 * Tipo de Bebida Fanta, se inicializa con su serie y tiene un método para retornar su sonido
 * @author Nikolexion
 */

 class Fanta extends Bebida{
    /**
     * Constructor para inicializar la Serie
     * @param serie
     */
    public Fanta(int serie) {
        super(serie);
    }

    /**
     * Método para retornar un String con el "sonido" de la fanta
     * @return String "fanta"
     */
    @Override
    public String comer() {
        return "fanta";
    }
}
