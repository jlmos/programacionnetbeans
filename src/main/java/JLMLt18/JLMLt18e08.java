package JLMLt18;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
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
            ex.printStackTrace();
        }
        System.out.println(listaEmpleados);

        try (
                Connection conexion = DriverManager.getConnection(Constantes.BDURL, Constantes.USER, Constantes.PASS)
        ) {
            for (Empleado emp : listaEmpleados) {
                if (emp.getSalario() > 2000) {

                        String sql = "INSERT INTO empleado (id, nombre, fechaNacimiento, categoria, salario) VALUES (?,?,?,?,?)";
                        PreparedStatement ps = conexion.prepareStatement(sql);
                        ps.setInt(1, emp.getId());
                        ps.setString(2, emp.getNombre());
                        ps.setDate(3, Date.valueOf(emp.getFechaNacimiento()));
                        ps.setString(4, emp.getCategoria());
                        ps.setFloat(5, emp.getSalario());
                        int cantFilas = ps.executeUpdate();
                        System.out.println("Se han insertado correctamente " + cantFilas + " empleado.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

