/*Realizar un programa que tenga definido un Arrayy como variable global llamado 
TemperaturaMeses, de 12 enteros, con las temperaturas medias de un lugar en cada 
uno de los meses del año. Serán valores negativos o positivos. El programa tendrá
diferentes funciones que realicen las siguientes tareas: llenar el Array, mostrar
temperatura media, mostrar los meses con + de 30º, decir si hay alguno mes con 
+de 30º recorriendo lo imprescindible, se hay uno parar. idem pero sin usar break o
return y decir si hay alguna temperatura repetida en dos o + meses
autor: jose luis mosquera losada
fecha: 11-1-2022*/

package JLMLt07;

public class JLMLt07e02 {

    public static void main(String[] args) {
        TemperaturaMeses temperaturaMeses = new TemperaturaMeses();
        temperaturaMeses.llenarArrayAleatorio();
        temperaturaMeses.mostrarArray();
        System.out.println("Temperatura media: " + temperaturaMeses.calcularTemperaturaMedia());
        System.out.println("Meses de más de 30 grados: " + temperaturaMeses.mesesMasDe30Grados().toString());
        System.out.println("Existe mes mayor de  30 grados (con break): " + temperaturaMeses.existeMesMayor30ConBreak());
        System.out.println("Existe mes mayor de  30 grados (sin break): " + temperaturaMeses.existeMesMayor30SinBreak());
        System.out.println("Repetidos: " + temperaturaMeses.temperaturasDuplicadas());
    }

}
