/*implementar una clase llamada círculo que tiene solo la propiedad radio y los
métodos setRadio, getRadio, calcularCircunferencia, calcularSuperficie, calcularDiámetro
además de un constructor. Crear un programa que use esta clase creando un par de 
círculos y usando los métodos creados.
autor: jose luis mosquera losada
fecha: 28-12-2021 */
package JLMLt06;


public class JLMLt06e07 {

    public static void main(String[] args) {

  CCirculo circulo1 = new CCirculo(5);
        CCirculo circulo2 = new CCirculo(3);

        double circunferencia1 = circulo1.calcularCircunferencia();
        double circunferencia2 = circulo2.calcularCircunferencia();

        double superficie1 = circulo1.calcularSuperficie();
        double superficie2 = circulo2.calcularSuperficie();

        double diametro1 = circulo1.calcularDiametro();
        double diametro2 = circulo2.calcularDiametro();

        System.out.println("Círculo 1:");
        System.out.println("circunferencia -> " + circunferencia1);
        System.out.println("superficie -> " + superficie1);
        System.out.println("diametro -> " + diametro1);
        System.out.println();
        System.out.println("Círculo 2:");
        System.out.println("circunferencia -> " + circunferencia2);
        System.out.println("superficie -> " + superficie2);
        System.out.println("diametro -> " + diametro2);
    }
    }

 
    
