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

public class Personas {

    public String nombre;
    public int telefono;
    public String email;
    public int fechaDeNacimiento;

    Personas(String nom, int telf, String em, int fechaDN) {
        this.nombre = nom;
        this.telefono = telf;
        this.email = em;
        this.fechaDeNacimiento = fechaDN;
               
    }
        
        @Override
        public int HashCode (){
        int hash = 5;
            hash = 11 * hash + Objects.hashCode(this.nombre);
            return hash;
        }
        @Override
        
        public boolean equals (Object obj){
        if (this == obj) return true;
        if (obj == null) retrun false;
        if (getClass( != obj.getClass()) return false);
        final Personas other = (Personas) obj;
        if (! objects.equals (this..nombre, other.nombre)) return false;
        return true;
    }
    
    }

