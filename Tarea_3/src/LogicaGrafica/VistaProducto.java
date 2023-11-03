package LogicaGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class VistaProducto implements ImageObserver {

    private Image imagenExpendedor, imagenCoca, imagenFanta, imagenSprite, imagenSnikers, imagenSuper8;
    public void paint(Graphics g){
        imagenCoca =  new ImageIcon("resources/cocacola.png").getImage();
        g.drawImage(imagenCoca,80,46,40,64,this);
        g.drawImage(imagenCoca,125,46,40,64,this);
        g.drawImage(imagenCoca,170,46,40,64,this);
        g.drawImage(imagenCoca,215,46,40,64,this);
        g.drawImage(imagenCoca,260,46,40,64,this);
        g.drawImage(imagenCoca,305,46,40,64,this);
        g.drawImage(imagenCoca,350,46,40,64,this);
        imagenSprite =  new ImageIcon("resources/sprite.png").getImage();
        g.drawImage(imagenSprite,10,10,90,80,this);
    }
    public void llenarProductos(Graphics g){

    }
    public void sacarCoca(){

    }
    public void sacarFanta(){

    }
    public void sacarSprite(){

    }
    public void sacarSnikers(){

    }
    public void sacarSuper8(){

    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
}
