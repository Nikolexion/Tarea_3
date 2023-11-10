package LogicaGrafica;

import Logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**Clase que configura el panel que contiene todas las funcionalidades del expendedor
 * extendiendo la clase JPanel y utilizando varias de sus funciones
 * @author lulunkaii
 * @author Nikolexion
*/

public class PanelExpendedor extends JPanel {
    public PanelDeposito dep;
    private Image imagenExpendedor;
    public Expendedor expendedor;
    private Moneda m;
    public Zona zonaCoca, zonaSprite,zonaFanta, zonaSnikers, zonaSuper8, zonaFill;
    public PanelExpendedor(){
        dep = new PanelDeposito();
        expendedor = new Expendedor(7);
        JButton botonCoca = new JButton("Zona Coca");
        JButton botonSprite = new JButton("Zona Sprite");
        JButton botonFanta = new JButton("Zona Fanta");
        JButton botonSnikers = new JButton("Zona Snikers");
        JButton botonSuper8 = new JButton("Zona Super8");
        JButton botonFill = new JButton("Zona Fill");

        zonaCoca = new Zona(411, 56, 46, 48, botonCoca);
        add(zonaCoca.getBoton());

        zonaSprite = new Zona(411, 156, 46, 48, botonSprite);
        add(zonaSprite.getBoton());

        zonaFanta = new Zona(411, 256, 46, 48, botonFanta);
        add(zonaFanta.getBoton());

        zonaSnikers = new Zona(411, 356, 46, 48, botonSnikers);
        add(zonaSnikers.getBoton());

        zonaSuper8 = new Zona(411, 457, 46, 48, botonSuper8);
        add(zonaSuper8.getBoton());

        zonaFill = new Zona(475,50,32,155,botonFill);
        add(zonaFill.getBoton());



    }
    /**
     * @param e Recibe un MouseEvent para administrar las interacciones con el PanelExpendedor
     * */
    public void click(MouseEvent e) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        if (zonaCoca.contienePunto(e.getX(), e.getY())) {
            if (expendedor.cajaRetiro.getProducto() != null){
                dep.sacarCoca();
                System.out.println(expendedor.cajaRetiro.getSerie());
                this.m = null;
            }
        } else if (zonaSprite.contienePunto(e.getX(), e.getY())) {
            if (expendedor.cajaRetiro.getProducto() != null){
                dep.sacarSprite();
                System.out.println(expendedor.cajaRetiro.getSerie());
                this.m = null;
            }
        } else if (zonaFanta.contienePunto(e.getX(), e.getY())) {
            if (expendedor.cajaRetiro.getProducto() != null){
                dep.sacarFanta();
                System.out.println(expendedor.cajaRetiro.getSerie());
            }
        } else if (zonaSnikers.contienePunto(e.getX(), e.getY())) {
            if (expendedor.cajaRetiro.getProducto() != null){
                dep.sacarSnikers();
                System.out.println(expendedor.cajaRetiro.getSerie());
                this.m = null;
            }
        } else if (zonaSuper8.contienePunto(e.getX(), e.getY())) {
            if (expendedor.cajaRetiro.getProducto() != null){
                dep.sacarSuper8();
                System.out.println(expendedor.cajaRetiro.getSerie());
                this.m = null;
            }
        } else if (zonaFill.contienePunto(e.getX(),e.getY())) {
            expendedor = new Expendedor(7);
            dep.llenar();

        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        imagenExpendedor = new ImageIcon("resources/Expendedor.png").getImage();
        g.drawImage(imagenExpendedor,30,10,512,700,this);
        dep.paint(g);

    }

    public void setMoneda(Moneda moneda){
        this.m = moneda;
    }
}
