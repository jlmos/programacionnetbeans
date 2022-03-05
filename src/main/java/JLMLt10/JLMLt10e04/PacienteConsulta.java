/* Copia el ejercicio del capítulo anterior de la lista de espera del médico y redefine
la superclase Paciente como abstracta haciendo el método facturar() abstracto, ya que 
se implementa en las tres clases hijas
autor: jose luis mosquera losada
fecha: 8-02-2022 */
package JLMLt10.JLMLt10e04;

import JLMLt09.*;



public class PacienteConsulta extends Paciente {    
private String motivoConsulta;

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    @Override
    public double facturar() {
        return 100;
    }
}
