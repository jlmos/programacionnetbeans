/* practica billetes
 */
package Pt03;
public class prácticaarray {
   public static void main(String[] args) {
     int []edad={18,22,20,21,24};
     float media=0;
     for (int i=0;i<edad.length;i++)
         media+=edad[i];
     media=media/edad.length;
       System.out.println("La edad media es: " + media);
         
         }   
}
