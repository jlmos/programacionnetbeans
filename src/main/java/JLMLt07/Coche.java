/*Con una estructura pila LIFO Last Input, First Output crear
una clase Parking2 que gestione los coches aparcados almacenando la matrícula
y la hor de entrada en el parking, cada minuto cuesta 2 centimos(máx 10 euros)
con los métodos: Estado parking (matrículas y hora de entrada, Aparcar, Desaparcar
(calculando el importe) y mostrar lo recaudado */
package JLMLt07;
import java.time.LocalDateTime;
public class Coche {
    public String matricula;
    public LocalDateTime horallegada;
    public double importePagar;
    
Coche (String mat){
    matricula=mat;
    horallegada=LocalDateTime.now();
    importePagar =0;
}    
}
