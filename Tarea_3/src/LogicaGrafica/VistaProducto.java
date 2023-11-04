package LogicaGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class VistaProducto implements ImageObserver {

    private Image imagenExpendedor, imagenCoca, imagenFanta, imagenSprite, imagenSnikers, imagenSuper8;
    public void paint(Graphics g){
        imagenCoca =  new ImageIcon("resources/cocacola.png").getImage();
        for (int i = 0; i < 7; i++){
            g.drawImage(imagenCoca,80+(45*i),46,40,64,this);
        }
        imagenSprite =  new ImageIcon("resources/sprite.png").getImage();
        for (int i = 0; i < 7; i++){
            g.drawImage(imagenSprite,61+(45*i),150,78,65,this);
        }
        imagenFanta = new ImageIcon("resources/fanta.png").getImage();
        for (int i = 0; i < 7; i++){
            g.drawImage(imagenFanta,70+(45*i),247,58,70,this);
        }
        imagenSnikers = new ImageIcon("resources/snickers.png").getImage();
        for (int i = 0; i < 7; i++){
            g.drawImage(imagenSnikers,70+(45*i),345,58,70,this);
        }

        imagenSuper8 = new ImageIcon("resources/super8.png").getImage();
        for (int i = 0; i < 7; i++){
            g.drawImage(imagenSuper8,70+(45*i),445,58,70,this);
        }

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
