/* ArrayList con AlturaAlumnos manteniendo una lista con las alturas de los alumnos,
con valores positivos entre 0,50 y 2,50 redondeados a dos decimales. Con las 
siguientes funciones a traves de un menú: Añadir altura, mostrar lista actual con,
número de posición, eliminar posición, eliminar por valor, ordenar lista y vaciar lista.
autor: jose luis mosquera losada
fecha: 28-12-2021  */
package JLMLt07;

import java.util.ArrayList;
import java.util.Scanner;

public class JLMLt07e15 {
    static Scanner teclado;
    static AlturaAlumnos alturaAlumnos;
    public static void main(String[] args) {
        teclado=new Scanner(System.in);
        alturaAlumnos=new AlturaAlumnos();
        char resp; boolean salir=false;
        do {resp=pintarMenu();
        switch (resp){
            case '1':añadirAltura();break;
            case '2':mostrar();break;
            case '3':eliminarPosicion();break;
            case '4':eliminarValor();break;
            case '5':vaciar();break;
            case '6':salir=true;break;
            default: System.out.println("Opción inválida");
        }             
        } while (!salir);
    }  
        private static char pintarMenu(){
        char resp;
            System.out.println("-------------\n");
            System.out.println("Elige una opción");
            System.out.println("1 Añadir altura");
            System.out.println("2 Mostrar lista");
            System.out.println("3 Eliminar posición");
            System.out.println("4 Eliminar Valor");
            System.out.println("5 Vaciar");
            System.out.println("6 Fin del programa");
            System.out.println("-------------\n");
            resp = teclado.next().charAt(0);
            teclado.nextLine();
            return resp;
        }
            static void añadirAltura(){
                System.out.println("Introduce altura");
                double altura= teclado.nextDouble();
                boolean res=alturaAlumnos.añadirAltura(altura);
                if(res)System.out.println("Altura introducida ok");
                else System.out.println("Altura incorrecta");
            }
            static void eliminarPosicion(){
                System.out.println("Introducir posición a borrar");
                int pos=teclado.nextInt();
                boolean res =alturaAlumnos.eliminarPosicion(pos);
                if(res)System.out.println("Borrado ok");
                else System.out.println("Borrado incorrecto");
            }
                static void eliminarValor(){
                    System.out.println("Introduce un valor a borrar");
                    double valor =teclado.nextDouble();
                    boolean res=alturaAlumnos.eliminarValor(valor);
                    if(res)System.out.println("Borrado ok");
                    else System.out.println("Borrado incorrecto");
                }
                static void vaciar(){
                    alturaAlumnos.vaciarLista();
                }
                static void mostrar(){
                    ArrayList <Double> temp= alturaAlumnos.mostrarLista();
                    for(int i=0;i<temp.size();i++)
                        System.out.println("--> "+i+" -->"+temp.get(i)); 
                }
            }


    
    

