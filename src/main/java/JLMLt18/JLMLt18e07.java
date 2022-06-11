/*Realizar un programa que actualice el salario de los empleados para que no haya
ningún empleado que cobre menos de 1000 euros. (Hacerlo mediante UPDAT). El programa
informará de cuantos empleados se han visto afectados.
autor: jose luis mosquera losada
fecha: 5-06-2022*/

package JLMLt18;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class JLMLt18e07 {

    
    public static void main(String[] args) {
      
        ArrayList<Empleado> plantilla = new ArrayList<>();
        int contador = 0;

        final String DDBB = "jdbc:mysql://localhost:3306/empresa?useUnicode=true&useJDBCCompliantTimezoneShif=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String USER = "root";
        final String PASSWORD = "pepe";
        final String CONSULTA = "SELECT * FROM empleado";

        try ( Connection conexion = DriverManager.getConnection(DDBB, USER, PASSWORD);
              PreparedStatement ps = conexion.prepareStatement(CONSULTA, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getFloat(5) < 1000) {
                    rs.updateFloat(5, 1000);
                    rs.updateRow();
                    contador++;
                }
            }
        } catch (SQLException e) {
            System.out.println("CÃ³digo de Error: " + e.getErrorCode()
                    + "\nSLQState: " + e.getSQLState()
                    + "\nMensaje: " + e.getMessage());
        }
        for (Empleado e : plantilla) {
            System.out.println(e.toString());
        }
        System.out.println("Se han actualizado " + contador + " registros.");
    }
}








