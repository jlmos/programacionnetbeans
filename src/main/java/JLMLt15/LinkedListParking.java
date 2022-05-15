/*
 
 */
package JLMLt15;

import java.util.LinkedList;

public class LinkedListParking {

    LinkedList<String> plazas = new LinkedList<>();
    private int plazasOcupadas;
    private static final int MAXPLAZAS = 10;

    LinkedListParking() {
        plazas = new LinkedList.<MAXPLAZAS>();
        plazasOcupadas = 0;   
        plazas.addFirst("1111111");

    }

    public int Aparcar(String mat) {
        if (plazasOcupadas < MAXPLAZAS) {
            this.plazas.set(plazasOcupadas, mat);
            plazasOcupadas++;
            return plazasOcupadas;
        } else {
            return -1;
        }
    }

    public String Desaparcar() {
        if (plazasOcupadas == 0) {
            return null;
        }
        String mat = plazas.get(plazasOcupadas - 1);
        plazasOcupadas--;
        return mat;
    }

    public int cantidadPlazas() {
        return MAXPLAZAS - plazasOcupadas;
    }

    public String[] mostrarParking() {
        String p[] = new String[this.plazasOcupadas];
        System.arraycopy(this.plazas, 0, p, 0, this.plazasOcupadas);
        return p;
    }
}
