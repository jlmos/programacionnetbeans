/* Duplicar las interfaces y las clases del ejercicio anterior (con _v2b), modificar
la interfaz Saltador_v2 añadiéndole el método saltaPértiga que recibe como parámetro
una altura en centimetros y devuelve true si ha logrado el salto y false si no lo ha
logrado.
autor: jose luis mosquera losada
fecha: 11-02-2022 */
package JLMLt10;


public class JLMLt10e11 {
    
    public static void main(String[] args) {

        TriAtleta_v2 triAtleta_v2 = new TriAtleta_v2(30, true);
        TriAtleta_v2b triAtleta_v2b = new TriAtleta_v2b(30, true);

        System.out.println("Salto de 100cm:");
        System.out.printf("Triatleta v2: %b | Triatleta v2b: %b\n", triAtleta_v2.saltaPertiga(100), triAtleta_v2b.saltaPertiga(100));

        System.out.println("Salto de 550cm:");
        System.out.printf("Triatleta v2: %b | Triatleta v2b: %b\n", triAtleta_v2.saltaPertiga(550), triAtleta_v2b.saltaPertiga(550));

        System.out.println("Salto de 560cm:");
        System.out.printf("Triatleta v2: %b | Triatleta v2b: %b\n", triAtleta_v2.saltaPertiga(560), triAtleta_v2b.saltaPertiga(560));

        System.out.println("Salto de 580cm:");
        System.out.printf("Triatleta v2: %b | Triatleta v2b: %b\n", triAtleta_v2.saltaPertiga(580), triAtleta_v2b.saltaPertiga(580));

        System.out.println("Salto de 700cm:");
        System.out.printf("Triatleta v2: %b | Triatleta v2b: %b\n", triAtleta_v2.saltaPertiga(700), triAtleta_v2b.saltaPertiga(700));


    }

}
