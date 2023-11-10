package LogicaGrafica;

import Logica.*;
import Logica.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
/**
 * Clase que se encarga de toda la parte gráfica con respecto al Comprador
 * extendiendo la clase Jpanel y ocupando varias sus funciones
 * @author lulunkaii
 * @author Nikolexion
 * */

public class PanelComprador extends JPanel {
    private Image image;
    private Zona zonaRetiro, zonaComer, zonaMoneda100, zonaMoneda500, zonaMoneda1000, zonaMoneda1500, zonaCash;
    private int choiceMoneda100, choiceMoneda500, choiceMoneda1000, choiceMoneda1500;
    private Comprador comprador;
    private Moneda m;
    private PanelExpendedor exp;
    private PrecioProducto opc;
    private boolean yaCompro;
/**
 * @param exp Instancia de PanelExpendedor
 * */
    public PanelComprador(PanelExpendedor exp) {
        this.exp = exp;
        //comprador = new Comprador();
        JButton botonRetiro = new JButton();
        zonaRetiro = new Zona(75,552,319,79,botonRetiro);
        add(zonaRetiro.getBoton());
//        comprador = new Comprador()
        JButton botonComer = new JButton();
        zonaComer = new Zona(531, 184, 212, 311,botonComer);
        add(zonaComer.getBoton());

        // Zonas de Monedas
        JButton botonMoneda100 = new JButton();
        zonaMoneda100 = new Zona(846, 150, 100, 99,botonMoneda100);
        add(zonaMoneda100.getBoton());

        JButton botonMoneda500 = new JButton();
        zonaMoneda500 = new Zona(946, 150, 100, 99,botonMoneda500);
        add(zonaMoneda500.getBoton());

        JButton botonMoneda1000 = new JButton();
        zonaMoneda1000 = new Zona(1046, 150, 100, 99,botonMoneda1000);
        add(zonaMoneda1000.getBoton());

        JButton botonMoneda1500 = new JButton();
        zonaMoneda1500 = new Zona(1146, 150, 100, 99,botonMoneda1500);
        add(zonaMoneda1500.getBoton());

        JButton botonCash = new JButton();
        zonaCash = new Zona(425,551,80,80,botonCash);
        add(zonaCash.getBoton());
    }
/**
 * @param e Recibe un MouseEvent para poder administrar las interacciones con PanelComprador
 * */
    public void click(MouseEvent e) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        if (zonaMoneda100.contienePunto(e.getX(),e.getY())){
            exp.dep.setVueltoFalse();
            choiceMoneda100++;
            m = new Moneda100(100+choiceMoneda100);
            System.out.println(m.getSerie());
            exp.setMoneda(m);
        }
        else if (zonaMoneda500.contienePunto(e.getX(),e.getY())){
            exp.dep.setVueltoFalse();
            choiceMoneda500++;
            m = new Moneda500(200+choiceMoneda500);
            System.out.println(m.getSerie());
            exp.setMoneda(m);
        }
        else if (zonaMoneda1000.contienePunto(e.getX(),e.getY())){
            exp.dep.setVueltoFalse();
            choiceMoneda1000++;
            m = new Moneda1000(300+choiceMoneda1000);
            System.out.println(m.getSerie());
            exp.setMoneda(m);
        }
        else if (zonaMoneda1500.contienePunto(e.getX(),e.getY())){
            exp.dep.setVueltoFalse();
            choiceMoneda1500++;
            m = new Moneda1500(400+choiceMoneda1500);
            System.out.println(m.getSerie());
            exp.setMoneda(m);
        }

        if (exp.zonaCoca.contienePunto(e.getX(), e.getY())) {
            this.opc = PrecioProducto.COCA;

        } else if (exp.zonaSprite.contienePunto(e.getX(), e.getY())) {
            this.opc = PrecioProducto.SPRITE;

        } else if (exp.zonaFanta.contienePunto(e.getX(), e.getY())) {
            this.opc = PrecioProducto.FANTA;

        } else if (exp.zonaSnikers.contienePunto(e.getX(), e.getY())) {
            this.opc = PrecioProducto.SNICKERS;

        } else if (exp.zonaSuper8.contienePunto(e.getX(), e.getY())) {
            this.opc = PrecioProducto.SUPER8;
        } else {
            this.opc = null;
        }

        if (zonaRetiro.contienePunto(e.getX(), e.getY())) {
            exp.dep.vaciarRetiro();
            exp.expendedor.cajaRetiro.setProducto(null);
            yaCompro = false;
        }
        if (!yaCompro && opc != null && exp.expendedor != null){
            comprador = new Comprador(m,opc,exp.expendedor);
            System.out.println(comprador.cuantoVuelto());
            this.opc = null;
            yaCompro = true;
        }
        if (zonaComer.contienePunto(e.getX(),e.getY())){
            exp.dep.comerProducto();
        }
        int cuantasMonedas = comprador.cuantoVuelto() / 100;
        if (comprador.cuantoVuelto() != 0){
            if (zonaCash.contienePunto(e.getX(),e.getY())){
                for (int i = 0; i < cuantasMonedas; i++){
                    exp.dep.vueltoMonedas(cuantasMonedas);
                }
            }
        } else {
            comprador.setVuelto(0);
        }

    }
    public void paint(Graphics g) {
        super.paint(g);
        image = new ImageIcon("resources/comprador.png").getImage();
        g.drawImage(image, 500, 150, 280, 346, this);
    }
}
