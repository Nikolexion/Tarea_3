package LogicaGrafica;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelExpendedor extends JPanel {
    private Image imagenExpendedor;
    public List<Zona> zonas;

    public void paint(Graphics g) {
        super.paint(g);
        imagenExpendedor = new ImageIcon("resources/Expendedor.png").getImage();
        g.drawImage(imagenExpendedor,30,10,512,700,this);
        JButton botonCoca = new JButton("Zona Coca");
        JButton botonSprite = new JButton("Zona Sprite");
        JButton botonFanta = new JButton("Zona Fanta");
        JButton botonSnikers = new JButton("Zona Snikers");
        JButton botonSuper8 = new JButton("Zona Super8");


        Zona zonaCoca = new Zona(411, 56, 46, 48, botonCoca);
        add(zonaCoca.getBoton());

        Zona zonaSprite = new Zona(411, 156, 46, 48, botonSprite);
        add(zonaSprite.getBoton());

        Zona zonaFanta = new Zona(411, 256, 46, 48, botonFanta);
        add(zonaFanta.getBoton());

        Zona zonaSnikers = new Zona(411, 356, 46, 48, botonSnikers);
        add(zonaSnikers.getBoton());

        Zona zonaSuper8 = new Zona(411, 457, 46, 48, botonSuper8);
        add(zonaSuper8.getBoton());
    }
}
