import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Precio {
    private Producto producto;
    private Tienda tienda;
    private double precio;

    public Precio(Producto producto, Tienda tienda, double precio) {
        this.producto = producto;
        this.tienda = tienda;
        this.precio = precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Producto: " + producto.getNombre() + " | Tienda: " + tienda.getNombre() + " | Precio: " + precio;
    }



}

