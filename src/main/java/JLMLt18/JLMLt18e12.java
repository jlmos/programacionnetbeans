/* Repite el primer ejercicio de este bloque sobre la base de datos SQLite empresa.db
proporcionada por el profesor. Obviamente, no hará falta el MySQL para este ejercicio.
autor: jose luis mosquera losada
fecha: 6-06-2022 */
package JLMLt18;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JLMLt18e12 {

    public static void main(String[] args) {

        final String CONSULTA = "SELECT nombre FROM empleado";
        
        try (Connection conexion = DriverManager.getConnection("jdbc:sqlite:archivos" + File.separator + "empresa.db");
            PreparedStatement ps = conexion.prepareStatement(CONSULTA)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Empleado " + rs.getRow() + " nombre: " + rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


