/**
 * Clase enumerada para establecer los índices de los productos (escritos en orden) y fijar sus precios. Tiene un
 * método para acceder al precio del producto desde otras clases.
 * @author lulunkaii
 */

public enum PrecioProducto {
    /** Inicializamos los precios constantes a elección para todos nuestros productos en el orden con el que deseamos
     * indexarlos próximamente
     */
    COCA(900),
    SPRITE(800),
    FANTA(700),
    SNICKERS(600),
    SUPER8(500);

    /** Propiedad privada para almacenar el precio inicializado en el constructor */
    private int precio;

    /** Constructor que inicializa el precio */
    PrecioProducto(int precio){
        this.precio = precio;
    }

    /** Método para obtener el precio del producto como número entero
     * @return Precio del producto elegido como int
     */
    public int getPrecioProducto(){
        return precio;
    }
}
