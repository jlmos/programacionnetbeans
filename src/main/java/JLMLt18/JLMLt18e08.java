/* Partiendo de la clase Empleado definida previamente, realiza un programa con un main que
tenga dos métodos o funciones: el primer método leerá¡ el fichero csv llamado empleados.csv
proporcionado por el profesor y que contiene una li­nea por cada empleado con la siguiente
estructura: id ; nombre ; fechaNacimiento ; categoria ; salario
Para cada lí­nea del fichero se debera¡ crear una instancia de empleado e introducirla en un
hashSet de empleados. El segundo método del main leerá¡ el hashset anterior y, para cada
empleado que cobre mÃ¡s de 2000 euros, lo insertarÃ¡ en la tabla de empleados.
Pistas:
- El hashset será¡ una variable global para poder acceder a ella desde ambos métodos.
- Para insertar en la tabla puedes basarte en el ejercicio 5, pero recorriendo el HashSet en vez
pedirle a usuario los datos de los empleados.
autor: jose luis mosquera losada
fecha: 15-05-2022 */
package JLMLt18;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;


public class JLMLt18e08 {
static HashSet<Empleado> listaEmpleados;
    static Scanner teclado;
    static Empleado empleado;

    
    public static void main(String[] args) {
      
        teclado = new Scanner(System.in);
        listaEmpleados = new HashSet<>();

        File f = new File("archivos"+File.separator+"empleado.csv");
        String cadena;
        try (FileInputStream fis = new FileInputStream(f);
                InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); //"ISO-8859-1"
                BufferedReader bfr = new BufferedReader(isr)) {
            while ((cadena = bfr.readLine()) != null) {
                String[] partes = cadena.split(";");
                if (partes.length == 5) {
                    empleado = new Empleado(Integer.parseInt(partes[0]), partes[1], LocalDate.parse(partes[2]), partes[3], Float.parseFloat((partes[4])));
                    listaEmpleados.add(empleado);
                }
            }
        } catch (IOException ex) {
            System.err.printf("Error:%s\n", ex.getMessage());
        }
        System.out.println(listaEmpleados); // Para ver que se guardaron correctamente.
        
        /*   Primero lo hice sin codificacion de fichero y cascaba al llegar a los acentos.
        String linea = "";
        try (FileReader fr = new FileReader("archivos"+File.separator+"empleados.csv");
                Scanner sc = new Scanner(fr)) {
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                String[] partes = linea.split(";");
                if (partes.length == 5) {
                    System.out.printf("%nID:%s,Nombre:%s,Fecha Nacimiento:%s,categoria:%s,salario%s",
                            partes[0], partes[1], partes[2], partes[3], partes[4]);
                    empleado = new Empleado(Integer.parseInt(partes[0]), partes[1], LocalDate.parse(partes[2]), partes[3], Float.parseFloat((partes[4])));
                    listaEmpleados.add(empleado);
                }
            }
        } catch (IOException ex) {
            System.err.printf("%nError:%s", ex.getMessage());
        }
         */
        try (Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/empresa", "root", "")) {
            for (Empleado emp : listaEmpleados) {
                if (emp.getSalario() > 2000) {

                        String sql = "INSERT INTO empleado (id, nombre, fechaNacimiento, categoria, salario) VALUES (?,?,?,?,?)";
                        PreparedStatement ps = conexion.prepareStatement(sql);
                        ps.setInt(1, emp.getId());
                        ps.setString(2, emp.getNombre());
                        ps.setDate(3, java.sql.Date.valueOf(emp.getFechaNacimiento()));
                        ps.setString(4, emp.getCategoria());
                        ps.setFloat(5, emp.getSalario());
                        int cantFilas = ps.executeUpdate();
                        System.out.println("Se han insertado correctamente " + cantFilas + " empleado.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Código de Error:" + e.getErrorCode()
                    + "\nSLQState:" + e.getSQLState()
                    + "\nMensaje:" + e.getMessage());
        }
    }
}

