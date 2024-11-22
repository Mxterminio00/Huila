
package Funciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexiónBD {

    // Cambia estos valores según tu configuración de base de datos
    private static final String URL = "jdbc:mariadb://127.0.0.1:3306/escuela";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Método para obtener una conexión a la base de datos
    public static Connection con() {
        Connection conexion = null;
        try {
            // Cargar el driver de MySQL
            Class.forName("org.mariadb.jdbc.Driver");
            // Establecer la conexión
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        return conexion;
    }
}
