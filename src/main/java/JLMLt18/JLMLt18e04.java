/*Crear una clase llamada Empleado cuyos atributos privados son los campos de la 
tabla 'Empleado', añádele un constructor con todos los campos, getters, setters y 
método toString(). Realizar un programa que cargue un ArrayList de clase Empleado
con todos los empleados de la tabla. Mostrar a continuación todo el contenido del ArrayList.
autor: jose luis mosquera losada
fecha: 5-06-2022 */
package JLMLt18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class JLMLt18e04 {

    
    public static void main(String[] args) {
      
       ArrayList <Empleado> plantilla = new ArrayList<>();

        final String DDBB = "jdbc:mysql://localhost:3306/empresa?useUnicode=true&useJDBCCompliantTimezoneShif=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String USER = "root";
        final String PASSWORD = "pepe";
        final String CONSULTA = "SELECT * FROM empleado";

        try ( Connection conexion = DriverManager.getConnection(DDBB, USER, PASSWORD);
            PreparedStatement ps = conexion.prepareStatement(CONSULTA)){            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId(rs.getInt(1));
                empleado.setNombre(rs.getString(2));
                empleado.setCategoria(rs.getString(4));
                empleado.setSalario(rs.getFloat(5));
                plantilla.add(empleado);
            }
        } catch (SQLException e) {
            System.out.println("Código de Error: " + e.getErrorCode()
                    + "\nSLQState: " + e.getSQLState()
                    + "\nMensaje: " + e.getMessage());
        }
        for(Empleado e:plantilla){
            System.out.println(e.toString());
        }
        
    }
}





