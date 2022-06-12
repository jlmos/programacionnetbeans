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
import java.util.List;


public class JLMLt18e07 {

    
    public static void main(String[] args) {
      
        List<Empleado> plantilla = new ArrayList<>();
        int contador = 0;

        final String CONSULTA = "SELECT * FROM empleado";

        try (
                Connection conexion = DriverManager.getConnection(Constantes.BDURL, Constantes.USER, Constantes.PASS);
                PreparedStatement ps = conexion.prepareStatement(CONSULTA, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getFloat(5) < 1000) {
                    rs.updateFloat(5, 1000);
                    rs.updateRow();
                    contador++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Empleado e : plantilla) {
            System.out.println(e.toString());
        }
        System.out.println("Se han actualizado " + contador + " registros.");
    }
}








