/* Copia el ejercicio del capítulo anterior de la lista de espera del médico y redefine
la superclase Paciente como abstracta haciendo el método facturar() abstracto, ya que 
se implementa en las tres clases hijas
autor: jose luis mosquera losada
fecha: 8-02-2022 */

package JLMLt10.JLMLt10e04;

import JLMLt09.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteReceta extends Paciente {    
private List<String> medicamentos;

    public PacienteReceta() {
        this.medicamentos = new ArrayList<>();
    }

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public double facturar() {
        return medicamentos.size() * 5;
    }
}
