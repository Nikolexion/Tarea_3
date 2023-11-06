package LogicaGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class VistaProducto implements ImageObserver {
    private int cantidadCoca = 7;
    private int cantidadFanta = 7;
    private int cantidadSprite = 7;
    private int cantidadSnikers = 7;
    private int cantidadSuper8 = 7;

    private Image imagenExpendedor, imagenCoca, imagenFanta, imagenSprite, imagenSnikers, imagenSuper8;
    public void paint(Graphics g){
        imagenCoca =  new ImageIcon("resources/cocacola.png").getImage();
        for (int i = 0; i < cantidadCoca; i++){
            g.drawImage(imagenCoca,80+(45*i),46,40,64,this);
        }
        imagenSprite =  new ImageIcon("resources/sprite.png").getImage();
        for (int i = 0; i < cantidadSprite; i++){
            g.drawImage(imagenSprite,61+(45*i),150,78,65,this);
        }
        imagenFanta = new ImageIcon("resources/fanta.png").getImage();
        for (int i = 0; i < cantidadFanta; i++){
            g.drawImage(imagenFanta,70+(45*i),247,58,70,this);
        }
        imagenSnikers = new ImageIcon("resources/snickers.png").getImage();
        for (int i = 0; i < cantidadSnikers; i++){
            g.drawImage(imagenSnikers,70+(45*i),345,58,70,this);
        }

        imagenSuper8 = new ImageIcon("resources/super8.png").getImage();
        for (int i = 0; i < cantidadSuper8; i++){
            g.drawImage(imagenSuper8,70+(45*i),445,58,70,this);
        }

    }
    public void llenar(){
        cantidadCoca = 7;
        cantidadFanta = 7;
        cantidadSprite = 7;
        cantidadSnikers = 7;
        cantidadSuper8 = 7;
    }
    public void sacarCoca(){
        if (cantidadCoca > 0) {
            cantidadCoca--;
        }
    }
    public void sacarSprite(){
        if (cantidadSprite > 0) {
            cantidadSprite--;
        }
    }
    public void sacarFanta(){
        if (cantidadFanta > 0){
            cantidadFanta--;
        }
    }
    public void sacarSnikers(){
        if (cantidadSnikers > 0) {
            cantidadSnikers--;
        }
    }
    public void sacarSuper8(){
        if (cantidadSuper8 > 0) {
            cantidadSuper8--;
        }
    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
}
