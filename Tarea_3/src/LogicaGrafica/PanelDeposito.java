package LogicaGrafica;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que se encarga de conectar al PanelExpendedor con la VistaProducto y VistaMoneda
 * erutiliza las funciones hechas por VistaProducto
 * @author lulunkaii
 * @author Nikolexion
 * */
public class PanelDeposito {
    private VistaProducto vistaProducto;
    private VistaMoneda vistaMoneda;

    public PanelDeposito() {
        vistaProducto = new VistaProducto();
        vistaMoneda = new VistaMoneda();
    }

    public void paint(Graphics g){
        vistaProducto.paint(g);
        vistaMoneda.paint(g);
    }

    public void llenar(){
        vistaProducto.llenar();
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
    public void vaciarRetiro(){
        vistaProducto.vaciarRetiro();
    }
    public void comerProducto(){
        vistaProducto.comerProducto();
    }
    public void vueltoMonedas(int n){
        vistaMoneda.vueltoMonedas(n);
    }
    public void setVueltoFalse(){
        vistaMoneda.setVueltoFalse();
    }

}
