public class Categoria {
  
  private int id; 
  private String nombre;

    // Atributos estáticos con las categorías predefinidas
    public static final Categoria CARNES = new Categoria(1,"Carnes");
    public static final Categoria VERDURAS = new Categoria(2,"Verduras");
    public static final Categoria PRODUCTOS_ASEO = new Categoria(3,"Productos de aseo");

    public Categoria() {
    }

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //"holaaaa"
}
