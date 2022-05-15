/* */
package JLMLt15;

import java.util.Scanner;

public class JLMLt15e01 {
static JLMLt15.LinkedListParking p;
    static Scanner teclado;
    public static void main(String[] args) {
        p=new JLMLt15.LinkedListParking();
        boolean salir =false; char opcion;
        teclado = new Scanner(System.in);
        do{
            System.out.println("\n\n---GESTIÓN PARKING---");
            System.out.println("a)Mostrar parking\nb)Aparcar\nc)Desaparcar\nd)Plazas Libres\ne)Salir");
            opcion =teclado.next().charAt(0);
            switch (opcion) {
                case 'a': mostrarParking(); break;
                case 'b': aparcar(); break;
                case 'c': desaparcar(); break;
                case 'd': plazasLibres(); break;
                case 'e': salir=true; break;
                default: System.out.println("opción inválida");
            }                
            } while (!salir);
    }
            private static void mostrarParking(){
                String[]arr;
                arr=p.mostrarParking();
                System.out.println("Estado del Parking");
                for (int i=0;i<arr.length;i++)
                    System.out.println((i+1)+"::"+arr[i]);
                
            }
            
            private static void aparcar(){
                System.out.println("Introduce matrícula: ");teclado.nextLine();
                String mat=teclado.nextLine();
                int res = p.Aparcar(mat);
                if(res==-1)System.out.println("Parking lleno");
                else System.out.println("Coche aparcado en plaza "+ res);
            }
            private static void desaparcar(){
                String mat=p.Desaparcar();
                if(mat==null)System.out.println("Parking vacío");
                else System.out.println("coche: "+mat+ " desaparcado");
                
            }
            private static void plazasLibres(){ 
                int q=p.cantidadPlazas();
                System.out.println(q+" plazas libres");
            }
        }