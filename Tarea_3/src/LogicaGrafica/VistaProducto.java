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
        g.drawImage(imagenSprite,61,150,78,65,this);
        g.drawImage(imagenSprite,106,150,78,65,this);
        g.drawImage(imagenSprite,151,150,78,65,this);
        g.drawImage(imagenSprite,196,150,78,65,this);
        g.drawImage(imagenSprite,241,150,78,65,this);
        g.drawImage(imagenSprite,286,150,78,65,this);
        g.drawImage(imagenSprite,331,150,78,65,this);
        imagenFanta = new ImageIcon("resources/fanta.png").getImage();
        g.drawImage(imagenFanta,70,247,58,70,this);
        g.drawImage(imagenFanta,115,247,58,70,this);
        g.drawImage(imagenFanta,160,247,58,70,this);
        g.drawImage(imagenFanta,205,247,58,70,this);
        g.drawImage(imagenFanta,250,247,58,70,this);
        g.drawImage(imagenFanta,295,247,58,70,this);
        g.drawImage(imagenFanta,340,247,58,70,this);
        imagenSnikers = new ImageIcon("resources/snickers.png").getImage();
        g.drawImage(imagenSnikers,70,345,58,70,this);
        g.drawImage(imagenSnikers,115,345,58,70,this);
        g.drawImage(imagenSnikers,160,345,58,70,this);
        g.drawImage(imagenSnikers,205,345,58,70,this);
        g.drawImage(imagenSnikers,250,345,58,70,this);
        g.drawImage(imagenSnikers,295,345,58,70,this);
        g.drawImage(imagenSnikers,340,345,58,70,this);

        imagenSuper8 = new ImageIcon("resources/super8.png").getImage();
        g.drawImage(imagenSuper8,70,445,58,70,this);
        g.drawImage(imagenSuper8,115,445,58,70,this);
        g.drawImage(imagenSuper8,160,445,58,70,this);
        g.drawImage(imagenSuper8,205,445,58,70,this);
        g.drawImage(imagenSuper8,250,445,58,70,this);
        g.drawImage(imagenSuper8,295,445,58,70,this);
        g.drawImage(imagenSuper8,340,445,58,70,this);


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
