import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Administrador extends Usuario {
    private Set<Categoria> categorias;
    public Administrador(int id, String nombre) {
        super(id, nombre, TipoUsuario.ADMINISTRADOR);
        agregarCategoriasPredeterminadas();
    }

    public void crearProducto(String nombre, Categoria categoria, int cantidad) {
        // Lógica para crear un nuevo producto
    }

    public void crearTienda(String nombre, String direccion) {
        // Lógica para crear una nueva tienda
    }

    public void agregarCategoriasPredeterminadas() {
        this.categorias=new HashSet<>();
        this.categorias.add(Categoria.CARNES);
        this.categorias.add(Categoria.VERDURAS);
        this.categorias.add(Categoria.PRODUCTOS_ASEO);
    }

    public void agregarCategoria(Categoria categoria) {
            this.categorias.add(categoria);
    }

    public void eliminarCategoria(Categoria categoria) {
        this.categorias.remove(categoria);
    }

    public Set<Categoria> consultarCategorias() {

        return this.categorias;
    }
}
