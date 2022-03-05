/* Introducir DIA, MES y AÑO, que calcule el día siguiente. 
Tratamiento diferente según sea fin de año, fin de mes, 
o un día no fin de año.
* autor: jose luis mosquera losada
* fecha: 2021-10-19  */
package JLMLt02;

import java.util.Scanner;

public class JLMLt02e11b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anho;
        int cantidadDiaMes=0;
        System.out.print("Introduce el dia: ");
        dia = teclado.nextInt();
        System.out.print("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.print("Introduce el año: ");
        anho = teclado.nextInt();
    
    if (mes==4||mes==6||mes==9||mes==11)
    {cantidadDiaMes=30;
    }
    else if (mes==2){
    if ((anho % 4 == 0) && ((anho % 100 != 0) || (anho % 400 == 0)))
     {cantidadDiaMes=28;
    }
     else cantidadDiaMes=31;
    }
    if (mes==12 && dia==31){
    anho++;
    dia=1;
    mes=1;
        System.out.println("HOY ES FIN DE AÑO");
        System.out.println("El día siguiente es:" + dia +"/" +mes+"/"+anho);
    }
    else if (dia==cantidadDiaMes){
    dia=1;
    mes++;
        System.out.println("hoy es fin de MES");
        System.out.println("El día siguiente es:" + dia +"/" +mes+"/"+anho);
    }
    else {dia++;}
    }
    }


 
                

