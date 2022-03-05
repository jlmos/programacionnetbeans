/* A partir de las clases PoligonoRegular, Pentagono y Hexagono.
a) Prueba a crear instancias de hexágonos y pentágonos sobre variables de tipoPoligonoRegular 
 y comprueba mediante calculadora onlin que calcula correctamente su área y perímetro.
y responde a las cuestiones b, c, d, e, f, g y h.
autor: jose luis mosquera losada
fecha: 7-02-2022*/
package JLMLt10;

public class JLMLcuestiones {
    
    public static void main(String[] args) {
        //cuestionA();
    }
    
    public static void cuestionA() {
        PoligonoRegular hexagono1 = new Hexagono(6);
        PoligonoRegular pentagono1 = new Pentagono(6);
        System.out.printf("Hexágono: área -> %.2f | perímetro -> %.2f\n", hexagono1.area(), hexagono1.perimetro());
        System.out.printf("Pentágono: área -> %.2f | perímetro -> %.2f\n", pentagono1.area(), pentagono1.perimetro());
        // El resultado es correcto.
    }
    
    //Cuestión B:
    //Por que tiene métodos abstracto y porque no tendría sentido crear una instancia de PoligonoRegular.
    
    // Cuestión C:
    // No podría serlo porque no tiene cuerpo. En caso de escribir un método para calcular el área en la clase padre,
    // tendría que ser demasiado complejo, al tener que contemplar muchos casos.
    
    // Cuestión D:
    // No, salvo que sea abstracta. Las clases hijas no abstractas están obligadas a implementar los métodos abstractos de
    // la clase padre.
    
    // Cuestión E:
    // No, porque las clases abstractas no se pueden instanciar, da error de compilación.
    
    // Cuestión F:
    // El perímetro sí se calcula, porque puede escribir el código necesario para calcularlo. Tamaño por el número de lados.
    // Lo que no es igual es uno de los parámetros que es el número de lado, sí funciona para todos, independientemente del
    // primero. Dentro del código está llamando a getCantidadDeLados() pero no daría error.
    
    // Cuestión G:
    // Sí, funciona correctamente. Es un ArrayList de la clase padre. Y sí funciona porque puede almacenar variables de la
    // clase padre. Sí puede recorrer porque cada elemento tiene definido el método área. p.area() tiene que estar definido
    // obligatoriamente. Al ser abstracta, los hijos deben de tener ese método implementado.
    
    // Cuestión H:
    // No, tendrían que instanciar y castear.

}

abstract class PoligonoRegular {

    double tamañoLado;

    abstract double area();

    abstract int getCantidadLados();

    double perimetro() {
        return getCantidadLados() * this.tamañoLado;
    }

    PoligonoRegular(double tl) {
        this.tamañoLado = tl;
    }
}

class Pentagono extends PoligonoRegular {

    Pentagono(double t) {
        super(t);
    }

    @Override
    int getCantidadLados() {
        return 5;
    }

    @Override
    double area() {
        return 1.72048d * Math.pow(this.tamañoLado, 2);
    }
}

class Hexagono extends PoligonoRegular {

    Hexagono(double t) {
        super(t);
    }

    @Override
    int getCantidadLados() {
        return 6;
    }

    @Override
    double area() {
        double lado = this.tamañoLado;
        double apotema = Math.sqrt((lado * lado) - ((lado / 2) * (lado / 2)));
        return lado * apotema * 3;
    }
}
