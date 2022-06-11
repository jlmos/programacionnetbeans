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

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;



/**
 *
 * @author ESTUDIOS
 */
public class Dao {

    private Integer id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String categoria;
    private Float salario;

    public Dao(Integer id, String nombre, LocalDate fechaNacimiento, String categoria, Float salario) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String texto = "Nombre " + this.nombre
                + "\n\tCategoria: " + this.categoria + ",  salario: " + this.salario
                + ", fecha de nacimiento: " + this.fechaNacimiento;
        return texto;
    }

    private static Dao instance = null;
    private Connection con = null;

    private Dao() throws SQLException, IOException {
        String JDBC_URL = "jdbc:mysql://localhost:3306/empresa?useUnicode=true&useJDBCCompliantTimezoneShif=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        if (con == null) {
            Properties props = new Properties();
            props.load(new FileInputStream(".\\Archivos\\login.props"));
            String usuario = props.getProperty("user");
            String password = props.getProperty("password");
            con = DriverManager.getConnection(JDBC_URL,"root","carlos");
        }
    }

    public static Dao getInstance() throws SQLException, IOException {
        if (instance == null) {
            instance = new Dao();
        }
        return instance;
    }

    public int insert(Empleado e) throws SQLException {
        int cantFilas;
        PreparedStatement ps;
        ps = con.prepareStatement("INSERT INTO empleado (id, nombre, fechaNacimiento, categoria, salario) VALUES (?, ?, ?, ? , ?)");
        ps.setInt(1, e.getId());
        ps.setString(2, e.getNombre());
        ps.setDate(3, e.getFechaNacimiento());
        ps.setString(4, e.getCategoria());
        ps.setFloat(5, e.getSalario());
        cantFilas = ps.executeUpdate();
        ps.close();
        return cantFilas;
    }

    public List<Empleado> findAll() throws SQLException {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM empleado");
        ResultSet rs = ps.executeQuery();
        List<Empleado> result = new ArrayList<>();
        while (rs.next()) {
            result.add(new Empleado(rs.getInt("id"), rs.getString("nombre"), rs.getLocalDate("fechaNacimiento"), rs.getString("categoria"), rs.getFloat("salario")));
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

