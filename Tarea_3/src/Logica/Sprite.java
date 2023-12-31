package Logica;

/**
 * Tipo de Bebida Sprite, se inicializa con su serie y tiene un método para retornar su sonido
 * @author Nikolexion
 */

public class Sprite extends Bebida{
    /** Constructor para inicializar la Serie
     * @param serie
     */
    private int serie;
    public Sprite(int serie){
        super(serie);
        this.serie = serie;
    }
    public int getSerie(){
        return this.serie;
    }
    /**
     * Método para retornar un String con el "sonido" de la sprite
     * @return String "sprite"
     */
    @Override
    public String comer(){
        return "sprite";
    }
}