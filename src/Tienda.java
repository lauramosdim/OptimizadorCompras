import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private int id;
    private String nombre;
    private String direccion;
    private List<Precio> precios;

    public Tienda(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.precios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Precio> getPrecios() {
        return precios;
    }

    public void agregarPrecio(Producto producto, double precio) {
        Precio nuevoPrecio = new Precio(producto, this, precio);
        precios.add(nuevoPrecio);
    }

    public double obtenerPrecioProducto(Producto producto) {
        for (Precio precio : precios) {
            if (precio.getProducto().equals(producto)) {
                return precio.getPrecio();
            }
        }
        return -1; // Retornar -1 si el producto no se encuentra en la tienda
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
