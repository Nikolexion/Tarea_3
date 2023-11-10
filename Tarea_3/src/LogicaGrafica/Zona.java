package LogicaGrafica;

import javax.swing.*;
/**
 * Clase creada para facilitar la administración de los clicks del usuario
 * delimitando zonas cuadradas que al ser llamadas pueden decir si una interacción
 * occurió dentro suyo
 * @author lulunkaii
 * @author Nikolexion
 * */

public class Zona {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private JButton boton;

    public Zona(int x, int y, int ancho, int alto, JButton boton) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.boton = boton;
    }
    public boolean contienePunto(int puntoX, int puntoY) {
        return puntoX >= x && puntoX <= x + ancho && puntoY >= y && puntoY <= y + alto;
    }

    public JButton getBoton() {
        return boton;
    }
}
