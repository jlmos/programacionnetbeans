/*Examina la clase producto y contesta a las preguntas
autor: jose luis mosquera losada
fecha: 28-12-2021*/
package JLMLt06;

public class JLMLt06CuestionesProductoA {

    public String nombre;
    public double precio;   // cuantos atributos?: 4 atributos
    public double IVA;
    public double descuento;

    public JLMLt06CuestionesProductoA(String nom, double p, double IVA) { // constructores:1 
        this.nombre = nom;
        this.precio = p;
        this.IVA = IVA;
        this.descuento=0; 
    }
public double calcularPrecioFinal(){ // 2 métodos ++ el método constructor si se considera así
    double prFin=this.precio+(this.precio*this.IVA);
    double prFinDesc=prFin-(prFin*this.descuento);
    return prFinDesc;
}
public void setDescuento(double desc){
    this.descuento=desc;
}
}
