
    import java.util.*;

    public class ListaMercado {
        private int id;
        private Date fecha;
        private double valorTotal;
        private Set<Producto> productos;

        public ListaMercado(int id, Date fecha) {
            this.id = id;
            this.fecha = fecha;
            this.productos=new HashSet<>();
        }

        public void agregarProducto(Producto producto) {
            this.productos.add(producto);
        }



        @Override
        public String toString() {
            return "ListaMercado{" +
                    "id=" + id +
                    ", fecha=" + fecha +
                    ", valorTotal=" + valorTotal +
                    ", productos=" + productos +
                    '}';
        }


        public Set<Producto> obtenerProductosListaMercado() {
                       return this.productos;

        }

        public Set<Precio> obtenerPreciosMasBajos(Set<Producto> listaMercado, Set<Precio> listaPrecios) {
            Set<Precio> preciosMasBajos = new HashSet<>();
            for (Producto producto : listaMercado) {
                Set<Precio> preciosProducto = new HashSet<>();
                for (Precio precio : listaPrecios) {
                    if (precio.getProducto().equals(producto)) {
                        preciosProducto.add(precio);
                    }
                }
                if (!preciosProducto.isEmpty()) {
                    Precio precioMasBajo = Collections.min(preciosProducto, Comparator.comparingDouble(Precio::getPrecio));
                    preciosMasBajos.add(precioMasBajo);
                }
            }
            return preciosMasBajos;
        }

// Getters y setters
        // ...
    }


