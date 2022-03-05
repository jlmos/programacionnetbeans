/*Haz un programa que cree un ArrayList de Asalariados y otro de ConsultoresExternos e
introduce “a mano” dos o tres empleados en ambos ArrayList.
8.11a) Después modifica el contenido de ambos ArrayList añadiendo también “a mano” las
horas extra/horas trabajadas respectivamente para todos los empleados.
8.11b)Fijar el importe de hora extra a 20 euros y la hora de consultor a 100 euros y
modificar de nuevo los ArrayList calculando el salario final de cada trabajador.
8.11c) Finalmente, recorriendo con un for-each ambos ArrayList, obtener el total que
gastará la empresa en salarios.
8.11d) ¿Sería útil tener un ArrayList que pudiese contener instancias de ambas clases?
autor: jose luis mosquera losada
fecha: 24-01-2022 */
package JLMLt08;

import java.time.LocalDate;
import java.util.ArrayList;

public class JLMLt08e11 {

    public static void main(String[] args) {

        ArrayList<Asalariado> asalariados = new ArrayList<>();
        ArrayList<ConsultorExterno> consultorExternos = new ArrayList<>();

        // Creación de asalariados
        asalariados.add(new Asalariado("1", "Nombre1", LocalDate.parse("1990-01-01"), 1000));
        asalariados.add(new Asalariado("2", "Nombre2", LocalDate.parse("1990-01-01"), 2000));
        asalariados.add(new Asalariado("3", "Nombre3", LocalDate.parse("1990-01-01"), 3000));

        // Creación de consultores
        consultorExternos.add(new ConsultorExterno("4", "Nombre4", LocalDate.parse("1990-01-01")));
        consultorExternos.add(new ConsultorExterno("5", "Nombre5", LocalDate.parse("1990-01-01")));
        consultorExternos.add(new ConsultorExterno("6", "Nombre6", LocalDate.parse("1990-01-01")));

        // Modificar horas extras/trabajadas
        asalariados.get(0).setHorasExtra(30);
        asalariados.get(1).setHorasExtra(20);
        asalariados.get(2).setHorasExtra(10);
        consultorExternos.get(0).setHorasTrabajadas(50);
        consultorExternos.get(1).setHorasTrabajadas(40);
        consultorExternos.get(2).setHorasTrabajadas(30);

        // Modificar precio hora extra / trabajada
        asalariados.get(0).calcularSalarioFinal(20);
        asalariados.get(1).calcularSalarioFinal(20);
        asalariados.get(2).calcularSalarioFinal(20);
        consultorExternos.get(0).calcularSalarioFinal(100);
        consultorExternos.get(1).calcularSalarioFinal(100);
        consultorExternos.get(2).calcularSalarioFinal(100);

        // Calcular coste final
        double costeTotal = 0;

        for (Asalariado asalariado : asalariados) {
            costeTotal += asalariado.getSalarioFinal();
            System.out.println(asalariado.toString());
        }

        for (ConsultorExterno consultorExterno : consultorExternos) {
            costeTotal += consultorExterno.getSalarioFinal();
            System.out.println(consultorExterno.toString());
        }
        System.out.println("Coste total: " + costeTotal);

        /*  Si tuviéramos un array con empleados de ambos tipos podríamos calcular el coste final 
        de todos los salarios recorriendo un único array.
         */
    }

}
