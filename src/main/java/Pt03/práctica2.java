/* practica billetes
 */
package Pt03;
public class práctica2 {
   public static void main(String[] args) {
       
       float importe = 1000;
if (importe < 1000) System.out.println ("NO HAY DESCUENTO");
else if (importe < 3000) // (importe<3000 y importe>=1000)
System.out.println ("DESCUENTO: 3%: " + importe * 0.03);
else if (importe < 5000) // (importe<5000 y importe>=3000)
System.out.println ("DESCUENTO: 5%: " + importe * 0.05);
else // (importe >= 5000)
System.out.println ("DESCUENTO: 7%: " + importe * 0.07f);
       
       
    }       
}
    

