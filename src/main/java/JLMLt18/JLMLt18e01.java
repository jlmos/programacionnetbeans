/*Realizar un programa que se conecte a la base de datos empresa y muestre 
el nombre de los empleados de la empresa
autor: jose luis mosquera losada
fecha: 5-06-2022 */
package JLMLt18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JLMLt18e01 {

    
    public static void main(String[] args) {
      
        final String DDBB = "jdbc:mysql://localhost:3306/empresa?useUnicode=true&useJDBCCompliantTimezoneShif=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String USER = "root";
        final String PASSWORD = "pepe";
        final String CONSULTA = "SELECT nombre FROM empleado";

        try ( Connection conexion = DriverManager.getConnection(DDBB, USER, PASSWORD);            
            PreparedStatement ps = conexion.prepareStatement(CONSULTA)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Empleado " + rs.getRow() + " nombre: " + rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode()
                    + "\nSLQState: " + e.getSQLState()
                    + "\nMensaje: " + e.getMessage());
        }
    }
}


