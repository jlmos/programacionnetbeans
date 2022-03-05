/* Crear una subclase de Trabajador llamada ConsultorExterno que añade un nuevo atributo
llamado horasTrabajadas y salarioFinal.
6) El constructor de esta nueva clase ConsultorExterno incorpora la inicialización a cero de las
horas trabajadas, salario base y salario final.
7) La clase ConsultorExterno también incorpora setter y getter para las horas trabajadas y un
método llamado calcularSalarioFinal() al que se le pasa a cuanto se paga la hora a los
consultores en ese momento y calcula el salario final del consultor solo en función de las
horas trabajadas (el salario base de estos trabajadores es cero).
autor: jose luis mosquera losada
fecha: 24-01-2022*/
package JLMLt08;

import java.time.LocalDate;

public class ConsultorExterno extends Trabajador {

    private int horasTrabajadas;
    private double salarioFinal;

    public ConsultorExterno(String id, String nombre, LocalDate fechaNacimiento) {
        super(id, nombre, fechaNacimiento, 0);
        this.horasTrabajadas = 0;
        this.salarioFinal = 0;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void calcularSalarioFinal(double costeHoraExtra) {
        salarioFinal = costeHoraExtra * horasTrabajadas;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "ConsultorExterno{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", salarioFinal=" + salarioFinal +
                '}';
    }
}
