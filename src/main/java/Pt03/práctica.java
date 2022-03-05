/* practica billetes
 */
package Pt03;
public class práctica {
   public static void main(String[] args) {
       int billete2o, billete5; long importe, importeRestante;
       importe=147;
       billete2o= (int)importe/20;
       importeRestante=importe%20;
       billete5=(int) importeRestante/5;
       importeRestante=importeRestante%5;
       
       System.out.println(+ billete2o +" billetes de 20.");
       System.out.println(+ billete5+ " billetes de 5.");
       System.out.println(+importeRestante+ " monedas.");
       
    }
    
}
