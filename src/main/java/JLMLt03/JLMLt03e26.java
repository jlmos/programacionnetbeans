/* programa que pinten 9 líneas según 4 GRÁFICOS 
autor: jose luis mosquera losada
fecha: 1-11-2021*/
package JLMLt03;

public class JLMLt03e26 {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 8; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        System.out.println("SEGUNDO GRÁFICO:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        System.out.println("TERCER GRÁFICO:");
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print(i);
            }
            System.out.println("");

        }
        System.out.println("CUARTO GRÁFICO:");
        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println("");
    }
}}
/*saber donde inicia (solo una vez), y mientras la variable sea rango continua
con incremento o decremento sino fin */
