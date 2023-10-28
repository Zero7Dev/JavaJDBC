/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class GrabarEnBD {
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GrabarEnBD {
    public static void main(String[] args) {
        // Datos de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/tu_base_de_datos";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";

        try {
            // Establecer la conexión a la base de datos
            Connection connection = DriverManager.getConnection(url, usuario, contraseña);

            // Consulta SQL para insertar datos
            String sql = "INSERT INTO ejemplo (nombre, descripcion) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Valores a insertar
            String nombre = "Ejemplo";
            String descripcion = "Esto es un ejemplo";

            // Asignar los valores a los parámetros de la consulta
            statement.setString(1, nombre);
            statement.setString(2, descripcion);

            // Ejecutar la consulta
            statement.executeUpdate();

            System.out.println("Datos grabados en la base de datos.");

            // Cerrar la conexión
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

}    

