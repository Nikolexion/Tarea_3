/**
 *Clase de Testing para evaluar unitariamente a la clase Moneda y su método compareTo en todos los casos.
 * @author lulunkaii
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {

    /** Test que busca comparar una moneda de 1500 con una de 100. Ya que es más grande, debe retornar 1. */
    @Test
    public void testCompareToDebeRetornar1(){
        Moneda m1 = new Moneda1500();
        Moneda m2 = new Moneda100();
        assertEquals(1,m1.compareTo(m2));
        System.out.println(m1.compareTo(m2));
    }

    /** Test que busca comparar una moneda de 100 con una de 100. Ya que son iguales, debe retornar 0. */
    @Test
    public void testCompareToDebeRetornar0(){
        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda100();
        assertEquals(0,m1.compareTo(m2));
        System.out.println(m1.compareTo(m2));
    }

    /** Test que busca comparar una moneda de 100 con una de 1500. Ya que es más grande, debe retornar -1. */
    @Test
    public void testCompareToDebeRetornarMenos1(){
        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda1500();
        assertEquals(-1,m1.compareTo(m2));
        System.out.println(m1.compareTo(m2));
    }
}