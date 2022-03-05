/* En el paquete pMates, crea una clase hija de Calculadora, llamada CalculadoraPro,
acceso default, con un método similar sumar() de la clase base pero público y que devuelve
el valor en hexadecimal. Podemos hacer super.sumar() para calcular la suma? Hay @override?
Tiene un método similar a menor() de la clase base pero público y que devuelve cero si el menor
del ArrayList es menor que cero. Podemos hacer super.menor() para calcular la suma? Hay @overryde?
autor: jose luis mosquera losada
fecha: 22-02-2022 */
package JLMLt11.pClasesApoyo.pMates;

class CalculadoraPro extends Calculadora {

    // No podemos hacer super.sumar() porque se trata de un método privado, sólo accesible desde la propia clase
    // No hay @Override porque no se tiene visibilidad del método de la clase padre. Si se pusiera, daría error
    public String sumar() {
        int sumaInt = 0;
        for (Integer entero : super.enteros) {
            sumaInt += entero;
        }
        return Integer.toHexString(sumaInt);
    }

    // En este caso sí que se puede llamar a super.menor() porque este método de la clase
    // padre es protected, lo que permite acceder a él desde clases hijas
    public int menor() {
        int menor = super.menor();
        if (menor < 0) return 0; else return menor;
    }

}