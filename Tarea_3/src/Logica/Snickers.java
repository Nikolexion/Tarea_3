package Logica;

/**
 * Tipo de Dulce Snickers, tiene un método para retornar su sonido
 * @author Nikolexion
 */

 public class Snickers extends Dulce{
    /** Constructor vacío de la clase */
    private int serie;
    public Snickers(int serie) {
        super(serie);
        this.serie = serie;
    }
    public int getSerie(){
        return this.serie;
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
