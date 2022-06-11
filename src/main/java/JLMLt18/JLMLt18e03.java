/*Realizar un programa que solicita al usuario una categoría laboral y que muestre 
la cantidad de empleados nacidos después que hay con esa categoría
autor: jose luis mosquera losada
fecha: 5-06-2022 */
package JLMLt18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class JLMLt18e03 {

    
    public static void main(String[] args) {
      
       final String DDBB = "jdbc:mysql://localhost:3306/empresa?useUnicode=true&useJDBCCompliantTimezoneShif=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String USER = "root";
        final String PASSWORD = "pepe";
        final String CONSULTA = "SELECT COUNT(*) FROM empleado WHERE categoria = ?";
        Scanner teclado = new Scanner(System.in);
        String dato;

        try ( Connection conexion = DriverManager.getConnection(DDBB, USER, PASSWORD);
            PreparedStatement ps = conexion.prepareStatement(CONSULTA)){
            System.out.println("Introduce la categoria: ");
            dato = teclado.nextLine();            
            ps.setString(1, dato);
            ResultSet rs = ps.executeQuery();
            rs.next();
            System.out.println("El número de empleados en esa categoria es: " + rs.getInt(1));
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode()
                    + "\nSLQState: " + e.getSQLState()
                    + "\nMensaje: " + e.getMessage());
        }
    }
}




