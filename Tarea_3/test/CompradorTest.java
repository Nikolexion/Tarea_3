/**
 *Clase de Testing para evaluar unitariamente a la clase Comprador y sus métodos en todos los casos.
 * @author lulunkaii
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {
    //-----------------------------------------Compras con dinero suficiente--------------------------------------------

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente la bebida Cocacola y el vuelto
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testCompraCocaDineroSuficiente()
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, PrecioProducto.COCA, exp);
        assertEquals("cocacola", comprador.queBebiste());
        assertEquals(100, comprador.cuantoVuelto());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente la bebida Sprite y el vuelto
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testCompraSpriteDineroSuficiente()
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, PrecioProducto.SPRITE, exp);
        assertEquals("sprite", comprador.queBebiste());
        assertEquals(200, comprador.cuantoVuelto());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente la bebida Fanta y el vuelto
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testCompraFantaDineroSuficiente()
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, PrecioProducto.FANTA, exp);
        assertEquals("fanta", comprador.queBebiste());
        assertEquals(300, comprador.cuantoVuelto());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente el dulce Snickers y el vuelto
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testCompraSnickersDineroSuficiente()
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, PrecioProducto.SNICKERS, exp);
        assertEquals("snickers", comprador.queBebiste());
        assertEquals(400, comprador.cuantoVuelto());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente el dulce Super8 y el vuelto
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testCompraSuper8DineroSuficiente()
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        Comprador comprador = new Comprador(m, PrecioProducto.SUPER8, exp);
        assertEquals("super8", comprador.queBebiste());
        assertEquals(500, comprador.cuantoVuelto());
    }

    //----------------------------------------Compras con dinero insuficiente-------------------------------------------

    /** Test para evaluar si se da correctamente PagoInsuficienteException */
    @Test
    public void testCompraCocaDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(6);
            Moneda m = new Moneda100();
            Comprador comprador = new Comprador(m, PrecioProducto.COCA, exp);
        });
    }

    /** Test para evaluar si se da correctamente PagoInsuficienteException */
    @Test
    public void testCompraSpriteDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(6);
            Moneda m = new Moneda100();
            Comprador comprador = new Comprador(m, PrecioProducto.SPRITE, exp);
        });
    }

    /** Test para evaluar si se da correctamente PagoInsuficienteException */
    @Test
    public void testCompraFantaDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(6);
            Moneda m = new Moneda100();
            Comprador comprador = new Comprador(m, PrecioProducto.FANTA, exp);
        });
    }

    /** Test para evaluar si se da correctamente PagoInsuficienteException */
    @Test
    public void testCompraSnickersDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(6);
            Moneda m = new Moneda100();
            Comprador comprador = new Comprador(m, PrecioProducto.SNICKERS, exp);
        });
    }

    /** Test para evaluar si se da correctamente PagoInsuficienteException */
    @Test
    public void testCompraSuper8DineroInsuficiente(){
    assertThrows(PagoInsuficienteException.class, () -> {
        Expendedor exp = new Expendedor(6);
        Moneda m = new Moneda100();
        Comprador comprador = new Comprador(m, PrecioProducto.SUPER8, exp);
    });
}

    //------------------------------------------Compras con moneda inválida---------------------------------------------

    /** Test para evaluar si se da correctamente PagoIncorrectoException */
    @Test
    public void testCompraCocaMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = null;
            Comprador comprador = new Comprador(m, PrecioProducto.COCA, exp);
        });
    }

    /** Test para evaluar si se da correctamente PagoIncorrectoException */
    @Test
    public void testCompraSpriteMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda1500();
            Comprador comprador = new Comprador(m, PrecioProducto.SPRITE, exp);
        });
    }

    /** Test para evaluar si se da correctamente PagoIncorrectoException */
    @Test
    public void testCompraFantaMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = null;
            Comprador comprador = new Comprador(m, PrecioProducto.FANTA, exp);
        });
    }

    /** Test para evaluar si se da correctamente PagoIncorrectoException */
    @Test
    public void testCompraSnickersMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda1500();
            Comprador comprador = new Comprador(m, PrecioProducto.SNICKERS, exp);
        });
    }

    /** Test para evaluar si se da correctamente PagoIncorrectoException */
    @Test
    public void testCompraSuper8MonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = null;
            Comprador comprador = new Comprador(m, PrecioProducto.SUPER8, exp);
        });
    }

    //------------------------------------------Compras con depósito vacío----------------------------------------------

    /** Test para evaluar si se da correctamente NoHayProductoException */
    @Test
    public void testCompraCocaConDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            Comprador comprador = new Comprador(m, PrecioProducto.COCA, exp);
        });
    }

    /** Test para evaluar si se da correctamente NoHayProductoException */
    @Test
    public void testCompraSpriteConDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            Comprador comprador = new Comprador(m, PrecioProducto.SPRITE, exp);
        });
    }

    /** Test para evaluar si se da correctamente NoHayProductoException */
    @Test
    public void testCompraFantaConDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            Comprador comprador = new Comprador(m, PrecioProducto.FANTA, exp);
        });
    }

    /** Test para evaluar si se da correctamente NoHayProductoException */
    @Test
    public void testCompraSnickersConDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            Comprador comprador = new Comprador(m, PrecioProducto.SNICKERS, exp);
        });
    }

    /** Test para evaluar si se da correctamente NoHayProductoException */
    @Test
    public void testCompraSuper8ConDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            Comprador comprador = new Comprador(m, PrecioProducto.SUPER8, exp);
        });
    }
}

