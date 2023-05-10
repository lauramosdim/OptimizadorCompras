import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private int id;
    private String nombre;
    private TipoUsuario tipoUsuario;
    private Set<Precio> precios;

    public enum TipoUsuario {
        ADMINISTRADOR,
        CLIENTE
    }

    public Usuario(int id, String nombre, TipoUsuario tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.precios = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void agregarPrecio(Precio precio) {
        this.precios.add(precio);
    }

//    public Set<Precio> consultarPrecios() {
//        for (Precio precio : precios) {
//            System.out.println(precio.toString());
//        }
//
//        return this.precios;
//    }

    public Set<Precio> consultarPrecios() {
        Precio[] preciosArray = precios.toArray(new Precio[precios.size()]);
        for (int i = 0; i < preciosArray.length; i++) {
            System.out.println(preciosArray[i].toString());
        }
        return this.precios;
    }


}