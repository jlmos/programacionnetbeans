/*Realizar un programa que solicite al usuario todos los datos de un empleado y
que inserte una nueva fila en la tabla Empleado. Después de introducir un empleado,
preguntará si se desea insertar más, repitiendo el proceso mientras el usuario lo desee.
autor: jose luis mosquera losada
fecha: 5-06-2022*/

package JLMLt18;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class JLMLt18e06 {

    
    public static void main(String[] args) {
      
        final String DDBB = "jdbc:mysql://localhost:3306/empresa?useUnicode=true&useJDBCCompliantTimezoneShif=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String USER = "root";
        final String PASSWORD = "pepe";
        final String CONSULTA = "INSERT INTO empleado (id, nombre, fechaNacimiento, categoria, salario) VALUES (?,?,?,?,?)";
        final String CONSULTA1 = "SELECT * FROM empleado";
        Scanner teclado = new Scanner(System.in);
        String nombre, fecha, categoria, salario, salir;

        try ( Connection conexion = DriverManager.getConnection(DDBB, USER, PASSWORD)) {
            PreparedStatement ps1 = conexion.prepareStatement(CONSULTA1);
            PreparedStatement ps = conexion.prepareStatement(CONSULTA);
            do {
                salir = "";
                int id = 0;
                ResultSet rs = ps1.executeQuery();
                while (rs.next()) {
                    id++;
                }
                ps.setInt(1, id + 1);
                System.out.println("Introduce el nombre: ");
                nombre = teclado.nextLine();
                ps.setString(2, nombre);
                System.out.println("Introduce la fecha aaaa-mm-dd: ");
                fecha = teclado.nextLine();
                ps.setString(3, fecha);
                System.out.println("Introduce categoria: ");
                categoria = teclado.nextLine();
                ps.setString(4, categoria);
                System.out.println("Introduce el salario: ");
                salario = teclado.nextLine();
                ps.setString(5, salario);
                int cantFilas = ps.executeUpdate();
                System.out.println(cantFilas + " fila/s insertadas");
                System.out.println("Continuar si/no? ");
                salir = teclado.nextLine();
            } while (!salir.equals("no"));
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode()
                    + "\nSLQState: " + e.getSQLState()
                    + "\nMensaje: " + e.getMessage());
        }
    }
}







