package ventas;

public class Ventas {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana Martínez", "cr6", 5556789);

        
        Factura factura = new Factura("2025-06-10", cliente);

       
        factura.agregarLinea(new Linea(3, 10, "Lapices"));
        factura.agregarLinea(new Linea(2, 25, "Cuadernos"));
        factura.agregarLinea(new Linea(1, 100, "Mochila"));
        
        System.out.println("");
        
        Factura factura2 = new Factura("2025-06-10", cliente);
        
        factura.agregarLinea(new Linea(3, 10, "Lapices"));
        factura.agregarLinea(new Linea(2, 25, "Cuadernos"));
        factura.agregarLinea(new Linea(1, 100, "Mochila"));

       
        factura.imprimirFactura();
        
        factura2.imprimirFactura();
    }
    
}
