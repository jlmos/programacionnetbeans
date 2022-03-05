/* practica billetes
 */
package Pt03;
public class práctica9 {
    public static void main(String[] args) {
        int b20, b5; long importe, importeRestante;
        importe = 133;
        b20 = (int)importe / 20;
        importeRestante = importe % 20;
        b5 = (int)importeRestante / 5;
        importeRestante = importeRestante % 5;
        System.out.println("los billetes de 20 son:" + b20);
        System.out.println("los billetes de 5 son:" + b5);
        System.out.println("las monedas son:" + importeRestante);

    }

}
