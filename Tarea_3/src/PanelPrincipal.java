import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal(){
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setBackground(Color.WHITE);


    }
    public void Paint(Graphics g){
        super.paint(g);
        com.paint(g);
        exp.paint(g);


    }

}
