/* Realizar un programa que elimine de la tabla a los mayores de 60 años.(Haciendolo
mediante DELETE). El programa informará de cuantos empleados se han visto afectados.
autor: jose luis mosquera losada
fecha: 15-05-2022 */
package JLMLt18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class JLMLt18e09 {

    public static void main(String[] args) {

        final String DDBB = "jdbc:mysql://localhost:3306/empresa?useUnicode=true&useJDBCCompliantTimezoneShif=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String USER = "root";
        final String PASSWORD = "pepe";
        final String CONSULTA = "SELECT * FROM empleado";

        try (Connection conexion = DriverManager.getConnection(DDBB, USER, PASSWORD);
                PreparedStatement ps = conexion.prepareStatement(CONSULTA, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if ((LocalDate.now().getYear() - LocalDate.parse(rs.getString(3)).getYear()) > 60) {
                    System.out.println("Borrado registro: " + rs.getString(2));
                    rs.deleteRow();
                }
            }
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode()
                    + "\nSLQState: " + e.getSQLState()
                    + "\nMensaje: " + e.getMessage());
        }
    }
}
