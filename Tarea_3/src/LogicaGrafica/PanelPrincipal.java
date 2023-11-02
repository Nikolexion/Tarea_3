package LogicaGrafica;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    private Image image;
    public PanelPrincipal(){
        exp = new PanelExpendedor();
        com = new PanelComprador();
        image = new ImageIcon("resources/comprador.png").getImage();
        this.setSize(800, 600);

        this.setBackground(Color.WHITE);

        JFrame frame = new JFrame("Expendedor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(1366,768);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        com.paint(g);
        exp.paint(g);
        g.setColor(Color.BLACK);
        g.drawLine(683, 0, 683, 768);
        g.drawLine(683, 384, 1366, 384);
        g.drawImage(image, 100, 100, 280, 346, this);

    }

}
