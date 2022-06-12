/* Realizar un programa que actualice el salario de los empleados para que no haya
ningún empleado que cobre menos de 1100 euros. Hacerlo actualizando un ResultSet. 
A continuación, volver al principio ese ResultSet y mostrar nombre y salario de todos
los empleados
autor: jose luis mosquera losada
fecha: 15-05-2022 */
package JLMLt18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JLMLt18e10 {

    public static void main(String[] args) {

        ArrayList<Empleado> plantilla = new ArrayList<>();
        int contador = 0;

        final String CONSULTA = "SELECT * FROM empleado";

        try ( Connection conexion = DriverManager.getConnection(Constantes.BDURL, Constantes.USER, Constantes.PASS);
              PreparedStatement ps = conexion.prepareStatement(CONSULTA, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getFloat(5) < 1100) {
                    rs.updateFloat(5, 1100);
                    rs.updateRow();
                    contador++;
                }
            }
            rs.beforeFirst();
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString(2) + " salario: " + rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Empleado empleado : plantilla) {
            System.out.println(empleado);
        }
        System.out.println("Se han actualizado " + contador + " registros.");
    }
}

