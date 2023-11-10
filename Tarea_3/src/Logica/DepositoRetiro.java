package Logica;

public class DepositoRetiro {
    private Producto producto;
    public DepositoRetiro(Producto producto){
        this.producto = producto;
    }

    public Producto getProducto() {
        if (producto == null){
            return null;
        } else {
            return producto;
        }
    }
    public int getSerie(){
        return producto.getSerie();
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
