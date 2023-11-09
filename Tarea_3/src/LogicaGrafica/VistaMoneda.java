package LogicaGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class VistaMoneda implements ImageObserver {
    private Image imagenMoneda100, imagenMoneda500, imagenMoneda1000, imagenMoneda1500;
    public void paint(Graphics g){

        g.setColor(Color.PINK);
        g.fillRect(800, 90, 500, 160);
        g.setColor(Color.MAGENTA);
        g.drawRect(800,90,500,160);
        g.setColor(Color.BLACK);
        g.drawString("Selecciona la moneda con la que quieres comprar", 910, 120);

        g.setColor(Color.cyan);
        g.fillRect(800, 300, 500, 160);
        g.setColor(Color.blue);
        g.drawRect(800,300,500,160);
        g.setColor(Color.BLACK);
        g.drawString("Lista de precios", 1010, 330);
        g.drawString("Coca---------> $900", 1000, 350);
        g.drawString("Sprite-------> $800", 1000, 370);
        g.drawString("Fanta--------> $700", 1000, 390);
        g.drawString("Snickers-----> $600", 1000, 410);
        g.drawString("Super8-------> $500", 1000, 430);

        imagenMoneda100 =  new ImageIcon("resources/Moneda100.png").getImage();
        g.drawString("$100", 882, 145);
        g.drawImage(imagenMoneda100,846,150,100,99,this);

        g.drawString("$500", 982, 145);
        imagenMoneda500 =  new ImageIcon("resources/Moneda500.png").getImage();
        g.drawImage(imagenMoneda500,946,150,100,99,this);

        g.drawString("$1000", 1082, 145);
        imagenMoneda1000 = new ImageIcon("resources/Moneda1000.png").getImage();
        g.drawImage(imagenMoneda1000,1046,150,100,99,this);

        g.drawString("$1500", 1182, 145);
        imagenMoneda1500 = new ImageIcon("resources/Moneda1500.png").getImage();
        g.drawImage(imagenMoneda1500,1146,150,100,99,this);

    }
    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
}
