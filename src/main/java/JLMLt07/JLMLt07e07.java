/*Con una estructura pila LIFO Last Input, First Output crear
una clase Parking2 que gestione los coches aparcados almacenando la matrícula
y la hor de entrada en el parking, cada minuto cuesta 2 centimos(máx 10 euros)
con los métodos: Estado parking (matrículas y hora de entrada, Aparcar, Desaparcar
(calculando el importe) y mostrar lo recaudado 
autor: jose luis mosquera losada
fecha: 11-1-2022*/
package JLMLt07;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JLMLt07e07 {
    static Parking2 p;
    static Scanner teclado;
    public static void main(String[] args) {
        p=new Parking2();
        boolean salir =false; char opcion;
        teclado = new Scanner(System.in);
        do{
            System.out.println("\n\n---GESTIÓN PARKING---");
            System.out.println("a)Mostrar parking\nb)Aparcar\nc)Desaparcar\nd)Total Recaudado\ne)Salir");
            opcion =teclado.next().charAt(0);
            switch (opcion) {
                case 'a': mostrarParking(); break;
                case 'b': aparcar(); break;
                case 'c': desaparcar(); break;
                case 'd': totalRecaudado(); break;
                case 'e': salir=true; break;
                default: System.out.println("opción inválida");
            }                
            } while (!salir);
    }
            private static void mostrarParking(){
                DateTimeFormatter formato=DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss");
                Coche[]arr;
                arr=p.mostrarParking();
                System.out.println("Estado del Parking");
                for (int i=0;i<arr.length;i++)
                    System.out.println((i+1)+"::"+arr[i].matricula+"::"+ formato.format(arr[i].horallegada));
            }
            
            private static void aparcar(){
                System.out.println("Introduce matrícula: ");teclado.nextLine();
                String mat=teclado.nextLine();
                int res = p.aparcar(mat);
                if(res==-1)System.out.println("Parking lleno");
                else System.out.println("Coche aparcado en plaza "+ res);
            }
            private static void desaparcar(){
                Coche coche=p.desaparcar();
                if(coche==null)System.out.println("Parking vacío");
                else System.out.println("Coche: "+coche.matricula+ " desaparcado"+
                        coche.importePagar+"Euros");
                
            }
            private static void totalRecaudado(){ 
                System.out.printf("%2f euros recaudado%n",p.totalRecaudado());
            }
        }
        
    
    

