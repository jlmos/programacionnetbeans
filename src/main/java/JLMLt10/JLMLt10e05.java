/*Implementar el juego de ajedrez para dos jugadores, crear una clase abstracta llamada
PiezaAjedrez, con dos atributos enteros llamados fila y columna que representan sus
coordenadas en el tablero (valores entre 0 y 7) y un método abstracto llamdo mover() al
que se le pasan como parámetro la fila y la columna destino de un movimiento erróneo. El método
devolver true si el movimiento se puede realizar o false si es un movimiento erróneo. Implementar
esa clase y sus subclases AlfilAjedres y TorreAjedrez. Pensar en movimientos de un tablero vacío, solo
con una pieza, la que se está moviendo.
a) programa que permita al usuario mover una sola pieza (elegir entre alfin o torre) por el tablero
partiendo de la posición 0,0, indicando las coordenadas destino del movimiento que quiere hacer cada
vez, teminando el programa cuando introduzca -1.
b) el programa tendrá una función que presente por pantalla la situación del tablero.
autor: jose luis mosquera losada
fecha: 8-02-2022 */
package JLMLt10;

import java.util.Arrays;
import java.util.Scanner;

public class JLMLt10e05 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         PiezaAjedrez piezaAjedrez = null;
         
         System.out.println("Qué tipo de figura quieres utilizar?");
            System.out.println(" 1. Torre");
            System.out.println(" 2. Alfil");
            System.out.print("Introduce tu elección: (1 ó 2)");
            int eleccionFigura = scanner.nextInt();
            if(eleccionFigura == 1) {
                piezaAjedrez = new TorreAjedrez();
            } else if(eleccionFigura == 2) {
                piezaAjedrez = new AlfilAjedrez();
            }
             
         while(true) {
             
             System.out.println("Hacia dónde te quieres mover?");
             System.out.print("Fila: ");
             int eleccionFila = scanner.nextInt();
             System.out.print("Columna: ");
             int eleccionColumna = scanner.nextInt();
             boolean movimiento = piezaAjedrez.mover(eleccionFila, eleccionColumna);
             imprimirTablero(piezaAjedrez);
             
             System.out.printf("El movimiento es %s\n", (movimiento? "correcto" : "incorrecto") );
             System.out.println("Continuar jugando? (0 para continuar, -1 para detener)");
             int eleccionSeguir = scanner.nextInt();
             if(eleccionSeguir == -1) return;
             System.out.println("---------------------------------------------");
            }
    }
    
    public static void imprimirTablero(PiezaAjedrez piezaAjedrez) {
        String[][] tablero = new String[8][8];
        tablero[piezaAjedrez.getFila()][piezaAjedrez.getColumna()] = piezaAjedrez.toString();
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++){
                String pieza;
                if(tablero[i][j] == null) {
                    pieza = " ";
                } else {
                    pieza = tablero[i][j].toString();
                }
                System.out.printf("| %s ", pieza);
            }
            System.out.println("|\n---------------------------------");
        }
    }
    
}
