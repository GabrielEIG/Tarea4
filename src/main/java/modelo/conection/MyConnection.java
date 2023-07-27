package modelo.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    // Datos de tu base de datos MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/users_db";
    private static final String USER = "root";
    private static final String PASSWORD = "gabriel123321.";

    // Conexión a la base de datos
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(connection);
            System.out.println("Conexión exitosa a la base de datos MySQL");
        } catch (SQLException e) {
            System.err.println("Error al establecer la conexión a la base de datos: " + e.getMessage());
        }
        return connection;
    }

}
