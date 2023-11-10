package LogicaGrafica;

import Logica.NoHayProductoException;
import Logica.PagoIncorrectoException;
import Logica.PagoInsuficienteException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**Clase que administra a PanelComprador y PanelExpendedor, además de administrar los clicks
 * hechos por el usuario y delegarlos a PanelComprador y PanelExpendedor y además se encarga
 * de dibujar en pantalla todo lo hecho por las clases anteriomente mencionadas
 * @author lulunkaii
 * @author Nikolexion
 * */

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal(){
        exp = new PanelExpendedor();
        com = new PanelComprador(exp);
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
                try {
                    exp.click(e);
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    com.click(e);
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
                repaint();
            }
        });
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        com.paint(g);
        exp.paint(g);
    }

}
