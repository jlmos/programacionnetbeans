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

        final String CONSULTA = "SELECT nombre FROM empleado";

        try (
                Connection conexion = DriverManager.getConnection( Constantes.BDURL, Constantes.USER, Constantes.PASS);
                PreparedStatement ps = conexion.prepareStatement(CONSULTA)
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Nombre empleado " + rs.getRow() + ": " + rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


