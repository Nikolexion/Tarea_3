/**
 *Clase de Testing para evaluar unitariamente a la clase Expendedor y su método comprarProducto y getVuelto.
 * @author lulunkaii
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {

    //-----------------------------------------Compras con dinero suficiente--------------------------------------------
    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente la bebida Cocacola y getVuelto saca una
     * moneda de 100
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testComprarCocaDineroSuficiente()
    throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda1000();
            assertEquals("cocacola",exp.comprarProducto(m,PrecioProducto.COCA).comer());
            assertEquals(100,exp.getVuelto().getValor());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente la bebida Sprite y getVuelto saca una
     * moneda de 100
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testComprarSpriteDineroSuficiente()
    throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        assertEquals("sprite",exp.comprarProducto(m,PrecioProducto.SPRITE).comer());
        assertEquals(100,exp.getVuelto().getValor());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente la bebida Fanta y getVuelto saca una
     * moneda de 100
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testComprarFantaDineroSuficiente()
    throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        assertEquals("fanta",exp.comprarProducto(m,PrecioProducto.FANTA).comer());
        assertEquals(100,exp.getVuelto().getValor());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente el dulce Snickers y getVuelto saca una
     * moneda de 100
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testComprarSnickersDineroSuficiente()
    throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        assertEquals("snickers",exp.comprarProducto(m,PrecioProducto.SNICKERS).comer());
        assertEquals(100,exp.getVuelto().getValor());
    }

    /**
     * Test para evaluar si dado tener dinero suficiente, retorna correctamente el dulce Super8 y getVuelto saca una
     * moneda de 100
     * @throws NoHayProductoException Error debido a que no quedan productos en el depósito o no existe el producto
     * @throws PagoInsuficienteException Error por pagar con menos dinero del solicitado
     * @throws PagoIncorrectoException Error por pagar con una moneda nula o inválida (ej: 1500)
     */
    @Test
    public void testComprarSuper8DineroSuficiente()
    throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000();
        assertEquals("super8",exp.comprarProducto(m,PrecioProducto.SUPER8).comer());
        assertEquals(100,exp.getVuelto().getValor());
    }

    //----------------------------------------Compras con dinero insuficiente-------------------------------------------
    /**Test para evaluar si se da correctamente PagoInsuficienteException*/
    @Test
    public void testCompraCocaDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda100();
            exp.comprarProducto(m,PrecioProducto.COCA).comer();
        });
    }

    /**Test para evaluar si se da correctamente PagoInsuficienteException*/
    @Test
    public void testCompraSpriteDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda100();
            exp.comprarProducto(m,PrecioProducto.COCA).comer();
        });
    }

    /**Test para evaluar si se da correctamente PagoInsuficienteException*/
    @Test
    public void testCompraFantaDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda100();
            exp.comprarProducto(m,PrecioProducto.COCA).comer();
        });
    }

    /**Test para evaluar si se da correctamente PagoInsuficienteException*/
    @Test
    public void testCompraSnickersDineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda100();
            exp.comprarProducto(m,PrecioProducto.COCA).comer();
        });
    }

    /**Test para evaluar si se da correctamente PagoInsuficienteException*/
    @Test
    public void testCompraSuper8DineroInsuficiente(){
        assertThrows(PagoInsuficienteException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda100();
            exp.comprarProducto(m,PrecioProducto.COCA).comer();
        });
    }

    //------------------------------------------Compras con moneda inválida---------------------------------------------

    /** Test para evaluar si se da correctamente PagoIncorrectoException */
    @Test
    public void testCompraCocaMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda1500();
            exp.comprarProducto(m,PrecioProducto.COCA).comer();
        });
    }

    /** Test para evaluar si se da correctamente PagoIncorrectoException */
    @Test
    public void testCompraSpriteMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = null;
            exp.comprarProducto(m,PrecioProducto.SPRITE).comer();
        });
    }

    /** Test para evaluar si se da correctamente PagoIncorrectoException */
    @Test
    public void testCompraFantaMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda1500();
            exp.comprarProducto(m,PrecioProducto.FANTA).comer();
        });
    }

    /** Test para evaluar si se da correctamente PagoIncorrectoException */
    @Test
    public void testCompraSnickersMonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = null;
            exp.comprarProducto(m,PrecioProducto.SNICKERS).comer();
        });
    }

    /** Test para evaluar si se da correctamente PagoIncorrectoException */
    @Test
    public void testCompraSuper8MonedaInvalida(){
        assertThrows(PagoIncorrectoException.class, () -> {
            Expendedor exp = new Expendedor(4);
            Moneda m = new Moneda1500();
            exp.comprarProducto(m,PrecioProducto.SUPER8).comer();
        });
    }

    //------------------------------------------Compras con depósito vacío----------------------------------------------

    /** Test para evaluar si se da correctamente NoHayProductoException */
    @Test
    public void testCompraCocaDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            exp.comprarProducto(m,PrecioProducto.COCA).comer();
        });
    }

    /** Test para evaluar si se da correctamente NoHayProductoException */
    @Test
    public void testCompraSpriteDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            exp.comprarProducto(m,PrecioProducto.SPRITE).comer();
        });
    }

    /** Test para evaluar si se da correctamente NoHayProductoException */
    @Test
    public void testCompraFantaDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            exp.comprarProducto(m,PrecioProducto.FANTA).comer();
        });
    }

    /** Test para evaluar si se da correctamente NoHayProductoException */
    @Test
    public void testCompraSnickersDepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            exp.comprarProducto(m,PrecioProducto.SNICKERS).comer();
        });
    }

    /** Test para evaluar si se da correctamente NoHayProductoException */
    @Test
    public void testCompraSuper8DepositoVacio(){
        assertThrows(NoHayProductoException.class, () -> {
            Expendedor exp = new Expendedor(0);
            Moneda m = new Moneda1000();
            exp.comprarProducto(m,PrecioProducto.SUPER8).comer();
        });
    }
}