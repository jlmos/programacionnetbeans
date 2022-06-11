/*Modifica la clase Persona (llámale Persona_v2) para que dos personas sean iguales
si tienen el mismo nombre sin tener en cuenta mayúsculas y minúsculas. Repite el 
ejercicio anterior intentando incluir en el conjunto valores que no sean permitidos
por esta nueva condición (por ejemplo:ana y ANA generarían duplicado)
autor: jose luis mosquera losada
fecha: 25-05-2022 */
package JLMLt15;

import java.util.Objects;

public class Persona_v2 {
        
    public String nombre;
    public String telefono;
    public String email;
    public String fechaNacimiento;

    public Persona_v2(String nombre, String telefono, String email, String fechaNacimiento) {
        this.nombre = nombre.toLowerCase();
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
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
        final Persona_v2 other = (Persona_v2) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
      
}



