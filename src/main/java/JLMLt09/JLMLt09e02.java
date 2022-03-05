/*a)Realizar un programa que permita al usuario seleccionar un tipo de figura (triángulo o rectángulo),
luego llame al constructor adecuado solicitando al usuario los parámetros necesarios, dependiendo del
tipo de figura. b)Después crear la figura, mostrará las dimensiones de la misma (sea cual sea su tipo)
c) finalmente y utilizando el operador instanceof, mostrará unos datos adicionales dependiendo del tipo de
figura que sea: si es del tipo de Triangulo mostrará el área y si es de Rectangulo mostrará si es cuadrado o no.
Usar una única variable para almacenar la figura, sea del tipo que sea.
autor: jose luis mosquera losada
fecha: 26-01-2022 */
package JLMLt09;

import JLMLt08.Figura2D_v8;
import JLMLt08.Rectangulo_v8;
import JLMLt08.Triangulo_v8;
import java.util.Scanner;


public class JLMLt09e02 {

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Figura2D_v8 figura2D_v8;

        System.out.println("Selecciona el tipo de figura.");
        System.out.print("Triángulo (1) o rectángulo (2)?: ");
        int eleccion = scanner.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Creando triángulo...");
                System.out.print("Introduce estilo: ");
                String estilo = scanner.next();
                System.out.print("Introduce alto: ");
                int alto = scanner.nextInt();
                System.out.print("Introduce ancho: ");
                int ancho = scanner.nextInt();
                System.out.print("Introduce nombre: ");
                String nombre = scanner.next();
                figura2D_v8 = new Triangulo_v8(estilo, alto, ancho, nombre);
                break;
            case 2:
                System.out.println("Creando rectángulo...");
                System.out.print("Introduce alto: ");
                int alto2 = scanner.nextInt();
                System.out.print("Introduce ancho: ");
                int ancho2 = scanner.nextInt();
                System.out.print("Introduce nombre: ");
                String nombre2 = scanner.next();
                figura2D_v8 = new Rectangulo_v8(alto2, ancho2, nombre2);
                break;
            default:
                System.out.println("Opción incorrecta.");
                return;
        }

        System.out.println("--------------------------");
        System.out.println("Clase: " + figura2D_v8.getClass().getSimpleName());
        figura2D_v8.verDim();
        if(figura2D_v8 instanceof Triangulo_v8) System.out.println("Área: " + ((Triangulo_v8)figura2D_v8).area());
        if(figura2D_v8 instanceof Rectangulo_v8) System.out.println("Es cuadrado?: " + ((Rectangulo_v8)figura2D_v8).esCuadrado());



    }
}
