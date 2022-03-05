/*Con una estructura pila LIFO Last Input, First Output crear
una clase Parking2 que gestione los coches aparcados almacenando la matrícula
y la hor de entrada en el parking, cada minuto cuesta 2 centimos(máx 10 euros)
con los métodos: Estado parking (matrículas y hora de entrada, Aparcar, Desaparcar
(calculando el importe) y mostrar lo recaudado
autor: jose luis mosquera losada
fecha: 11-1-2022*/
package JLMLt07;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Parking2 {

    private final Coche[] plazas;
    private int plazasOcupadas;
    private static final int MAXPLAZAS = 20;
    private double totalRecaudado;

    Parking2() {
        plazas = new Coche[MAXPLAZAS];
        plazasOcupadas = 0;
    }

    public int aparcar(String mat) {
        if (plazasOcupadas < MAXPLAZAS) {
            this.plazas[plazasOcupadas] = new Coche(mat);
            plazasOcupadas++;
            return plazasOcupadas;
        } else {
            return -1;
        }
    }

    public Coche desaparcar() {
        long tiempo; double aPagar;
        if (this.plazasOcupadas == 0) return null;
        this.plazasOcupadas--;
        tiempo=ChronoUnit.MINUTES.between(
        this.plazas[this.plazasOcupadas].horallegada,LocalDateTime.now());
        aPagar=tiempo*0.02; if(aPagar>30)aPagar=30;
        this.plazas[this.plazasOcupadas].importePagar=aPagar;
        totalRecaudado+=aPagar;
        return this.plazas[this.plazasOcupadas];
        }
       
    public Coche[] mostrarParking() {
        Coche p[] = new Coche[this.plazasOcupadas];
        System.arraycopy(this.plazas, 0, p, 0, this.plazasOcupadas);
        return p;
    }
    public double totalRecaudado(){
    return totalRecaudado;
    
}}
