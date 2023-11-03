package LogicaGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PanelComprador extends JPanel {
    private Image image;
    public void click(MouseEvent e){

    }
    public void paint(Graphics g) {
        super.paint(g);
        image = new ImageIcon("resources/comprador.png").getImage();
        g.drawImage(image, 500, 150, 280, 346, this);
    }
}
