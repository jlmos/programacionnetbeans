/*Realizar un programa que solicita al usuario una fecha y obtenga de la base 
de datos los empleados nacidos después de esa fecha y muestre su nombre y edad.
autor: jose luis mosquera losada
fecha: 5-06-2022 */
package JLMLt18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class JLMLt18e02 {

    
    public static void main(String[] args) {
      
       final String DDBB = "jdbc:mysql://localhost:3306/empresa?useUnicode=true&useJDBCCompliantTimezoneShif=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String USER = "root";
        final String PASSWORD = "pepe";
        final String CONSULTA = "SELECT nombre, fechaNacimiento FROM empleado WHERE fechaNacimiento > ?";
        Scanner teclado = new Scanner(System.in);
        String fecha;
        
        try ( Connection conexion = DriverManager.getConnection(DDBB, USER, PASSWORD);
            PreparedStatement ps = conexion.prepareStatement(CONSULTA)){
            System.out.println("Introduce la fecha aaaa-mm-dd : ");
            fecha = teclado.next();            
            ps.setString(1, fecha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString(1) + "    Fecha de nacimiento: " + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("Códdigo de Error: " + e.getErrorCode()
                    + "\nSLQState: " + e.getSQLState()
                    + "\nMensaje: " + e.getMessage());
        }
    }
}



