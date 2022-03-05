/*Realizar un programa que tenga definido un Array como variable global llamado 
TemperaturaMeses, de 12 enteros, con las temperaturas medias de un lugar en cada 
uno de los meses del año. Serán valores negativos o positivos. El programa tendrá
diferentes funciones que realicen tareas
autor: jose luis mosquera losada
fecha: 11-1-2022*/
package JLMLt07;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;

public class TemperaturaMeses {

    private int valores[];

    public TemperaturaMeses() {
        this.valores = new int[12];
    }

    // Llenar array con valores al azar
    public void llenarArrayAleatorio() {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = new Random().nextInt(40);
        }
    }

    // Llenar array evitando duplicados
    public void llenarArrayAleatorioSinDuplicados() {
        for (int i = 0; i < valores.length; i++) {
            int temperaturaAleatoria = new Random().nextInt(40);
            if (contiene(temperaturaAleatoria)) {
                i--;
            } else {
                valores[i] = temperaturaAleatoria;
            }
        }
    }

    // Mostrar array
    public void mostrarArray() {
        String arrayString = Arrays.toString(valores);
        System.out.println("Array: " + arrayString);
    }

    // Mostrar array orden inverso
    public void mostrarArrayOrdenInverso() {
        int[] arrayOrdenado = new int[12];
        int[] arrayInvertido = new int[12];
        System.arraycopy(valores, 0, arrayOrdenado, 0, 11);
        Arrays.sort(arrayOrdenado);
        for (int i = 0; i < arrayOrdenado.length; i++) {
            arrayInvertido[i] = arrayOrdenado[11 - i];
        }
        System.out.println("Array orden inverso: " + Arrays.toString(arrayInvertido));
    }

    // Obtener temperatura media
    public double calcularTemperaturaMedia() {
        return Arrays.stream(valores).average().orElse(Double.NaN);
    }

    // Obtener meses de más de 30 grados
    public List<Integer> mesesMasDe30Grados() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > 30) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean existeMesMayor30ConBreak() {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > 30) {
                return true;
            }
        }
        return false;
    }

    public boolean existeMesMayor30SinBreak() {
        //TODO
        return false;
    }

    // Decir si hay alguna temperatura repetida en dos o más meses:
    public List<Integer> temperaturasDuplicadas() {
        List<Integer> repetidos = new ArrayList<>();
        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] == valores[j]) {
                    repetidos.add(valores[j]);
                }
            }
        }
        return repetidos;
    }

    public boolean contiene(int n) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == n) {
                return true;
            }
        }
        return false;
    }

    // Llenar array con las condiciones descritas en el ej 4a
    public void llenarArrayEj4() {
        for (int i = 0; i < valores.length; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 10:
                case 11:
                    valores[i] = new Random().nextInt(30) - 10;
                    break;
                default:
                    valores[i] = new Random().nextInt(30) + 10;
            }
            valores[i] = new Random().nextInt(40);
        }
    }

    // Mostrar por pantalla el contenido del array con el nombre de cada mes
    public void mostrarArrayConNombresMeses() {
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%s: %d\n", Month.of(i + 1).getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()), valores[i]);
        }
    }

    //Mostrar la temperatura máxima del año especificando signo + cuando es positiva y con 1 decimal
    public void mostrarTemperaturaMaxima() {
        float tempMaxima = Arrays.stream(valores).max().getAsInt();
        String signo = "";
        if (tempMaxima > 0) {
            signo = "+";
        }
        System.out.printf("Temperatura máxima: %s%.1f\n", signo, tempMaxima);
    }

    // Mostrar nombre del mes más frio del año
    public String mesMasFrio() {
        int posicionMesMasFrio = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > valores[posicionMesMasFrio]) {
                posicionMesMasFrio = i;
            }
        }
        return Month.of(posicionMesMasFrio + 1).getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault());
    }

    // Obtener valores desplazados a la derecha
    public int[] obtenerValoresDesplazados() {
        int[] result = new int[12];
        for (int i = 1; i < valores.length; i++) {
            result[i] = valores[i - 1];
        }
        result[0] = valores[valores.length - 1];
        return result;
    }
}
