package LogicaGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal(){
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setSize(800, 600);

        this.setBackground(Color.WHITE);

        JFrame frame = new JFrame("Expendedor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(1366,768);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (Zona zona : exp.zonas) {
                    if (zona.contienePunto(e.getX(), e.getY())) {
                        // El clic ocurrió en esta zona
                        JOptionPane.showMessageDialog(null, "Hiciste clic en " + zona.getBoton().getText());
                        // Realiza cualquier acción adicional que desees
                    }
                }
            }
        });


    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        exp.paint(g);
        com.paint(g);


    }

}
