package LogicaGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class VistaMoneda implements ImageObserver {
    private Image imagenMoneda100, imagenMoneda500, imagenMoneda1000, imagenMoneda1500;
    public void paint(Graphics g){
        imagenMoneda100 =  new ImageIcon("resources/Moneda100.png").getImage();
        g.drawImage(imagenMoneda100,846,150,100,99,this);

        imagenMoneda500 =  new ImageIcon("resources/Moneda500.png").getImage();
        g.drawImage(imagenMoneda500,946,150,100,99,this);

        imagenMoneda1000 = new ImageIcon("resources/Moneda1000.png").getImage();
        g.drawImage(imagenMoneda1000,1046,150,100,99,this);

        imagenMoneda1500 = new ImageIcon("resources/Moneda1500.png").getImage();
        g.drawImage(imagenMoneda1500,1146,150,100,99,this);

    }
    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
}
