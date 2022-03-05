/*Teniendo en cuenta el código, modifica la clase Contacto para que funcione el
main()mostrado
autor: jose luis mosquera losada
fecha: 06-01-2022*/

package JLMLt06;

        import java.time.*;

public class JLMLt06e13 {

    
    public static void main(String[] args) {
        
Contacto contacto;
contacto = new Contacto ("Marta", 6661111222L, LocalDate.parse("2019-11-25"));
contacto = new Contacto ("Miguel", 1111111L, LocalDate.now());
contacto = new Contacto ("Ana", 3333333L,"2019-11-20"); //La fecha es un String
contacto = new Contacto ("Daniel", 444444L);//No funciona porque no encuentra un constructor compatible
}}
class Contacto {
public String nombre;
public long numero;
public LocalDate fechaAltaAgenda;
Contacto (String no, long nu,LocalDate fe){
this.nombre = no;
this.numero = nu;
this.fechaAltaAgenda = fe;
    }//Creamos un constructor alternativo para Ana
  Contacto (String no, long nu,String fe){ //añadimos String a la fecha
this.nombre = no;
this.numero = nu;
this.fechaAltaAgenda = LocalDate.parse(fe); // Con el parse convertimos un String en un dato numérico.
}
Contacto (String no, long nu){ //creamos un constructor alternativo que incluya los parámetros de Daniel.
this.nombre = no;
this.numero = nu;
}}