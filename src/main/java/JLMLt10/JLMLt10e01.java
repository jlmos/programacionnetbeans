/* Copia la última versión de las clases de los primeros ejercicios: Figura2D, Triangulo, TrianColor y Rectangulo
(añade sufijo_v9) y realiza los siguientes cambios:
1) crea un método abastacto llamdo area() en Figura2D que ha de implementarse en las clases hijas.
2) crea un método precio (float precioMetroCuadrado) en la clase Figura2D, que use el método abstrácto anterior.
3) verificar que las clases hijas implementan el método área(). ¿Qué ocurriría si no lo tuviesen implemntado?
4) Haz un programa que almacene figuras de los tres tipos en un ArrayList y finalmente se recorra el ArrayList con 
 un for-each mostrando el precio de cada figura, suponiendo un precio de 10 euros el metro cuadrado.
autor: jose luis mosquera losada
fecha: 7-02-2022 */
package JLMLt10;

import java.util.ArrayList;


public class JLMLt10e01 {

        public static void main(String[] args) {
       
        // Apartado tercero:
        // Si las clases hijas no tuviesen implementado el método area() daría un error de compilación,
        // porque los métodos abstractos es obligatorio instanciarlos en las clases hijas a no ser que sean abstractas.
        
        ArrayList<Figura2D_v9> arrayList = new ArrayList<>();
        arrayList.add(new Triangulo_v9(10, "Triangulo"));
        arrayList.add(new TrianColor_v9(10, 10, "Isósceles", "Rojo", "TrianColor"));
        
        for (Figura2D_v9 figura2D : arrayList) {
            System.out.printf("Nombre: %s | precio: %f", figura2D.getNombre(), figura2D.precio(10f));
        }
    }
    
}
