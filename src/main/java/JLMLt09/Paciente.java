/* Hacer un programa con un menú que permita gestionar la cola de espera de un médico
con 3 tipos de pacientes : consulta(nombre, fecha nacimiento, motivo), receta(nomb., fecha nc., medicamentos) 
y revisión (nomb., fecha nc., fecha última visita)
Tarifas: consulta:100 eur. recetas:5 eur. revisión:30eur para mayores de 65 años, 50 eur para el resto.
Crear una clase para cada tipo de paciente en el propio archivo del programa con los constructores necesarios
y el método facturar() en cada una de las clases. Implementar herencia si es necesario.
Programa con menú para: registrar llegada del paciente (xq viene y su datos)
Llamar a consulta( por orden de llegada). Se cobra la tarifa correspondiente.
Consultar total facturado hasta ese momento.
autor: jose luis mosquera losada
fecha: 2-02-2022
 */
package JLMLt09;

import java.time.LocalDate;


public abstract class Paciente {
    
private String nombre;
    private LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract double facturar();
}
