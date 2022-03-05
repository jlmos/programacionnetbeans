/*Programa llamado hipotenusa al que se le pasen como parámetros dos valores
verifique que son enteros positivos y que suponiendo que son los catetos de un 
ángulo recto, calcule el valor de la hipotenusa. 
autor: jose luis mosquera losada
fecha: 9-1-2022 */
package JLMLt07;


public class JLMLt07e12 {

    
    public static void main(String[] args) {
        
        double cateto1 = Double.parseDouble(args[0]);
        double cateto2 = Double.parseDouble(args[1]);

        if(cateto1 <= 0 || cateto2 <= 0) throw new IllegalArgumentException("Los catetos deben ser mayores que cero");
        double result = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("Result = " + result);
    }
}