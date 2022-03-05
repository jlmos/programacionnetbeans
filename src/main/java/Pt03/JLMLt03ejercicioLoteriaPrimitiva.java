/* loteria primitiva 
autor: jose luis mosquera losada
fecha: 11-01-2022*/
package Pt03;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class JLMLt03ejercicioLoteriaPrimitiva {
 static Scanner teclado;

 public static void main(String[] args) throws NumeroMal {
        int[] jugada = jugar();
        System.out.print("Tu jugada: ");
        imprimir(jugada);
 
        int[] sorteo = sortear();
        System.out.print("\nEl sorteo: ");
        imprimir(sorteo);
 
        System.out.println("\nHas acertado " + comprobar(jugada, sorteo));
    }
    public static final int NUMEROS = 7;
    public static Scanner entrada= new Scanner(System.in);
 
 
    public static int[] jugar() throws NumeroMal {
 
        int[] combinacion = new int[NUMEROS];
        try{
 
             for (int i=1; i<NUMEROS; i++) {
            do {
 
                System.out.print("introduzca un numero(" + i + ") entre el 1 y el 49: ");
 
                combinacion[i] = entrada.nextInt();
            } while ((combinacion[i] < 1) || (combinacion[i] > 49) || contiene(combinacion, combinacion[i], i));
 
            }throw new NumeroMal("no admite otros numeros.");
 
    }catch(NumeroMal nm){
 System.out.println("\n"+nm.getMessage());
} 
catch (Exception e) {
 
                // Captura cualquier otra excepción
 
                System.out.println("Excepción: " + e.toString());
 
            }
        return combinacion;
 
 
    }
 
 
 
    public static boolean contiene(int[] array, int numero, int rellenos) {
        boolean resultado = false;
 
        for (int i=1; i<rellenos;i++) {
            if (numero == array[i]) {
                resultado = true;
            }
        }
 
        return resultado;
    }
 
    public static int[] sortear() {
        int combinacion[] = new int[NUMEROS];
        Random random = new Random();
 
        for (int i=1; i<NUMEROS; i++) {
            do {
                combinacion[i] = random.nextInt(49)+1;
            } while (contiene(combinacion, combinacion[i], i));
        }
 
        return combinacion;
    }
 
    public static int comprobar(int[] combinacion1, int[] combinacion2) {
        int aciertos = 0;
 
        for (int i=1; i<NUMEROS; i++){
            if (contiene(combinacion2, combinacion1[i], NUMEROS)) {
                aciertos++;
            }
        }
 
        return aciertos;
    }
 
    public static void imprimir(int[] combinacion) {
        for (int i=1; i<combinacion.length; i++) {
            System.out.print(combinacion[i] + " ");
        }
    }
 
 
 
}
class NumeroMal extends Exception{
    public NumeroMal(){
        super("Excepcion definida por el usuario:NUMERO INCORRECTO");
 
    }
        public NumeroMal(String msg){
            super("Excepcion definida por el usuario:"+msg);
        }
 
 
   }