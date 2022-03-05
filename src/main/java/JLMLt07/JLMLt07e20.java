/*Clase Factura con nº de identificador, fecha, nº cliente, % iva de 21%, 
nº indeterminado de lineaFactura (con: descripción,Precio unitario,cantidad de
unidades,% descuento de 5% con + de 10 unidades y el importe total (inicialmente
a cero con actualizaciones)) añadir línea de factura, eliminar línea de factura
y mostrar factura por consola. Línea de factura habrá que solicitar al usuario los 
campo necesarios (descripción, precio unitario y cantidad de unidades. Para elimninar
una línea solicitaremos nº de línea. Hacer tb programa con un menú para gestionar
una factura (alta, añadir/eliminar líneas, mostrar factura)usar método toString
para líneaFactura
autor: jose luis mosquera losada
fecha: 15-1-2022*/
package JLMLt07;

import java.util.Scanner;

public class JLMLt07e20 {

    static Factura factura;
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.println("Nueva Factura");
        System.out.println("-->Número de Factura:");
        int nF = teclado.nextInt();
        System.out.println("-->Número de cliente:");
        int nC = teclado.nextInt();
        factura = new Factura (nF, nC);
        
        boolean salir=false; char opcion;
        do {
            System.out.println("\n\n ----GESTIÓN FACTURA----");
            System.out.println("a) Mostrar Factura\nb)añadir línea\n"+"c)Eliminar línea\nd)salir");
            opcion=teclado.next().charAt(0);
        
        switch (opcion){
            case 'a':mostrarFactura();     break;
            case 'b':añadirLinea();        break;
            case 'c':eliminarLinea();      break;
            case 'd':salir=true;           break;
            default: System.out.println("Opción inválida");
    }
         
    }       while (!salir);
        
    }      
    private static void mostrarFactura(){
        factura.mostraFactura();
    }
    private static void añadirLinea(){
        teclado.nextLine();
        System.out.println("Introduce descripción de la línea: ");
        String descLinea = teclado.nextLine();
        System.out.println("Introduce precio unitario");
        double preciouno = teclado.nextDouble();
        System.out.println("Introduce cantidad");
        double cantidad = teclado.nextDouble();
        System.out.println("Introduce descuento");
        double descuento = teclado.nextDouble();
        factura.añadirLinea(descLinea, preciouno, cantidad, descuento);
    }
    private static void eliminarLinea(){
    boolean resp;
        System.out.println("Introduce línea (la primera es la 1): ");
        int linea = teclado.nextInt();
        resp=factura.eliminarLinea(linea);
        if(resp) System.out.println("Borrado correcto");
        else System.out.println("No se encuentra la línea");
    }
    
    
    
}
