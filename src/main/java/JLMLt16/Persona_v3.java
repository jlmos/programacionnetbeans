/*Modifica la clase Persona (llámale Persona_v2) para que dos personas sean iguales
si tienen el mismo nombre sin tener en cuenta mayúsculas y minúsculas. Repite el 
ejercicio anterior intentando incluir en el conjunto valores que no sean permitidos
por esta nueva condición (por ejemplo:ana y ANA generarían duplicado)
autor: jose luis mosquera losada
fecha: 25-05-2022 */
package JLMLt16;

import JLMLt15.*;

class Persona_v3 implements Comparable{

    public String nombre;
    public String telefono;
    public String email;
    public String fechaNacimiento;

    public Persona_v3(String nombre, String telefono, String email, String fechaNacimiento) {
        this.nombre = nombre.toLowerCase();
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    @Override
    public int compareTo(Object o) {
        Persona_v3 p = (Persona_v3) o;
        return this.nombre.compareToIgnoreCase(p.nombre);
    }
    

}




