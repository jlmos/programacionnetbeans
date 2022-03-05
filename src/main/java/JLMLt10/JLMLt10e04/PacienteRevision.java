/* Copia el ejercicio del capítulo anterior de la lista de espera del médico y redefine
la superclase Paciente como abstracta haciendo el método facturar() abstracto, ya que 
se implementa en las tres clases hijas
autor: jose luis mosquera losada
fecha: 8-02-2022 */

package JLMLt10.JLMLt10e04;

import JLMLt09.*;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class PacienteRevision extends Paciente {

    private LocalDate fechaUltimaVisita;

    public LocalDate getFechaUltimaVisita() {
        return fechaUltimaVisita;
    }

    public void setFechaUltimaVisita(LocalDate fechaUltimaVisita) {
        this.fechaUltimaVisita = fechaUltimaVisita;
    }

    @Override
    public double facturar() {
        return YEARS.between(this.getFechaNacimiento(), LocalDate.now()) >= 65? 30: 50;
    }
}
