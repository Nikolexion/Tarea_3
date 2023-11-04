package LogicaGrafica;

import Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**Clase que configura el panel que contiene todas las funcionalidades del expendedor
 * @author lulunkaii
 * @author Nikolexion
*/

public class PanelExpendedor extends JPanel {
    private PanelDeposito dep;
    private Image imagenExpendedor;
    private Expendedor expendedor;
    public Zona zonaCoca;
    public Zona zonaSprite;
    public Zona zonaFanta;
    public Zona zonaSnikers;
    public Zona zonaSuper8;
    public PanelExpendedor(){
        dep = new PanelDeposito();
        expendedor = new Expendedor(7);
        JButton botonCoca = new JButton("Zona Coca");
        JButton botonSprite = new JButton("Zona Sprite");
        JButton botonFanta = new JButton("Zona Fanta");
        JButton botonSnikers = new JButton("Zona Snikers");
        JButton botonSuper8 = new JButton("Zona Super8");
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


    }
    public void click(MouseEvent e){
        if (zonaCoca.contienePunto(e.getX(), e.getY())) {
            System.out.println("coca");
        } else if (zonaSprite.contienePunto(e.getX(), e.getY())) {
            System.out.println("sprite");
        } else if (zonaFanta.contienePunto(e.getX(), e.getY())) {
            System.out.println("fanta");
        } else if (zonaSnikers.contienePunto(e.getX(), e.getY())) {
            System.out.println("snikers");
        } else if (zonaSuper8.contienePunto(e.getX(), e.getY())) {
            System.out.println("super8");
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        imagenExpendedor = new ImageIcon("resources/Expendedor.png").getImage();
        g.drawImage(imagenExpendedor,30,10,512,700,this);
        dep.paint(g);

    }
}
