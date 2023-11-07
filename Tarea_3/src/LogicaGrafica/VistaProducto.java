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
    private boolean retiroCoca = false;
    private boolean retiroSprite = false;
    private boolean retiroFanta = false;
    private boolean retiroSnikers = false;
    private boolean retiroSuper8 = false;




    private Image imagenCoca, imagenFanta, imagenSprite, imagenSnikers, imagenSuper8;
    private Image imagenCocaRotada, imagenFantaRotada, imagenSpriteRotada, imagenSnikersRotada, imagenSuper8Rotada;

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

        imagenCocaRotada = new ImageIcon("resources/cocacolaRotada.png").getImage();
        imagenSpriteRotada = new ImageIcon("resources/spriteRotada.png").getImage();
        imagenFantaRotada = new ImageIcon("resources/fantaRotada.png").getImage();
        imagenSnikersRotada = new ImageIcon("resources/snickersRotado.png").getImage();
        imagenSuper8Rotada = new ImageIcon("resources/super8Rotado.png").getImage();

        if (retiroCoca){
            g.drawImage(imagenCocaRotada,214,570,64,40,this);
        } else if (retiroSprite) {
            g.drawImage(imagenSpriteRotada,214,550,65,78,this);
        } else if (retiroFanta) {
            g.drawImage(imagenFantaRotada,209,563,70,58,this);
        } else if (retiroSnikers) {
            g.drawImage(imagenSnikersRotada,214,568,70,58,this);
        } else if (retiroSuper8) {
            g.drawImage(imagenSuper8Rotada,214,568,70,58,this);
        }
        retiroCoca = false;
        retiroSprite = false;
        retiroFanta = false;
        retiroSnikers = false;
        retiroSuper8 = false;

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
            retiroCoca = true;
            cantidadCoca--;
        }
    }
    public void sacarSprite(){
        if (cantidadSprite > 0) {
            retiroSprite = true;
            cantidadSprite--;
        }
    }
    public void sacarFanta(){
        if (cantidadFanta > 0){
            retiroFanta = true;
            cantidadFanta--;
        }
    }
    public void sacarSnikers(){
        if (cantidadSnikers > 0) {
            retiroSnikers = true;
            cantidadSnikers--;
        }
    }
    public void sacarSuper8(){
        if (cantidadSuper8 > 0) {
            retiroSuper8 = true;
            cantidadSuper8--;
        }
    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
}
