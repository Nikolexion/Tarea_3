package Logica;

public class DepositoRetiro {
    private Producto producto;
    public DepositoRetiro(){

    }

    public Producto getProducto() {
        if (producto == null){
            return null;
        } else {
            return producto;
        }
    }
}
