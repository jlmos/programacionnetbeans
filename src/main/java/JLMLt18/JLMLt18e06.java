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

        final String CONSULTA_INSERT = "INSERT INTO empleado (id, nombre, fechaNacimiento, categoria, salario) VALUES (?,?,?,?,?)";
        final String CONSULTA_SELECT = "SELECT * FROM empleado";
        Scanner scanner = new Scanner(System.in);

        try (
                Connection conexion = DriverManager.getConnection(Constantes.BDURL, Constantes.USER, Constantes.PASS)
        ) {
            PreparedStatement ps1 = conexion.prepareStatement(CONSULTA_SELECT);
            PreparedStatement ps = conexion.prepareStatement(CONSULTA_INSERT);
            boolean continuar;
            do {
                int id = 0;
                ResultSet rs = ps1.executeQuery();
                while (rs.next()) {
                    id++;
                }
                ps.setInt(1, id + 1);
                System.out.println("Introduce el nombre: ");
                String nombre = scanner.nextLine();
                ps.setString(2, nombre);
                System.out.println("Introduce la fecha aaaa-mm-dd: ");
                String fecha = scanner.nextLine();
                ps.setString(3, fecha);
                System.out.println("Introduce categoria: ");
                String categoria = scanner.nextLine();
                ps.setString(4, categoria);
                System.out.println("Introduce el salario: ");
                String salario = scanner.nextLine();
                ps.setString(5, salario);
                int cantFilas = ps.executeUpdate();
                System.out.println(cantFilas + " fila/s insertadas");
                System.out.println("Continuar S/N? ");
                continuar = scanner.nextLine().equalsIgnoreCase("S");
            } while (continuar);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}







