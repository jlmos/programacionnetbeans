/*Examinar de nuevo la clase Bicho y su clase BichoDormilon del apartado anterior y 
trata de responder las siguientes cuestiones, justificando tu respuesta. Luego 
comprueba los resultados, ejecutando un programa con las sentencias propuestas
autor: jose luis mosquera losada
fecha: 25-01-2022 */
package JLMLt09;


public class JLMLt09cuestiones {

    
public static void main(String[] args) {

        // Cuestión A
        Bicho bi2 = new BichoDormilon(10);
        System.out.println("bi2 -> hambre: " + bi2.hambre);
        //System.out.println("bi2 -> sueño: " + bi2.sueño);
        /*
            La tercera línea provocaría un error de compilación. Se crea un objeto "BichoDormilon", pero se accede a él
            a través de una variable de tipo "Bicho", su clase padre, por lo que sólo los atributos presentes en
            "Bicho" estarían disponibles a través de esta referencia. Al intentar acceder a un atributo específico de la
            clase hija "BichoDormilon" (sueño) se produce el error
        */

        // Cuestión B: solucionaríamos el problema del println anterior así?
        System.out.println("bi2 ->  sueño: " + ((BichoDormilon) bi2).sueño);
        /*
            Sí. De esta manera el acceso se haría a través de una referencia de la clase "BichoDormilon".
         */

        // Cuestión C Y así?
        BichoDormilon bd4 = (BichoDormilon)  bi2;
        System.out.println("bd2 -> sueño: " + bd4.sueño);
        /*
            También. Igual que en el caso anterior, se accede al atributo sueño desde una referencia de tipo
            "BichoDormilon", la diferencia es que de esta manera se está declarando esta referencia con un nombre (bd4)
         */

    }
}

class Bicho {

    // Atributos
    public int hambre;
    private int peso;

    // Constructores
    Bicho () { hambre =50; peso=50; }
    Bicho (int h, int p) { // H=5, p=0
        hambre =h;
        peso=p;
    }

    // Métodos
    public void come () { hambre -=5; peso++; }
}

class BichoDormilon extends Bicho {

    // Atributos
    public int sueño;

    // Constructores
    BichoDormilon () {
        sueño = hambre * 2;
    }
    BichoDormilon (int i) {
        super(i,0);
        sueño = i+20;
    }

    // Métodos
    @Override
    public void come () {
        hambre -=10;
        sueño +=5;
    }

    public void aDormir () {
        super.come();
        sueño =0;
    }
}
