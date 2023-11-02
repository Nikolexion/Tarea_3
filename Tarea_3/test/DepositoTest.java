/**
 *Clase de Testing para evaluar unitariamente a la clase Depósito junto a sus métodos addElemento y getElemento
 * @author lulunkaii
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositoTest {

    //-----------------------------------------------Depósitos Cargados-------------------------------------------------

    /** Test para evaluar si funciona Depósito de CocaCola, addElemento y getElemento en caso de haber productos */
    @Test
    public void testGetElementoDepositoCorrectoCoca(){
        Deposito<Producto> d = new Deposito<>();
        d.addElemento(new CocaCola(1));
        assertEquals("cocacola",d.getElemento().comer());
    }

    /** Test para evaluar si funciona Depósito de Sprite, addElemento y getElemento en caso de haber productos */
    @Test
    public void testGetElementoDepositoCorrectoSprite(){
        Deposito<Producto> d = new Deposito<>();
        d.addElemento(new Sprite(1));
        assertEquals("sprite",d.getElemento().comer());
    }

    /** Test para evaluar si funciona Depósito de Fanta, addElemento y getElemento en caso de haber productos */
    @Test
    public void testGetElementoDepositoCorrectoFanta(){
        Deposito<Producto> d = new Deposito<>();
        d.addElemento(new Fanta(1));
        assertEquals("fanta",d.getElemento().comer());
    }

    /** Test para evaluar si funciona Depósito de Snickers, addElemento y getElemento en caso de haber productos */
    @Test
    public void testGetElementoDepositoCorrectoSnickers(){
        Deposito<Producto> d = new Deposito<>();
        d.addElemento(new Snickers());
        assertEquals("snickers",d.getElemento().comer());
    }

    /** Test para evaluar si funciona Depósito de Super8, addElemento y getElemento en caso de haber productos */
    @Test
    public void testGetElementoDepositoCorrectoSuper8(){
        Deposito<Producto> d = new Deposito<>();
        d.addElemento(new Snickers());
        assertEquals("super8",d.getElemento().comer());
    }

    //------------------------------------------------Depósitos Vacíos--------------------------------------------------

    /** Test para evaluar si funciona Depósito de CocaCola, addElemento y getElemento en caso de depósito vacío */
    @Test
    public void testGetElementoDepositoVacioCoca(){
        Deposito<Producto> d = new Deposito<>();
        d.addElemento(new CocaCola(1));
        assertEquals("null",d.getElemento().comer());
    }

    /** Test para evaluar si funciona Depósito de Sprite, addElemento y getElemento en caso de depósito vacío */
    @Test
    public void testGetElementoDepositoVacioSprite(){
        Deposito<Producto> d = new Deposito<>();
        d.addElemento(new Sprite(1));
        assertEquals("null",d.getElemento().comer());
    }

    /** Test para evaluar si funciona Depósito de Fanta, addElemento y getElemento en caso de depósito vacío */
    @Test
    public void testGetElementoDepositoVacioFanta(){
        Deposito<Producto> d = new Deposito<>();
        d.addElemento(new Fanta(1));
        assertEquals("null",d.getElemento().comer());
    }

    /** Test para evaluar si funciona Depósito de Snickers, addElemento y getElemento en caso de depósito vacío */
    @Test
    public void testGetElementoDepositoVacioSnickers(){
        Deposito<Producto> d = new Deposito<>();
        d.addElemento(new Snickers());
        assertEquals("null",d.getElemento().comer());
    }

    /** Test para evaluar si funciona Depósito de Super8, addElemento y getElemento en caso de depósito vacío */
    @Test
    public void testGetElementoDepositoVacioSuper8(){
        Deposito<Producto> d = new Deposito<>();
        d.addElemento(new Super8());
        assertEquals("null",d.getElemento().comer());
    }

}