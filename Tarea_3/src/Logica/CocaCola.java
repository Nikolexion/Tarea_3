package Logica;

/**
 * Tipo de Bebida Cocacola, se inicializa con su serie y tiene un método para retornar su sonido
 * @author Nikolexion
 */

public class CocaCola extends Bebida{
    /** Constructor para inicializar la Serie
     * @param serie
     */
    private int serie;
    public CocaCola(int serie){
        super(serie);
        this.serie = serie;
    }
    public int getSerie(){
        return serie;
    }

    /**
     * Método para retornar un String con el "sonido" de la cocacola
     * @return String "cocacola"
     */
    @Override
    public String comer(){
        return  "cocacola";
    }
}