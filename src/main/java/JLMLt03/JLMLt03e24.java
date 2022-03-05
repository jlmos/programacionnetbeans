/* Introducir sexo, edad de 30 entre 16 y 70. Mostrar la edady sexo del más joven
y media de edad de las mujeres, también si haya alguno de + de 70. fin con cero.
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;

import java.util.Scanner;
public class JLMLt03e24 {
    public static void main(String[] args)  {

        Scanner teclado = new Scanner(System.in);
       
                int edadMasJoven = 99;
	        char sexoMasJoven = '?';
	
	        // Datos para calcular media edad mujeres
	        int cantidadMujeres = 0;
	        int sumaEdadMujeres = 0;
	
	        // Contador personas mayores de 60
	        int personasMayores60 = 0;
	
	        for (int i=1; i<=30; i++) {
	
	            // Lectura edad
	            System.out.println("Empleado nº"+i);
	            System.out.print("Introduce edad (16-70): ");
	            int edad = teclado.nextInt();
	
	            // Validación edad
	            if (edad == 0) {
	                System.out.println("Se ha cancelado la ejecucion");
	                break;
	            } else if (edad < 16 || edad > 70) {
	                System.out.println("Edad no válida. Debe estar entre 16-70");
	                i--;
	                continue;
	            }
	
	            // Lectura sexo
	            System.out.print("Introduce sexo (H/M): ");
	            char sexo = teclado.next().charAt(0);
	            System.out.println("");
	
	            // Validación sexo
	             if(sexo != 'H' && sexo != 'M') {
	                System.out.println("Sexo no válido. Debe ser H o M");
	                i--;
	                continue;
	            }
	
	            // Comprobar si el usuario introducido es el más joven hasta el momento
	            if (edad < edadMasJoven) {
	                edadMasJoven = edad;
	                sexoMasJoven = sexo;
	            }
	
	            // Si es mujer, guardar los datos necesarios para luego hacer la media
	            if (sexo == 'M') {
	                cantidadMujeres++;
	                sumaEdadMujeres += edad;
	            }
	
	            // Si es mayor de 60 años, incrementar el contador de personas mayores de 60
	            if (edad > 60) {
	                personasMayores60++;
	            }
	            
	        }
	
	        // Resumen
	        System.out.println("--------------------------------------------------");
	        System.out.println("Persona más joven: sexo -> " + sexoMasJoven + " | edad -> " + edadMasJoven);
	        System.out.println("Media edad mujeres: " + (sumaEdadMujeres / cantidadMujeres));
	        System.out.println("Cantidad personas >60: " + personasMayores60);
                
    }
}
                
            
            
    




