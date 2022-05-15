/* */
package JLMLt15;
import java.util.LinkedList;
public class LinkedListParking {

    LinkedList<String> matriculas = new LinkedList<>();
    private int matricula;
    private static final int MAXPLAZAS = 10;

    LinkedListParking() {
        matricula = new LinkedList.<MAXPLAZAS>();
        matricula.addFirst("111111");
        matricula.add("222222");
        matricula.add("333333");
        matricula.add("444444");
        matricula.add("555555");
        plazasOcupadas = 0;
    }
    public int Aparcar(String mat) {
        if (plazasOcupadas < MAXPLAZAS) {
            this.matricula.set(plazasOcupadas, mat);
            plazasOcupadas++;
            return plazasOcupadas;
        } else {
            return -1;
        }  }

    public String Desaparcar() {
        if (plazasOcupadas == 0) {
            return null;
        }
        String mat = matricula.get(plazasOcupadas - 1);
        plazasOcupadas--;
        return mat;
    }
    public int cantidadPlazas() {
        return MAXPLAZAS - plazasOcupadas;
    }
    public String[] mostrarParking() {
        String p[] = new String[this.plazasOcupadas];
        System.arraycopy(this.matricula, 0, p, 0, this.plazasOcupadas);
        return p;
    }
}
