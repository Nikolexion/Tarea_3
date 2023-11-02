import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameExpendedor extends JFrame {
    JPanel panel;
    public FrameExpendedor() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        super();
        this.setTitle("Expendedor");
        this.setSize(1400,800);
        setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        IniciarComponentes();
    }
    private void IniciarComponentes() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        ColocarPaneles();
        PonerEtiquetas();
        colocarBotones();
    }
    private void ColocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);
    }
    private void PonerEtiquetas(){
        //Etiqueta imagen
        ImageIcon imagen = new ImageIcon("Expendedor.png");
        JLabel etiqueta = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(350,350,Image.SCALE_SMOOTH)));
        etiqueta.setBounds(5, 15,350,350);
        ImageIcon imagen2 = new ImageIcon("Division.png");
        JLabel etiqueta2 = new JLabel(new ImageIcon(imagen2.getImage().getScaledInstance(1400,800,Image.SCALE_SMOOTH)));
        etiqueta2.setBounds(0,0,1400,800);
        panel.add(etiqueta2);
        panel.add(etiqueta);
    }
    private void colocarBotones() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {

        Expendedor exp = new Expendedor(2);
        JLabel temp = new JLabel("Esperando");
        temp.setBounds(400, 15,350,350);
        panel.add(temp);

        JButton botonCoca = new JButton("Coca");
        botonCoca.setBounds(233, 50, 70, 20);
        botonCoca.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(botonCoca);
        ActionListener listenerCoca = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Comprador comprador = new Comprador(new Moneda1000(), PrecioProducto.COCA, exp);
                    temp.setText(comprador.queBebiste());
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }


            }
        };
        botonCoca.addActionListener(listenerCoca);

        JButton botonFanta = new JButton("Fanta");
        botonFanta.setBounds(233, 80, 70, 20);
        botonFanta.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(botonFanta);
        ActionListener listenerFanta = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Comprador comprador = new Comprador(new Moneda1000(), PrecioProducto.FANTA, exp);
                    temp.setText(comprador.queBebiste());
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        };
        botonFanta.addActionListener(listenerFanta);

        JButton botonSprite = new JButton("Sprite");
        botonSprite.setBounds(233, 110, 70, 20);
        botonSprite.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(botonSprite);
        ActionListener listenerSprite = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Comprador comprador = new Comprador(new Moneda1000(), PrecioProducto.SPRITE, exp);
                    temp.setText(comprador.queBebiste());
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        };
        botonSprite.addActionListener(listenerSprite);

        JButton botonSnickers = new JButton("Snickers");
        botonSnickers.setBounds(233, 140, 70, 20);
        botonSnickers.setFont(new Font("arial",Font.PLAIN,9));
        panel.add(botonSnickers);
        ActionListener listenerSnickers = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Comprador comprador = new Comprador(new Moneda1000(), PrecioProducto.SNICKERS, exp);
                    temp.setText(comprador.queBebiste());
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        };
        botonSnickers.addActionListener(listenerSnickers);

        JButton botonSuper8 = new JButton("Super8");
        botonSuper8.setBounds(233, 170, 70, 20);
        botonSuper8.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(botonSuper8);
        ActionListener listenerSuper8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Comprador comprador = new Comprador(new Moneda1000(), PrecioProducto.SUPER8, exp);
                    temp.setText(comprador.queBebiste());
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        };
        botonSuper8.addActionListener(listenerSuper8);
    }
}
