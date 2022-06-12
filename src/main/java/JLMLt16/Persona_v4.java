/*Crear una enumeración pública con el género de las personas (masculino, femenino) en 
un archivo propio. Crea una nueva versión de la clase Persona (Persona_v4) que la incorpore
como atributo y adapta los métodos necesarios para tratarla (constructor, toString,etc). Hacer
un programa que solicite al usuario por consola los datos de personas y los almacene en un
HashSet(Introducirá nombre 'Z' para indicar que no desea introducir más personas). Finalmente
mostrará todos los datos almacenados en el conjunto.
autor: jose luis mosquera losada
fecha: 08-06-2022 */

package JLMLt16;


class Persona_v4 implements Comparable{

    public String nombre;
    public String telefono;
    public String email;
    public String fechaNacimiento;

    public Persona_v4(String nombre, String telefono, String email, String fechaNacimiento) {
        this.nombre = nombre.toLowerCase();
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    Persona_v4(String nombre, String telefono, String email, String fechaNacimiento, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    @Override
    public int compareTo(Object o) {
        Persona_v4 p = (Persona_v4) o;
        return this.nombre.compareToIgnoreCase(p.nombre);
    }

    static class Genero {

        static Object INGLES;
        static Object FRANCES;

        public Genero() {
        }
    }
    

}

