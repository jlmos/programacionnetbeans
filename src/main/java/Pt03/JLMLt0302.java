
package Pt03;
import java.util.Scanner; 
public class JLMLt0302 {
    public static void main(String[] args) {
   float num=0, total=0;    
   Scanner teclado=new Scanner (System.in);
    while (num!=-1){
       total=total + num;
       System.out.println("Introduce otro número (-1 par finalizar:");
       num=teclado.nextFloat();
       if (num !=-1) total=total +num;
    }
        System.out.println("Total: "+ total);
    }
    
}
