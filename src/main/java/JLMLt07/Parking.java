/*Con una estructura pila-LIFO-Lastinput, First Output, First Output,
crear una clase Parking con los métodos: Estado de Parking, Aparcar, 
Desaparcar y plazas libres. Hacerlocon un menú que permita al usuario
usar los métodos, sin que los métodos deban escribir nada por consola */
package JLMLt07;

public class Parking {

    private final String[] plazas;
    private int plazasOcupadas;
    private static final int MAXPLAZAS = 20;

    Parking() {
        plazas = new String[MAXPLAZAS];
        plazasOcupadas = 0;
    }

    public int Aparcar(String mat) {
        if (plazasOcupadas < MAXPLAZAS) {
            this.plazas[plazasOcupadas] = mat;
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
        String mat = plazas[plazasOcupadas - 1];
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
 /*public class listaCoche{
    Coche[]listCoche=new Coche[20];
    int numCoche;
    public listaCoche(){
        numCoche=0;
    }public boolean insertaCoche(Coche c)
    { boolean encontrado=false;
    for (int i=0; i<numCoche;i++)
    { 
        if (listaCoche[i].mat()==c.mat)
    {encontrado=true;
        }
    } encontrado=false;*/


