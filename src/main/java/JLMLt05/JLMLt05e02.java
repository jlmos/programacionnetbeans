/*Realizar la función llamada cantidadDivisores() que le pasa un nº entero
y nos devuelva el nº de divisores o bien cero si el nº es negativo. Usar un main.
autor: jose luis mosquera losada
fecha: 16-11-2021 */
package JLMLt05;

import java.util.Scanner;

public class JLMLt05e02 {
    static int numero, cantidadDivisores;
static  Scanner teclado = new Scanner (System.in);

    public static void main(String[] args) {
boolean salir = false;
int opcion, radio = 0, lado = 0, base = 0, altura = 0;
int areaC, areaCu, areaT;
do {
opcion = MENU();
switch(opcion){
case 1: areaC = areaCirculo(radio);System.out.println(areaC); break;
case 2: areaCu = areaCuadrado(lado);System.out.println(areaCu); break;
case 3: areaT = areaTriangulo(base, altura);System.out.println(areaT); break;
case 4: salir = true; break;
default: System.out.println("Opción incorrecta.");
}
}while (!salir);
        System.out.println("Ha abandonado el programa.");

}//fin main

static int MENU(){
    
System.out.println("\n");
System.out.println("Elija una opción: ");
System.out.println("1 Calcular el área de un círculo.");
System.out.println("2 Calcular el área de un cuadrado.");
System.out.println("3 Calcular el área de un triángulo.");
System.out.println("4 Salir");
System.out.print("Opción: ");
return Integer.parseInt(teclado.nextLine());
}
static int areaCirculo(int radio){
System.out.print("Introduce su radio: ");
radio = Integer.parseInt(teclado.nextLine());
    System.out.print("El area del circulo con el radio = "+radio+" es: ");

int area = (int) (Math.PI * Math.pow(radio, 2));
return area;
}
static int areaCuadrado(int l){
System.out.print("introduce su lado: ");
l = Integer.parseInt(teclado.nextLine());
    System.out.print("el área del cuadrado con el lado "+l+" es: ");
int r = l * l;
return r;
}
static int areaTriangulo(int b, int a){
System.out.print("Introduce su base: ");
b = Integer.parseInt(teclado.nextLine());
System.out.print("Introduce su altura: ");
a = Integer.parseInt(teclado.nextLine());
System.out.print("El área del triangulo con la base = "+b+ " y la altura = "+ a+" es: ");
int x = b * a;
return x;
}
}
