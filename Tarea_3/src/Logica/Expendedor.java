package Logica;

/**
 * Clase que principal del código en donde se relacionan todas las clases para que se efectúe una compra. Inicializa
 * y llena los depósitos, contiene el método comprarProducto junto a las posibles Exceptions que puede gatillar en su
 * uso. Además, tiene un método para obtener el vuelto.
 */

public class Expendedor {
    /**
     * Propiedades Depósito para guardar cada producto
     */
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;
    public DepositoRetiro cajaRetiro;

    /**
     * Propiedades Depósito para guardar las monedas
     */
    private Deposito<Moneda> monVu;

    /**
     * Constructor de Expendedor que inicializa los depósitos con el parámetro numProductos y los llena según
     * corresponda.
     *
     * @param numProductos Sirve para llenar los depósitos con numProductos Productos
     */
    public Expendedor(int numProductos) {

        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        monVu = new Deposito<>();
        cajaRetiro = new DepositoRetiro(null);

        for (int i = 0; i < numProductos; i++) {
            coca.addElemento(new CocaCola(100 + i));
            sprite.addElemento(new Sprite(200 + i));
            fanta.addElemento(new Fanta(300 + i));
        }
        for (int i = 0; i < numProductos; i++) {
            snickers.addElemento(new Snickers(400 + i));
            super8.addElemento(new Super8(500 + i));
        }
    }

    /**
     * Método que ocupa una moneda y una opción numérica tipo PrecioProducto para evaluar si la moneda es válida, si es
     * menor, mayor o igual que el precio y dadas las circunstancias generar las monedas de 100 y entregar el producto
     * según corresponda. El método puede hacer throw de Exceptions. Finalmente, retorna un Producto.
     *
     * @param m Moneda a utilizar para comprar
     * @param opcion Opción tipo PrecioProducto ej: "PrecioProducto.COCA"
     * @return Producto de interés
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException   Error por pagar con una moneda nula o inválida (ej: 1500)
     * @throws NoHayProductoException    Error debido a que no quedan productos en el depósito o no existe el producto
     */
    public void comprarProducto(Moneda m, PrecioProducto opcion)
            throws PagoInsuficienteException, PagoIncorrectoException, NoHayProductoException {
        {
            if (m == null) {
                throw new PagoIncorrectoException();
            }
            if (m.getValor() == 1500) {
                monVu.addElemento(m);
                throw new PagoIncorrectoException();
            }
            if (m.getValor() < opcion.getPrecioProducto()) {
                monVu.addElemento(m);
                throw new PagoInsuficienteException();
            }

            int numVueltoMonedas100 = (m.getValor() - opcion.getPrecioProducto()) / 100;
            Producto aux = null;
            switch (opcion) {
                case COCA:
                    aux = coca.getElemento();
                    for (int i = 0; i < numVueltoMonedas100; i++) {
                        monVu.addElemento(new Moneda100(100+i));
                    }
                    break;
                case SPRITE:
                    aux = sprite.getElemento();
                    for (int i = 0; i < numVueltoMonedas100; i++) {
                        monVu.addElemento(new Moneda100(100+i));
                    }
                    break;
                case FANTA:
                    aux = fanta.getElemento();
                    for (int i = 0; i < numVueltoMonedas100; i++) {
                        monVu.addElemento(new Moneda100(100+i));
                    }
                    break;
                case SNICKERS:
                    aux = snickers.getElemento();
                    for (int i = 0; i < numVueltoMonedas100; i++) {
                        monVu.addElemento(new Moneda100(100+i));
                    }
                    break;
                case SUPER8:
                    aux = super8.getElemento();
                    for (int i = 0; i < numVueltoMonedas100; i++) {
                        monVu.addElemento(new Moneda100(100+i));
                    }
                    break;
                default:
                    monVu.addElemento(m);
                    throw new NoHayProductoException();
            }
            if (aux == null) {
                monVu.addElemento(m);
                throw new NoHayProductoException();
            } else {
                cajaRetiro = new DepositoRetiro(aux);
            }
        }
    }

    /** Método para obtener el vuelto en formato Moneda */
    public Moneda getVuelto() {
        return monVu.getElemento();
    }
}