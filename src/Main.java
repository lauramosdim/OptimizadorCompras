import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            // Creamos algunos objetos de ejemplo
            Categoria frutas = new Categoria(4, "Frutas");
            Producto manzana = new Producto(1, "Manzana", frutas);
            Producto platano = new Producto(2, "Plátano", frutas);
            Producto costillasCerdo = new Producto(3, "Costillas de cerdo", Categoria.CARNES);
            Tienda laVaquita = new Tienda(1, "Supermercado La Vaquita", "Calle 123");
            Tienda exito = new Tienda(2, "Supermercado Exito", "Calle 345");
            Precio precioManzanaLaVaquita = new Precio(manzana, laVaquita, 1500);
            Precio precioPlatanoLaVaquita = new Precio(platano, laVaquita, 1000);
            Precio precioManzanaExito = new Precio(manzana, exito, 1600);
            Precio precioPlatanoExito = new Precio(platano, exito, 800);

            Administrador laura=new Administrador(1,"Laura");
            Administrador daniela=new Administrador(2,"Daniela");
            laura.agregarCategoria(frutas);

            System.out.println(laura.consultarCategorias());
            System.out.println(daniela.consultarCategorias());


            laura.agregarPrecio(precioManzanaLaVaquita);
            laura.agregarPrecio(precioPlatanoLaVaquita);
            laura.agregarPrecio(precioManzanaExito);
            laura.agregarPrecio(precioPlatanoExito);

            System.out.println(laura.consultarPrecios());

            // Podemos acceder al precio de un producto en una tienda específica
            System.out.println("El precio de la manzana en el supermercado laVaquita es: " + precioManzanaLaVaquita.getPrecio());
            System.out.println("El precio del platano en el supermercado es: " + precioManzanaExito.getPrecio());

//            // Creamos una lista de mercado
            ListaMercado listaMercado = new ListaMercado(1, new Date());
            listaMercado.agregarProducto(manzana);
            listaMercado.agregarProducto(platano);


            System.out.println("productos lista "+ listaMercado.obtenerProductosListaMercado());



        System.out.println(listaMercado);
            System.out.println(listaMercado.obtenerPreciosMasBajos(listaMercado.obtenerProductosListaMercado(),laura.consultarPrecios()));
//
//            // Podemos obtener el precio de todos los productos en una tienda específica
//            List<Precio> preciosSupermercado = supermercado.getPrecios();
//            for (Precio precio : preciosSupermercado) {
//                System.out.println("El precio de " + precio.getProducto().getNombre() + " en " +
//                        supermercado.getNombre() + " es " + precio.getPrecio());
//            }

//            // Podemos obtener el valor total de la lista de mercado
//            System.out.println("El valor total de la lista de mercado es: " + listaMercado.calcularTotal());

    }
}