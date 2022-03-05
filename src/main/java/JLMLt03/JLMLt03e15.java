/* Sin ejecutar explicar que hace el programa.
autor: jose luis mosquera losada
fecha: 31-10-2021 */
package JLMLt03;
 
public class JLMLt03e15 {
    public static void main(String[] args) {
           int hora=0;
           for (int i=1; i<=7*24;i++) { /* inicia en 1, el rango es que i sea menor
                                        o igual a 168 que son las horas que tiene
                                        una semana y el incremento es 
                                        de uno en uno*/
            System.out.println ( hora);
           if (++hora >23) hora=0;
    }
    // me saca todas las horas, en punto, que hay en una semana
    }
}
// no conté que inicia en cero por el valor incial y por que las 12:00 pm son las
// 00:00 