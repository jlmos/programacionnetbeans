/* idem que el 6.03 pero creando dos cuentas con una opción de menú nueva para 
pasar de una cuenta a otra y con una variable llamada cuentaActiva que unas veces
apuntará a una cuenta y otras veces a la otra.
autor: jose luis mosquera losada
fecha: 11-01-2022*/
package Pt03;
import java.util.Scanner;

public class JLMLt03ejercicio604 {
 static Scanner teclado;
    public static void main(String[] args) {

teclado = new Scanner(System.in);
float pass, pass2;

BCuentaCorriente cuenta1 = new BCuentaCorriente("ES45 1111 2222 3333 4444");
cuenta1.setComision(0.10f, 1f);
BCuentaCorriente Cuenta2 = new BCuentaCorriente("ES45 0000 1111 2222 3333");
System.out.print("Porcentaje de Comisión Cuenta2: ");
pass=Float.parseFloat(teclado.nextLine());
System.out.print("Comisión mínima Cuenta2: ");
pass2=Float.parseFloat(teclado.nextLine());
Cuenta2.setComision(pass, pass2);
BCuentaCorriente CuentaActiva=cuenta1; 
System.out.println("Porcentaje: "+ CuentaActiva.getPorcentajeComision()+" / Comision mínima: "+ CuentaActiva.getMinimoComision());
System.out.println("Porcentaje: "+ cuenta1.getPorcentajeComision()+" / Comision mínima: "+ cuenta1.getMinimoComision());
System.out.println(CuentaActiva);
System.out.println(cuenta1);
System.out.println(Cuenta2);
System.out.println(cuenta1.getPorcentajeComision());
System.out.println(Cuenta2.getPorcentajeComision());
System.out.println(CuentaActiva.getPorcentajeComision());
cuenta1.ingresar(20f);
Cuenta2.ingresar(30f);
CuentaActiva.ingresar(0.10f);
System.out.println("Cuenta Uno: "+cuenta1.getSaldo()+"\n"+"Cuenta Dos: "+Cuenta2.getSaldo()+"\n"+"Cuenta Activa: "+CuentaActiva.getSaldo());
}

}