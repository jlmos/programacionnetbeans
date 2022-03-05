/*Realizar un programa que tenga definido un Array como variable global llamado 
TemperaturaMeses, de 12 enteros, con las temperaturas medias de un lugar en cada 
uno de los meses del año. Serán valores negativos o positivos. El programa tendrá
diferentes funciones que realicen las siguientes tareas: llenar el Array, mostrar
temperatura media, mostrar los meses con + de 30º, decir si hay alguno mes con 
+de 30º recorriendo lo imprescindible, se hay uno parar. idem pero sin usar break o
return y decir si hay alguna temperatura repetida en dos o + meses
autor: jose luis mosquera losada
fecha: 11-1-2022*/

package JLMLt07;
public class JLMLt07e02b {

    public static void main(String[] args) {

    boolean result=true;
            if (args.length !=2)result=false;
            else if (!args[0].equals(args[1]))result=false;
            else{
            System.out.println(result);
            
    int up=0,low=0;
    for(int i=0;i<args[0].length();i++){
        if(Character.isUpperCase(args[0].charAt(i)))up++;
        else if (Character.isLowerCase(args[0].charAt(i)))low++;
    }
    if(low <=1 || up<=1) result = false;
} 
            System.out.println("el resultado es: "+result);
   }}
