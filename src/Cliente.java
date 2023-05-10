public class Cliente extends Usuario {
    public Cliente(int id, String nombre, TipoUsuario tipoUsuario) {
        super(id, nombre, tipoUsuario);
    }
//    public Cliente(int id, String nombre, TipoUsuario tipoUsuario) {
////        super(id, nombre, TipoUsuario.CLIENTE);
////        this.historicoCompras = new ArrayList<>();
////    }
////
////    public List<Compra> getHistoricoCompras() {
////        return historicoCompras;
////    }
////
////    public void agregarCompra(Compra compra) {
////        historicoCompras.add(compra);
////    }
}
