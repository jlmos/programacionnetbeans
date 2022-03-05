/*Modificar la clase PiezaAjedrez (versión _v2) par incluir métodos estáticos? para que 
el usuario introduzca la columna como letra(a-h) y la fila (entre 1-8) y los convierta en
valores usados previamente (entre 0 y 7). Obligando a generar una nueva versión del programa 
anterior, para que el usuario introduzca a-h y 1-8 como valores destino del movimiento.
autor: jose luis mosquera losada
fecha: 10-02-2022 */
package JLMLt10;
import java.util.Arrays;
import java.util.Scanner;

public class JLMLt10e06 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         PiezaAjedrez_v2 piezaAjedrez = null;

         System.out.println("Qué tipo de figura quieres utilizar?");
            System.out.println(" 1. Torre");
            System.out.println(" 2. Alfil");
            System.out.print("Introduce tu elección: (1 ó 2)");
            int eleccionFigura = scanner.nextInt();
            if(eleccionFigura == 1) {
                piezaAjedrez = new TorreAjedrez_v2();
            } else if(eleccionFigura == 2) {
                piezaAjedrez = new AlfilAjedrez_v2();
            }

         while(true) {


             System.out.println("Hacia dónde te quieres mover?");
             System.out.print("Fila: (1-8)");
             int eleccionFila = scanner.nextInt();
             System.out.print("Columna: (a-h)");
             char eleccionColumna = Character.toLowerCase(scanner.next().charAt(0));
             boolean movimiento = piezaAjedrez.moverV2(eleccionFila, eleccionColumna);
             imprimirTablero(piezaAjedrez);

             System.out.printf("El movimiento es %s\n", (movimiento? "correcto" : "incorrecto") );
             System.out.println("Continuar jugando? (0 para continuar, -1 para detener)");
             int eleccionSeguir = scanner.nextInt();
             if(eleccionSeguir == -1) return;
             System.out.println("---------------------------------------------");

         }
    }

    public static void imprimirTablero(PiezaAjedrez_v2 piezaAjedrez) {
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
