/* Introducir las notas de los exámenes de una clase con decimales, -1 para salir
mostrar el nº de notas introducidas, calcular la nota mínima, máxima, la media,
si hay algún 5.0 exacto y el porcentaje de aprobados. Validar que estén entre 0 y 10. 
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean parar = false;
        boolean hayCincos = false;
        double notaMin = 11, notaMax = -1, notaAcumulada = 0, numNotas = 0, numAprobados = 0;
        int notasTotales = 0;

        while (parar != true) {
            // Inserción de datos
            System.out.print("Introduce la nota (-1 para finalizar):");
            double nota = teclado.nextDouble();
            // Validación
            if (nota >= 0 && nota <= 11) {
                notasTotales = notasTotales += 1;
            }
            if (nota > 10) {
                notasTotales = notasTotales -= 1;
                // para evitar que sume una nota > que 11 tengo que restarla.
                // solo funciona con 11, + de 11 no funciona.
            }   
            if (nota >= 0 && nota <= 10) {
                if (nota == 5) {
                    hayCincos = true;
                }
                if (nota > notaMax) {
                    notaMax = nota;
                }
                if (nota < notaMin) {
                    notaMin = nota;
                }
                if (nota >= 5) {
                    numAprobados++;
                }
                notaAcumulada = notaAcumulada + nota;
                numNotas += 1;
            } else if (nota == -1) {
                parar = true;
            } else {
                System.out.println("La nota introducida no es válida");

            }
        }

        if (hayCincos) {
            System.out.println("Hay cincos exactos.");
        }
        System.out.println("La nota máxima es: " + notaMax);
        System.out.println("La nota mínima es: " + notaMin);
        double notaMedia = (notaAcumulada / numNotas);
        notaMedia = (Math.round(notaMedia * 100)) / 100d;
        System.out.println("La nota media es: " + notaMedia);
        double notaPorcentaje = ((numAprobados / numNotas) * 100);
        notaPorcentaje = (Math.round(notaPorcentaje * 100)) / 100d;
        System.out.println("El porcentaje de aprobados es:" + notaPorcentaje + "%");
        System.out.println("El total de notas introducidas son:" + notasTotales);
    }
}


/*ojo en el else if el operador = es distinto a ==.
para incrementar 3 formas num=num+1, num++, num+=1, pero no num=num+1*/
