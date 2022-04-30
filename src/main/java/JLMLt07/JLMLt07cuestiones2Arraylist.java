/* Ejecutar porciones de código, con ArrayList, y responder a las cuestiones desde la a hasta la j 
autor: jose luis mosquera losada
fecha: 19-1-2022
*/

package JLMLt07;

import java.util.ArrayList;
import java.util.Collections;

public class JLMLt07cuestiones2Arraylist {

//  a)El contenido sería 2 elveado a uno ( que sería 2) hasta 2 elevado diez (1024).
    public static void main(String[] args) {

        /*   ArrayList <Long> a=new ArrayList<>();
    for (int i=0;i<=9;i++)
    a.add((long)Math.pow(2,i+1)); //hacemos un casting con long para que los datos sean conpatibles.
            System.out.println(a);
        
// b) El programa daría un error porque 999 es un dato incompatible habría que ponerle la "l" de long

     for(int i=0;i<a.size();i+=2) // lo que tengo dentro va de dos en dos.
         a.set(i,999l);// con set le pasa una posición y un valor y no desplaza sino que los sustituye con 999.
            System.out.println(a);
}}
 

//c) 'a' es un ArrayList de enteros
    
ArrayList <Integer> a = new ArrayList <>();
int lon=(int) (Math.random()*6)+5;// nº aleatorio multiplicado por 6 con valor entre 0 y 5 y si le suma entre 5 y 10 va a ser un nº aleatorio entre 5 y 10.
for (int i=0;i<lon;i++)
a.add((int)(Math.random()*100)+1);
            System.out.println(a);// los nºs saldrían desordenados si los mostraramos por pantalla.
Collections.sort(a);
for (int i=0; i<a.size();i++) // me saca los nºs ordenados ascendentemente
System.out.println(a.get(i));// los ejemplos podrían ser: 7,7,7,7 cogidos entre 0 y 100 podrían ser 1,1,100,100,33
}}                           // otro ejemplo sería: 3,7,14,20,21,25,44

   
 //d) crea un ArrayList de enteros
            
        ArrayList <Integer> a = new ArrayList <>();
int n=0;
for (int i=0;i<6;i++) { //for de 6 nºs aleatorios entre 1 y 49, genera el nº mientras ese ArrayList contenga ese nº.
do { n = (int)(Math.random()*49)+1;// tendremos un ArrayList de 6 posiciones cad uno con un valor entre 1 y 49
} while (a.contains(n));// contiene el nº en una variable (n) que está fuera
a.add(n);// estará dándole vueltas al do hasta que genere 6 nºs sin repetir, no se embucla xq saca 6 de 49.
}
Collections.sort(a);// ordena los nºs ascendentemente
for (int i=0; i<a.size();i++)                                                                                 // 3,5,11,18,27,36.
System.out.println(a.get(i)); //muestra los nºs por pantalla. Los ejemplos serían nºs de la primitiva ordenados: 9,15,19.26,27,46.
  
 //e)                  
            
    for (int i=0;i<a.size();i++) { // recorre todas las posiciones
a.set(i,a.get(i)+1);// para cada posición le asigno, sin desplazar, la suma de +1 a todos con los 6 que tocan. 
        System.out.println(a);
 // 1ero me saca los 6 nºs ascendetemente en vertical, despues 6 veces en horizontal me va sacando los 6 nºs, y en cada línea sale 
    }}} // va añadiendo +1 al nº de la posición correspondiente, es decir 1era fila vertical le suma 1 al 1er nº, 2da le suma 1 al 2do nº, así hasta llegar a las 6 filas donde todos los nºs que han tocado salen sumados con +1.
   
 
 //f) Me da error con llenarArrayList me dice que no puede encontrar este símbolo y no puedo sacar nada por consola.
 // incluso con el private static void llenarArrayList....
            
    ArrayList <Integer> a = new ArrayList <>();
llenarArrayList (a); //llena el arrayList con valores positivos y negativos
for (int i=0;i<a.size();i++) { //recorre el ArrayList
if (a.get(i)>30) a.set(i,30);// vuelve a recorrer el ArrayList si lo que recorres es >30 cambia el valor pasándolo a 30
else a.set(i,Math.abs(a.get(i)));// si es menor le haya el valor absoluto, si es un -40, xejemplo, entra x el else y lo pasa a positivo (a 40)
System.out.println(a);
}}

    private static void llenarArrayList(ArrayList<Integer> a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    
   //g) hacemos un ArrayList de enteros
    
ArrayList <Integer> a = new ArrayList <>();
for (int i=0;i<10000;i++) { // usamos un for que genera y añade nºs entre 1 y 1000, 10.000 veces desde uno hasta 10.000.
a.add((int)(Math.random()*1000)+1);
    System.out.println(a);
}
for (int i=0; i<a.size();i++)
if (a.get(i)>= 250 & a.get(i) <= 750) a.remove(i);
            System.out.println(a);}
        }// después de haber metido 10.000 veces nºs entre 1 y 10.000 ahora recorre esos 10.000 y si el nº está comprendido
         // entre >= 250 y <=750 cárgatelos, sino déjalos. Lo curioso es que no me carga el 250 ni el 750 y le estoy diciendo
         // que si es igual a 250 ó 750 que lo haga.
           
   //h)
            
Integer [] arr = {10, 3, 7, 2, 9, 5}; //no fuciona con int
//. . . . . . . . .  falta la línea que construye un Array en un Arraylist, tendríamos que hacerlo en cun construtor

List<Integer> lista = Arrays.asList (arr); // Métodos llamados de factoría, que son excepciones.NO hace falta llamar al new porque lo hace él.
Collections.sort(lista);
arr = lista.toArray(new Integer[lista.size()]);;
System.out.println (Arrays.toString(arr)); 
        }} //Mientras el eliminar x == true no hagas nada pero le largas, hasta que remove devuelva false borra la x.
            
/*
// i) Es una función de un programa, donde se pasa como un parámetro un ArrayList como una cadena
// En principio hace un recorrido y debería eliminar todas las 'x'
            
static void fun (ArrayList <String> a, String x) {while (a.remove(x)){}}
 
            
// el método a.remove se va a ejecutar dentro, en este caso no hace nada pero lo hace en la condición
//
}*/
//j
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            x.add((int) (Math.random() * 100));// for con 5 posiciones entre 0 y 99
        }
        Collections.sort(x); //ordena los números.
                System.out.println(x);
        fun(x, 20);
        fun(x, 200);
        fun(x, -1); //llama a la función fun pasándole un ArrayList con unos determinados nºs 20,200
    }

    static void fun(ArrayList<Integer> a, int n) {//ArrayList de enteros, están bien llamados.
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > n) {
                a.add(i, n);
                return;
            }
        } // se recorre todo el ArrayList que le pasan como parámetro. Si lo que le pasan en esa posición es mayor que el nº que le pasamos en ese parámetro le añade el nº 
        a.add(n);// add no machaca hace el hueco. Por ejemplo si hay dos nºs 17 y 36 se insertaría el 20 entre esos nºs 17 20 36.
        System.out.println(a);
        // si el 200 no es mayor que ninguno lo mete al final y si el 20 no es mayor que ninguno lo mete al principio después del -1 si el negativo es mayor que 20, sino va el -1 primero.
    }
}
