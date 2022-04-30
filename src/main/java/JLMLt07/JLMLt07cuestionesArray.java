/* Ejecutar porciones de código, con Arrays, y responder a las cuestiones desde la hasta a la f 
autor: jose luis mosquera losada
fecha: 11-1-2022*/

package JLMLt07;

import java.util.Arrays;

public class JLMLt07cuestionesArray {
    
    // En lugar de comprobar si los elementos del array son pares o impares, se estaba evaluando la variable x, que es el índice del bucle for. Hay que reemplazar x por a[x]
    public static void mainA(String[] args) {
        int [] a = new int[] {1, 2, 3, 4, 5};
        int p=0, i=0;
        for(int x=0; x< a.length; x++)
            if(a[x]%2 == 0){
                p+=a[x];
            } else {
                i+=a[x];
            }
        System.out.printf("%d-%d\n", p, i);
    }
    
    /*
    Apartado B
    a) Para crear un array, la sintaxis es "new [tipo]" y aparece "new [nombre]"
    b) El indicador de la capacidad del array aparece en la declaración de la variable en lugar de en la inicialización
    c) La capacidad del array es redundante porque se declara el contenido
    d) Está bien
    e) Está bien
    */
    
    /*
    Apartado C
    */
    public static void mainC(String[] args) {
        int [] arr = new int[] {1, 2, 3, 4, 5}; // El indicador de capacidad es redundante
        for(int i=0; i< arr.length-1; i+=1) // Length no es un método, por lo tanto no lleva paréntesis. En el incremento, i=+1 debería ser i+=1
                arr[i] = arr[i+1]; // Esta sentencia da error cuando se llega al último elemento del array, porque al buscar el siguiente no existe. Limitando el alcance del for se soluciona
        System.out.println(Arrays.toString(arr));
    }
    
    /*
    Apartado D
    Aparentemente no hay errores. Lo que hace la función "fun" es, a partir de un array que se le pasa como parámetro,
    devolver otro array con el doble de longitud e intercalando números entre los valores del array original siendo estos el anterior + 10
    */
    public static void mainD(String[] args) {
        int [] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(fun(arr)));
    }
    
    static int[] fun (int[] x) {
       int [] y = new int[x.length*2];
       int cont = 0;
       for (int z: x) {
           y[cont++] = z;
           y[cont++] = z+10;
       }
       return y;
    }
    
    /*
    Apartado E
        java ej abc abc abc -> args contendría tres elementos, por lo tanto en el primer if saldría que es falso
        java ej abc abc -> No entraría en el if por ser dos argumentos. Tampocco entraría en el else if por ser dos argumentos iguales. El resultado sería true
        java ej ABc abc ->No entraría en el primer if por ser dos argumentos. Entraría en el else if por ser distintos los dos elementos y por lo tanto el resultado sería false
    */
    
    /*
    Apartado f
        
    */
   public static void mainF(String[] args) {

    boolean result=true;
            if (args.length !=2)result=false;
            else if (!args[0].equals(args[1]))result=false;
            else{
    int up=0,low=0;
    for(int i=0;i<args[0].length();i++){
        if(Character.isUpperCase(args[0].charAt(i)))up++;
        else if (Character.isLowerCase(args[0].charAt(i)))low++;
    }
    if(low <=1 || up<=1) result = false;
} 
            System.out.println(result);
   }}
            
    

    
    
