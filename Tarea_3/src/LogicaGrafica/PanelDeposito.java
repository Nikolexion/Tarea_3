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
    public void sacarCoca(){
        vistaProducto.sacarCoca();
    }
    public void sacarSprite(){
        vistaProducto.sacarSprite();
    }
    public void sacarFanta(){
        vistaProducto.sacarFanta();
    }
    public void sacarSnikers(){
        vistaProducto.sacarSnikers();
    }
    public void sacarSuper8(){
        vistaProducto.sacarSuper8();
    }

}
