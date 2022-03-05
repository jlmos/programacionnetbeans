/*implementar una clase llamada círculo que tiene solo la propiedad radio y los
métodos setRadio, getRadio, calcularCircunferencia, calcularSuperficie, calcularDiámetro
además de un constructor. Crear un programa que use esta clase creando un par de 
círculos y usando los métodos creados. 
autor: jose luis mosquera losada
fecha: 28-12-2021*/
package JLMLt06;

public class CCirculo {

    private double radio;

    public CCirculo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularDiametro() {
        return 2 * radio;
    }
}
