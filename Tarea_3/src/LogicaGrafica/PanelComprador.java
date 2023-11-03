package LogicaGrafica;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private Image image;
    public void paint(Graphics g) {
        super.paint(g);
        image = new ImageIcon("resources/comprador.png").getImage();
        g.drawImage(image, 500, 150, 280, 346, this);
    }
}
