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

        final String CONSULTA = "SELECT COUNT(*) FROM empleado WHERE categoria = ?";
        Scanner scanner = new Scanner(System.in);

        try ( Connection conexion = DriverManager.getConnection(Constantes.BDURL, Constantes.USER, Constantes.PASS);
            PreparedStatement ps = conexion.prepareStatement(CONSULTA)){
            System.out.println("Introduce la categoria: ");
            String categoria = scanner.nextLine();
            ps.setString(1, categoria);
            ResultSet rs = ps.executeQuery();
            rs.next();
            System.out.println("El número de empleados en esa categoria es: " + rs.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




