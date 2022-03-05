/* Leer tres números enteros y mostrar el producto, la suma 
   y multiplicación condicionada. a la cuestión 
   si hay alguna combinación no contemplada, creo que es "hay alguno positivo, 
   pero no todos" lo resolveríamos igual que con el de hay alguno negativo, 
   pero no todos" donde el resultado coincidiría en ambos casos.
   autor: jose luis mosquera losada
   fecha: 17-10-21*/
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e02 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
   int  numEntero1, numEntero2, numEntero3,operando;
      
         System.out.print("Introduce el primer número entero: ");
         numEntero1 = teclado.nextInt();
         System.out.print("Introduce el segundo número entero: ");
         numEntero2 = teclado.nextInt();
         System.out.print("Introduce el tercer número entero: ");
         numEntero3 = teclado.nextInt();
     
          if (numEntero1<0 && numEntero2<0 && numEntero3<0)
           {operando= (numEntero1*numEntero2*numEntero3);
              System.out.println("Todos son negativos el producto es: "+ operando);
           }
          if (numEntero1>0 && numEntero2>0 && numEntero3>0) 
          {operando= ((numEntero1+numEntero2)*numEntero3);
               System.out.println("Todos son positivos el resultado, de la + y * es "+ operando);
          }
           if (numEntero1<0 && numEntero2<0 && numEntero3<0)   
          { 
                  }
           else  
               if (numEntero1<0 || numEntero2<0 || numEntero3<0)
              {operando=(numEntero1+numEntero2+numEntero3);
           System.out.println("Hay alguno negativo, pero no todos, la suma es: " + operando);
          }
           if (numEntero1>0 && numEntero2>0 && numEntero3>0)   
          { 
                  }
           else  
               if (numEntero1>0 || numEntero2>0 || numEntero3>0)
              {operando=(numEntero1+numEntero2+numEntero3);
           System.out.println("Hay alguno positivo, pero no todos, la suma es: " + operando);
           }
     }
 
 }
          
     


