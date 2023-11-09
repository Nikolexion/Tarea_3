package LogicaGrafica;

import Logica.*;
import Logica.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PanelComprador extends JPanel {
    private Image image;
    private Zona zonaRetiro, zonaComer, zonaMoneda100, zonaMoneda500, zonaMoneda1000, zonaMoneda1500;
    private int choiceMoneda100, choiceMoneda500, choiceMoneda1000, choiceMoneda1500;
    private Comprador comprador;
    private PanelExpendedor exp;

    public PanelComprador(PanelExpendedor exp) {
        this.exp = exp;
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
    }

    public void click(MouseEvent e){
        if (zonaRetiro.contienePunto(e.getX(),e.getY())){
            exp.dep.vaciarRetiro();
        }
        if (zonaComer.contienePunto(e.getX(),e.getY())){
            exp.dep.comerProducto();
        }
        if (zonaMoneda100.contienePunto(e.getX(),e.getY())){
            choiceMoneda100++;
            Moneda m = new Moneda100(100+choiceMoneda100);
            exp.setMoneda(m);
        }
        if (zonaMoneda500.contienePunto(e.getX(),e.getY())){
            choiceMoneda500++;
            Moneda m = new Moneda500(200+choiceMoneda500);
            exp.setMoneda(m);
        }
        if (zonaMoneda1000.contienePunto(e.getX(),e.getY())){
            choiceMoneda1000++;
            Moneda m = new Moneda1000(300+choiceMoneda1000);
            exp.setMoneda(m);
        }
        if (zonaMoneda1500.contienePunto(e.getX(),e.getY())){
            choiceMoneda1500++;
            Moneda m = new Moneda1500(400+choiceMoneda1500);
            exp.setMoneda(m);
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        image = new ImageIcon("resources/comprador.png").getImage();
        g.drawImage(image, 500, 150, 280, 346, this);
    }
}
