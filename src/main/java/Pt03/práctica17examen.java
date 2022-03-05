/* programa donde se introduzca el nombre, la edad y el salario anual de un equipo
de baloncesto. finalizando con la letra fin o si se introduce a más de 20 jugadores
Señalando si hay alguno menor de edad,el nombre del jugador que tiene el 
salario máximo anual, la media del salario anual
 */
package Pt03;
import java.util.Scanner;
public class práctica17examen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioAnual, salarioMedio, salarioMaximo = 0, sumaSalario = 0;
        int edad, contadorJugadores = 0;
        String nombre, nombreSalarioMax = null;
        boolean menorEdad = false, salir = false;
        System.out.println("Introduce el nombre del jugador (fin para salir):");
        nombre = teclado.nextLine();
        System.out.println("introduce la edad del jugador:");
        edad = teclado.nextInt();
        System.out.println("introduce su salarioAnual:");
        salarioAnual = teclado.nextDouble();
        while (salir != true && edad > 14 && edad < 80) {
            sumaSalario += salarioAnual;
            contadorJugadores++;
            System.out.println("Introduce el nombre del jugador:");
            nombre = teclado.nextLine();
            System.out.println("introduce la edad del jugador:");
            edad = teclado.nextInt();
            System.out.println("introduce su salarioAnual:");
            salarioAnual=teclado.nextDouble();
            if (contadorJugadores > 5) {
                System.out.println("Ya has introducido más de 20 jugadores");
                salir = true;
            } else if (edad < 18) {
                menorEdad = true;
            } else if (salarioAnual > salarioMaximo) {
                salarioMaximo = salarioAnual;
                nombreSalarioMax = nombre;
            } else {
                salir = true;
            } }
        System.out.println("hay un menor:" + menorEdad);
        System.out.println("el nombre del jugador con el salario máximo es: " + nombreSalarioMax);
        System.out.println("el salario medio del equipo es: " + sumaSalario / contadorJugadores);
    } }
/*else if (nombre.equals("fin")) {
                System.out.println("el programa ha finalizado");
                salir = true;*/