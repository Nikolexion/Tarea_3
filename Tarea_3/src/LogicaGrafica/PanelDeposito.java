package LogicaGrafica;

import javax.swing.*;
import java.awt.*;

public class PanelDeposito {
    private VistaProducto vistaProducto;

    public PanelDeposito() {
        vistaProducto = new VistaProducto();
    }

    public void paint(Graphics g){
        vistaProducto.paint(g);

    }

}
