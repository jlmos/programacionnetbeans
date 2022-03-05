/* Mostrar por pantalla los nºs primos entre 2 y 1000 hcer los bucles con un nº
mínimo de interacciones teniendo en cuenta que las características de un nº primo,
cuales son primos, los divisores de un nº y si un nº no es divisible por 2 ya no 
lo va a ser por ningún otro nº par.
autor: jose luis mosquera losada
fecha: 31-10-2021 */
package JLMLt03;

public class JLMLt03e20 {

    public static void main(String[] args) {

        for(int i=1;i<=1000;i++){
			int contador=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					contador++;
				}
			}
			if(contador==2){
				System.out.println(i);

                    }
                }

            }
        }
    

