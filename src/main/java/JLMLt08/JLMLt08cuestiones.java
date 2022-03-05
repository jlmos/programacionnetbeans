/*Examina la clase Bicho y su clase hija BichoDormilón y responder a las cuestiones
autor: jose luis mosquera losada
fecha: 18-01-2022*/
package JLMLt08;

public class JLMLt08cuestiones {

    public static void main(String[] args) {
        apartadoA();
        apartadoB();
        apartadoC();
        apartadoD();
    }

    public static void apartadoA() {
        Bicho bi = new Bicho();
        BichoDormilon bd = new BichoDormilon();
        System.out.println("bi -> hambre: " + bi.hambre);  // 50
        System.out.println("bd -> hambre: " + bd.hambre); // 50. El constructor de la clase BichoDormilón llama al constructor sin argumentos de la clase Bicho.
        System.out.println("bd -> sueño: " + bd.sueño); // 100
        //System.out.println("bd -> peso: " + bd.peso); // No se puede acceder al atributo peso porque es privado
    }

    public static void apartadoB() {
        Bicho bi = new Bicho();
        BichoDormilon bd = new BichoDormilon();
        bi.come();
        bd.come();
        System.out.println("bi -> hambre: " + bi.hambre); // 45. Ejecuta el método come que le resta 5 de hambre
        System.out.println("bd -> hambre: " + bd.hambre); // 40. El bicho dormilón sobreescribe el método comer, por lo que el comportamiento es diferente
        bd.aDormir();
        System.out.println("bd -> hambre: " + bd.hambre); // 35. Ejecuta el método comer de la clase padre
        System.out.println("bd -> sueño: " + bd.sueño);   // 0.
    }

    public static void apartadoC() {
        BichoDormilon bd2 = new BichoDormilon(5);
        /*
            Al utilizar el constructor BichoDormión con un argumento, se invoca el constructor de Bicho(int, int).
            Siguiendo el flujo tenemos que las propiedades son sueño=25, hambre=5, peso=0
         */
        //bd2.come(10);  // El metodo come() de la clase BichoDormilon no admite argumentos.
        System.out.println("bd2 -> hambre: " + bd2.hambre); // Hambre = 5
    }

    public static void apartadoD() {
        BichoDormilon bd2 = new BichoDormilon(5); // sueño=25, hambre=5 peso=0
        bd2.come(); // hambre-5, sueño=30
        System.out.println("bd2 -> hambre: " + bd2.hambre);
        System.out.println("bd2 -> sueño: " + bd2.sueño);
    }
}

class Bicho {

    // Atributos
    public int hambre;
    private int peso;

    // Constructores
    Bicho() {
        hambre = 50;
        peso = 50;
    }

    Bicho(int h, int p) { // H=5, p=0
        hambre = h;
        peso = p;
    }

    // Métodos
    public void come() {
        hambre -= 5;
        peso++;
    }
}

class BichoDormilon extends Bicho {

    // Atributos
    public int sueño;

    // Constructores
    BichoDormilon() {
        sueño = hambre * 2;
    }

    BichoDormilon(int i) {
        super(i, 0);
        sueño = i + 20;
    }

    // Métodos
    @Override
    public void come() {
        hambre -= 10;
        sueño += 5;
    }

    public void aDormir() {
        super.come();
        sueño = 0;
    }
}
