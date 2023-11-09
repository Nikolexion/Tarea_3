package LogicaGrafica;

import Logica.Comprador;
import Logica.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PanelComprador extends JPanel {
    private Image image;
    private Zona zonaRetiro, zonaComer;
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

    }

    public void click(MouseEvent e){
        if (zonaRetiro.contienePunto(e.getX(),e.getY())){
            exp.dep.vaciarRetiro();
        }
        if (zonaComer.contienePunto(e.getX(),e.getY())){
            exp.dep.comerProducto();
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        image = new ImageIcon("resources/comprador.png").getImage();
        g.drawImage(image, 500, 150, 280, 346, this);
    }
}
