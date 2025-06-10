package ventas;

import java.util.ArrayList;

public class Factura {
    int sigId = 1;
    int iva = 18;
    String fecha;
    int id;
    Cliente cliente;
    ArrayList<Linea> lineas = new ArrayList<>();

    public Factura(String fecha, Cliente cliente) {
        this.id = sigId++;
        this.fecha = fecha;
        this.cliente = cliente;
    }
    
    public void agregarLinea(Linea linea){
        lineas.add(linea);
    }
    
    public void imprimirFactura(){
        int subtotal = 0;
        
        System.out.println("Factura No° " + id);
        System.out.println("Fecha: " + fecha);
        System.out.println("");
        System.out.println("Datos del cliente");
        System.out.println("------------------------");
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Direccion: " + cliente.direccion);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("");
        System.out.println("Detalle de la factura");
        System.out.println("----------------------------");
        System.out.println("Linea||producto||precio||cantidad");
        
        int i = 1;
        for (Linea l : lineas) {
            int totalLinea = l.getSubtotal();
            subtotal += totalLinea;
            System.out.println(i + " | " + l.getDescripcion() + " | " + l.getCantidad() + " | " + l.getPrecio() + " | " + totalLinea);
            i++;
        }

        int IVA = subtotal * iva / 100;
        int total = subtotal + iva;
        
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + IVA);
        System.out.println("TOTAL: " + total);
    }
    
}
