/* Partiendo de la clase Empleado definida previamente, crea una clase DAO con las 
operaciones de: 
Conexión a la base de datos, con patrón Singleton y fichero Properties con usuario/pass.
Buscar un empleado: se le pasará 'id' y devolverá boolean (encontrado y borrado o no)
Insertar empleado: se le pasarán todos los datos y devolverá boolean según lo haya encontrado o insertado o no.
Listar empleados: devuelve un ArrayList de Empleados, con todos los registros de la tabla
Finalmente, hacer un programa con un menú, que permita: buscar, borrar, insertar y listra, empleando la clase anterior
autor: jose luis mosquera losada
fecha: 6-06-2022 */
package JLMLt18;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class JLMLt18e11 {

    public static void main(String[] args) {

        String dato, entrada;
        int opcion;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);

        try {
            while (!salir) {
                System.out.println("Menú de opciones: ");
                System.out.println("1 Listar empleado");
                System.out.println("2 Añadir empleado");
                System.out.println("3 Eliminar empleado");
                System.out.println("4 Buscar empleado");
                System.out.println("0 Salir");
                System.out.println("Escoge una opcion: ");
                entrada = teclado.nextLine();
                opcion = Integer.parseInt(entrada);
                switch (opcion) {
                    case 1:
                         try {
                        EmpleadoDAO empleadoDAO = EmpleadoDAO.getInstance();
                        for (Empleado e : empleadoDAO.findAll()) {
                            System.out.println(e.toString());
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (IOException ex) {
                        Logger.getLogger(JLMLt18e11.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                    case 2:
                        try {
                        EmpleadoDAO empleadoDAO = EmpleadoDAO.getInstance();
                        empleadoDAO.insert(new Empleado(19, "Ana PÃ©rez", LocalDate.of(2019, 5, 19), "Analista", 2000));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (IOException ex) {
                        Logger.getLogger(JLMLt18e11.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                    case 3:
                        System.out.println("Id del empleado a borrar: ");
                        dato = teclado.nextLine();
                        try {
                            EmpleadoDAO empleadoDAO = EmpleadoDAO.getInstance();
                            empleadoDAO.borrarEmpleado(dato);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (IOException ex) {
                            Logger.getLogger(JLMLt18e11.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;

                    case 4:
                        System.out.println("Introduce el Id del empleado: ");
                        dato = teclado.nextLine();
                        try {
                            EmpleadoDAO empleadoDAO = EmpleadoDAO.getInstance();
                            empleadoDAO.buscarEmpleado(dato);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (IOException ex) {
                            Logger.getLogger(JLMLt18e11.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 0:
                        salir = true;
                        System.out.println("Hasta pronto");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }

        } catch (Exception e) {
            System.out.println("Opcion no valida");
        }

    }
}


