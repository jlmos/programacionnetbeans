/* programa ++ menú para gestionar un parking que tiene 100 plazas y pueden aparcar 3
tipos de vehiculos generales, furgonetas y autobuses. Todos pagan 4 céntimos x minuto, pero 
las furgonetas pagan además 20 cent. x cada metro de su longitud y los autobuses 25 cent por asientos.
El menú debe permitir: a)Entrada (matrícula, tipo, sus datos adicionales para el cálculo de la estancia).
b)Salida (matrícula ++ cálculo del importe a pagar y liberar plaza).
c)Lista de vehículos (matrícula, tipo, fecha/hora llegadda (toString), nº total de plazas ocupadas)). d)Salir. 
No hay concepto de nº de plaza. Mantenerr la mayor cantidad de información (datos, cálculos) en las clases, no en el
programa. Se puede crear las clases y el programa en el mismo archivo con el modificador de acceso x defecto.El parking 
será un ArrayList, para localizar un vehículo (menú salida) emplea un ArrayList.indexof pudiendo implicar definir un equals. 
Clase parking con un ArrayList de coches o un ArrayList en el programa como variable global sin la clase Parking,
autor: jose luis mosquera losada
fecha: 06-02-2022 */
package JLMLt09;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class JLMLt09e10 {

    static ArrayList<Coche> parking;
    static Scanner teclado;
    static final int PLAZAS = 100;

    public static void main(String[] args) {
        parking = new ArrayList<>();
        teclado = new Scanner(System.in);
        boolean salir = false; char opcion;
        do {
            System.out.println("a)Entrada\nb)Salida\nc)Lista\nd)Salir");
            opcion = teclado.next().charAt(0);
            switch (opcion) {
                case 'a': entrada();  break;
                case 'b': salida();   break;
                case 'c': lista();    break;
                case 'd': salida();   break;
                default:  System.out.println("Opción inválida");
            }
        } while (!salir);
    }

    static void entrada() {
        teclado.nextLine();
        if (parking.size() < PLAZAS) {
            System.out.println("Introduce matrícula:");
            String mat = teclado.nextLine();
            System.out.println("Introduce tipo (1: coche, 2: furgoneta, 3: autobus");
            int tipo =teclado.nextInt();
            switch (tipo){
                case 1:  parking.add (new Coche(mat)); break;
                case 2:
                    System.out.println("Introduce metros: ");
                int metros = teclado.nextInt();
                parking.add (new Furgoneta(mat,metros)); break;
                case 3: 
                    System.out.println("Introduce asientos: ");
                int asientos = teclado.nextInt();
                parking.add (new Autobus(mat,asientos)); break;
                default:
                    System.out.println("Tipo erroneo"); return;
        
        } System.out.println("Coche en parking");
    }else System.out.println("Parking lleno");
    }
    static void salida() {
            teclado.nextLine();
            System.out.println("Introduce matrícula:");
            String mat = teclado.nextLine();
            int pos= parking.indexOf(new Coche(mat));
            if(pos==-1){System.out.println("Matrícula incorrecta");return;}
            int imp = parking.get(pos).salida();
            System.out.println("A pagar " + imp);
            parking.remove(pos);
            /*teclado.nextLine();
            System.out.println("introduce matricula");
            String mat=teclado.nextLine();
            int pos=parking.indexOf(new Coche(mat));
            if(pos==-1){System.out.println("matricula erronea");return;}
            int imp=parking.get(pos).salida();
            System.out.println("el importe es:"+imp);
            parking.remove(pos);
*/
    }
    static void lista(){
        teclado.nextLine();
        for(Coche e:parking)System.out.println(e);
        System.out.println("Plazas ocupadas:"+ parking.size());
        
    }
}
        class Coche extends Object {

            String matricula;
            LocalDateTime fechaEntrada;
            LocalDateTime fechaSalida;
            static final int COSTEMINUTO = 4;

            Coche(String matricula) {
                this.matricula = matricula;
                fechaEntrada = LocalDateTime.now();
              
            }

            public int salida() {
                fechaSalida = LocalDateTime.now();
                long tiempo = ChronoUnit.SECONDS.between(fechaEntrada, fechaSalida);
                return (int) tiempo * COSTEMINUTO;
            }

            @Override
            public int hashCode() {
                int hash = 7;
                return hash;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null) return false;
                if (obj instanceof Coche==false)  return false;
                
                final Coche other = (Coche) obj;
                if (!Objects.equals(this.matricula, other.matricula)) {
                    return false;
                }
                return true;
            }

    @Override
    public String toString() {
        return "matricula:" + matricula + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida 
                +"," + this.getClass().getSimpleName();
    }            
}
class Furgoneta extends Coche{
    int longitud;
    static final int COSTEMETRO=20;
    
    Furgoneta (String matricula, int lon){
        super (matricula);
        this.longitud = lon;
    }

    @Override
    public int salida() {
        int importe = super.salida();
        importe+=longitud * COSTEMETRO;
        return importe; 
    }}
 class Autobus extends Coche {
    int asientos;
   static final int COSTEASIENTO=25;
        
    Autobus (String matricula, int asientos) {
        super(matricula);
        this.asientos  = asientos;
    }   

        @Override
        public int salida() {
           int importe= super.salida();
            importe+= asientos * COSTEASIENTO;
            return importe; 
        }
    
        }
            
