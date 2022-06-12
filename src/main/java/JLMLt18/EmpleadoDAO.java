/*Partiendo de la clase Empleado definida previamente, crea una clase DAO con las 
operaciones de: 
Conexión a la base de datos, con patrón Singleton y fichero Properties con usuario/pass.
Buscar un empleado: se le pasará 'id' y devolverá boolean (encontrado y borrado o no)
Insertar empleado: se le pasarán todos los datos y devolverá boolean según lo haya encontrado o insertado o no.
Listar empleados: devuelve un ArrayList de Empleados, con todos los registros de la tabla
Finalmente, hacer un programa con un menú, que permita: buscar, borrar, insertar y listra, empleando la clase anterior
autor: jose luis mosquera losada
fecha: 6-06-2022 */

package JLMLt18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author ESTUDIOS
 */
public class EmpleadoDAO {

    private static EmpleadoDAO instance = null;
    private Connection con = null;

    private EmpleadoDAO() throws SQLException, IOException {
        if (con == null) {
            Properties props = new Properties();
            props.load(new FileInputStream("archivos" + File.separator + "datasource.properties"));
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String pass = props.getProperty("pass");
            con = DriverManager.getConnection(url,user,pass);
        }
    }

    public static EmpleadoDAO getInstance() throws SQLException, IOException {
        if (instance == null) {
            instance = new EmpleadoDAO();
        }
        return instance;
    }

    public int insert(Empleado empleado) throws SQLException {
        int cantFilas;
        PreparedStatement ps;
        ps = con.prepareStatement("INSERT INTO empleado (id, nombre, fechaNacimiento, categoria, salario) VALUES (?, ?, ?, ?, ?)");
        ps.setInt(1, empleado.getId());
        ps.setString(2, empleado.getNombre());
        ps.setDate(3, Date.valueOf(empleado.getFechaNacimiento()));
        ps.setString(4, empleado.getCategoria());
        ps.setFloat(5, empleado.getSalario());
        cantFilas = ps.executeUpdate();
        ps.close();
        return cantFilas;
    }

    public List<Empleado> findAll() throws SQLException {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM empleado");
        ResultSet rs = ps.executeQuery();
        List<Empleado> result = new ArrayList<>();
        while (rs.next()) {
            Empleado empleado = new Empleado();
            empleado.setId(rs.getInt("id"));
            empleado.setNombre(rs.getString("nombre"));
            empleado.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            empleado.setCategoria(rs.getString("categoria"));
            empleado.setSalario(rs.getFloat("salario"));
            result.add(empleado);
        }
        rs.close();
        ps.close();
        return result;
    }
    
    public void borrarEmpleado(String numero) throws SQLException {
        PreparedStatement ps = con.prepareStatement("DELETE FROM empleado WHERE id = ?");
         ps.setString(1,numero);
        int filas = ps.executeUpdate();
    }
    
     public void buscarEmpleado(String numero) throws SQLException {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM empleado WHERE id = ?");
         ps.setString(1,numero);
        ResultSet rs = ps.executeQuery();
         while (rs.next()) {
             System.out.println(rs.getString(2));
         }
    }

}

