package Logica;

/**
 * Clase que representa a un Comprador en nuestro sistema, sirve para efectuar y calcular la compra, que retorne el
 * vuelto, y que el Comprador se tome la Bebida o se coma el Dulce. Ya que involucra a comprarProducto() puede hacer
 * throw de Exceptions. Contiene dos métodos para obtener el vuelto y el sonido después de la compra.
 * @author lulunkaii
 * @author Nikolexion
 */

public class Comprador{
    /** Propiedad sonido para almacenar el String obtenido en el método comer() de Producto */
    private String sonido;

    /** Propiedad vuelto almacena el dinero a retornar para el usuario */
    private int vuelto;

    /**
     * Constructor que efectúa la compra de un producto en el expendedor que se ingresa como parámetro, calcula el
     * vuelto en monedas de 100 si la compra es efectiva y simula el que el Comprador consume el Producto.
     * @param m Moneda para comprar
     * @param opcion Elección del tipo de producto, tipo PrecioProducto
     * @param exp Expendedor a referirse para la compra
     * @throws NoHayProductoException Error por si no quedan productos en el depósito
     * @throws PagoInsuficienteException Error por si el dinero no alcanza para comprar lo deseado
     * @throws PagoIncorrectoException Error por si la moneda es nula o inválida
     */
    public Comprador(Moneda m, PrecioProducto opcion, Expendedor exp)
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {

        Producto b = exp.comprarProducto(m, opcion);
        if (m != null){
            if (b == null){
                sonido = null;
            } else {
                sonido = b.comer();
            }
            Moneda aux;
            aux = exp.getVuelto();
            while (aux != null){
                vuelto += aux.getValor();
                aux = exp.getVuelto();
            }
        } else {
            sonido = null;
            this.vuelto = 0;
        }
    }

    /** Método para obtener el vuelto calculado
     * @return int Vuelto calculado
     */
    public int cuantoVuelto(){
        return this.vuelto;
    }

    /** Método para obtener el sonido al consumir el producto
     * @return String con el sonido del producto comprado
     */
    public String queBebiste(){
        return sonido;
    }
}