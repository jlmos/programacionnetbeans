/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLMLt13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ESTUDIOS
 */
public class JLMLt13e06 {

    
    public static void main(String[] args) {
        int entero = leerEntero(1, 10);
        System.out.println("El numero esta en rango: " + entero);
    }

    public static int leerEntero(int min, int max) {
        System.out.print("Introduce un número: ");
        Scanner teclado = new Scanner(System.in);
        int entero = 0;
        try {
            entero = teclado.nextInt();
            if(entero < min || entero > max) {
                throw new IllegalArgumentException("Número introducido fuera de rango");
            }
            return entero;
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage() + ". Vuelve a intentarlo.");
            return leerEntero(min, max);
        } catch (InputMismatchException ime) {
            System.out.println("Caracter introducido no es un entero. Vuelve a intentarlo");
            return leerEntero(min, max);
        }
    }
}
