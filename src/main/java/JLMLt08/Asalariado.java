/* Crear una subclase de Trabajador llamada Asalariado que añade un nuevo atributo llamado
salarioFinal y otro llamado horasExtra. El constructor de esta nueva clase Asalariado incorpora la inicialización
a cero de las horas extra y el salario final igual al salario base. 2) La clase Asalariado también incorpora 
setter y getter para las horas extra y un método llamado calcularSalarioFinal() al que se le pasa a cuanto 
se paga la hora extra en esemomento y calcula el salario final del empleado siendo su salario base más el importe 
delas horas extras trabajadas.
autor: jose luis mosquera losada
fecha: 24-01-2022*/
package JLMLt08;

import java.time.LocalDate;

public class Asalariado extends Trabajador {

    private double salarioFinal;
    private int horasExtra;

    public Asalariado(String id, String nombre, LocalDate fechaNacimiento, double salarioBase) {
        super(id, nombre, fechaNacimiento, salarioBase);
        this.horasExtra = 0;
        this.salarioFinal = salarioBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void calcularSalarioFinal(double precioHoraExtra) {
        double importeHorasExtra = horasExtra * precioHoraExtra;
        salarioFinal = getSalarioBase() + importeHorasExtra;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Asalariado{" +
                "salarioFinal=" + salarioFinal +
                ", horasExtra=" + horasExtra +
                '}';
    }
}
