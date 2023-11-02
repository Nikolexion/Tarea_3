package Logica;

public class Main {
    public static void main(String[] args)
        throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(6);
        Moneda m = null;
        Comprador c = null;

        //-------------------------------------con dinero SUFICIENTE para el precio-------------------------------------

        System.out.println("---------con dinero SUFICIENTE para el precio---------");
        try {
            m = new Moneda1000();
            c = new Comprador(m, PrecioProducto.COCA, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, PrecioProducto.SPRITE, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, PrecioProducto.FANTA, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, PrecioProducto.SNICKERS, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, PrecioProducto.SUPER8, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (PagoIncorrectoException exception) {
            System.out.println("Moneda inválida");
        } catch (PagoInsuficienteException exception){
            System.out.println("Dinero insuficiente");
        } catch (NoHayProductoException exception){
            System.out.println("No quedan productos");
        }

        //----------------------------------------trata de comprar SIN Moneda-------------------------------------------

        System.out.println("---------trata de comprar SIN Moneda---------");
        try {
            m = null;
            c = new Comprador(m, PrecioProducto.COCA, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            m = null;
            c = new Comprador(m, PrecioProducto.SPRITE, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            m = null;
            c = new Comprador(m, PrecioProducto.FANTA, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            m = null;
            c = new Comprador(m, PrecioProducto.SNICKERS, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            m = null;
            c = new Comprador(m, PrecioProducto.SUPER8, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (PagoIncorrectoException exception) {
            System.out.println("La moneda es invalida");
        }

        //----------------------------------------con MENOS dinero que el precio----------------------------------------

        System.out.println("---------con MENOS dinero que el precio---------");
        try {
            m = new Moneda500();
            c = new Comprador(m, PrecioProducto.COCA, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m, PrecioProducto.SPRITE, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda500();
            c = new Comprador(m, PrecioProducto.FANTA, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda100();
            c = new Comprador(m, PrecioProducto.SNICKERS, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda100();
            c = new Comprador(m, PrecioProducto.SUPER8, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (PagoInsuficienteException exception){
            System.out.println("Dinero insuficiente");
        }

        //-------------------------------------------Deposito VACIO-----------------------------------------------------

        System.out.println("---------Deposito VACIO---------");
        try {
            Expendedor exp1 = new Expendedor(0);
            m = new Moneda1000();
            c = new Comprador(m, PrecioProducto.COCA, exp1);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, PrecioProducto.SPRITE, exp1);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, PrecioProducto.FANTA, exp1);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, PrecioProducto.SNICKERS, exp1);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, PrecioProducto.SUPER8, exp1);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (NoHayProductoException exception){
            System.out.println("No quedan productos");
        }

        //---------------------------------------Prueba de toString Moneda----------------------------------------------

        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        Moneda m4 = new Moneda1500();
        Moneda m5 = new Moneda1500();

        System.out.println("---------Prueba de Moneda toString---------");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println(m4.toString());
    }
}
