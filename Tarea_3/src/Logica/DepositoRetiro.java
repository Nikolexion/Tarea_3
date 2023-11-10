package Logica;
/**
 * Clase hecha para poder guardar el producto que está esperando a ser retirado
 * @author lulunkaii
 * @author Nikolexion
 * */
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
