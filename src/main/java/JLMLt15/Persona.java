/*Realizar un programa que cree un conjunto HashSet que almacene la lista de personas
que van a una fiesta(de una persona sabemos su nombre, teléfono, email y fecha de nacimiento).
Crea en un archivo aparte la clase Persona con los atributos y métodos que necesites. En el
programa introduce "a mano" unas cuantas personas, y luego muestre la edad media y el nombre del
mayor (también puedes crear un menú con la opción de añadir persona y mostrar lista)
   - hacer la inserción de una persona repetida y ver que ocurre. 
   - Muestra todos los valores almacenados en HashSet ¿tienen algún orden?
autor: jose luis mosquera losada
fecha: 15-05-2022 */
package JLMLt15;

import java.util.Objects;

public class Persona {

    
    public String nombre;
    public String telefono;
    public String email;
    public String fechaNacimiento;

    public Persona(String nombre, String telefono, String email, String fechaNacimiento) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.telefono);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
}


