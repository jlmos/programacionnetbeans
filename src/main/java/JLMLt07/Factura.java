/*Clase Factura con nº de identificador, fecha, nº cliente, % iva de 21%, 
nº indeterminado de lineaFactura (con: descripción,Precio unitario,cantidad de
unidades,% descuento de 5% con + de 10 unidades y el importe total (inicialmente
a cero con actualizaciones)) añadir línea de factura, eliminar línea de factura
y mostrar factura por consola. Línea de factura habrá que solicitar al usuario los 
campo necesarios (descripción, precio unitario y cantidad de unidades. Para elimninar
una línea solicitaremos nº de línea. Hacer tb programa con un menú para gestionar
una factura (alta, añadir/eliminar líneas, mostrar factura)usar método toString
para líneaFactura */
package JLMLt07;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
    private int id;
    private LocalDate fecha;
    private int numCliente;
    private static final double IVA=0.21d;
    private ArrayList <LineaFactura> lineasFactura;
    private double importeTotalFactura;
    
    Factura (int id, int nC){
        this.id=id;
        this.fecha=LocalDate.now();
        this.numCliente=nC;
        lineasFactura=new ArrayList<>();
        this.importeTotalFactura=0;
    }
    public void añadirLinea (String d, double pU, double cU,double pD){
        lineasFactura.add(new LineaFactura (d,pU,cU,pD));
        recalcularTotalFactura();
    }
    public boolean eliminarLinea (int nL){
        int numLinea = nL-1;
        if (numLinea < 0 || numLinea>= lineasFactura.size()) return false;
        lineasFactura.remove(numLinea);
        recalcularTotalFactura();
        return true;
    }
    private void recalcularTotalFactura(){
        this.importeTotalFactura=0;
        for (LineaFactura lf : this.lineasFactura){
            this.importeTotalFactura += lf.getImporteTotalLinea();
     }
        this.importeTotalFactura += this.importeTotalFactura*this.IVA;
    }
    public void mostraFactura(){
        System.out.println("Fecha:"+ this.fecha);
        System.out.println("Num cliente:"+ this.numCliente);
        for (LineaFactura lf : this.lineasFactura){
            System.out.println(lf.toString());
        }
        System.out.println("Total Factura:" + this.importeTotalFactura);
    }

    void añadirLinea(String descLinea, double preciouno, double descuento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
class LineaFactura{
    private String descrip;
    private double precioUnitario;
    private double cantUnidades;
    private double porcDescuento;
    private double importeTotalLinea;

    public LineaFactura(String descrip, double precioUnitario, double cantUnidades, double porcDescuento) {
        this.descrip = descrip;
        this.precioUnitario = precioUnitario;
        this.cantUnidades = cantUnidades;
        this.porcDescuento = porcDescuento;
        this.importeTotalLinea=precioUnitario*cantUnidades*(1-porcDescuento);

    }
    
    public double getImporteTotalLinea(){
        return importeTotalLinea;
    }
    
    @Override
    public String toString(){
        String linea = String.format("%s {%.2f}-->%.2f",descrip, cantUnidades,importeTotalLinea);
        return linea;
    }}}