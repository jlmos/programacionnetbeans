
package Pt03;
  import java.util.Scanner;

public class JLMLt0304 {
    
    public static void main(String[] args) {
    Scanner teclado =new Scanner(System.in);
        
        int i,suma=0;
        System.out.print("introduce un nº: ");
        i = teclado.nextInt();
         while (i != -1){
            suma += i; 
       
            System.out.print("introduce un nº: ");
            i = teclado.nextInt();
     }
        System.out.println("la suma: " + suma);   
    }
    
}
