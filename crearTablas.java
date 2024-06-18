package examen.examen;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class crearTablas {
    public static void main(String[] args) {
        // Datos de conexión al servidor MySQL sin especificar la base de datos
        String urlSinDB = "jdbc:mysql://localhost:3306";
        String url;
        String usuario = "root"; // Tu usuario de MySQL
        String contrasena = ""; // Tu contraseña de MySQL

        try {
            // Conectar al servidor MySQL sin una base de datos específica
            Connection conexion = DriverManager.getConnection(urlSinDB, usuario, contrasena);
            Statement statement = conexion.createStatement();

            // Crear la base de datos Biblioteca si no existe
            String sql = "CREATE DATABASE IF NOT EXISTS Biblioteca";
            statement.executeUpdate(sql);
            System.out.println("Base de datos creada o ya existente.");

            // Cerrar la conexión inicial
            statement.close();
            conexion.close();
            // Conectar a la base de datos Biblioteca
            url = "jdbc:mysql://localhost:3306/Biblioteca";
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            statement = conexion.createStatement();
/* 
            // Crear tabla Colecciones
            sql = "CREATE TABLE IF NOT EXISTS Colecciones (" +
                    "id_coleccion INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nombre VARCHAR(255), " +
                    "nivelAcceso VARCHAR(255))";
                    
            statement.executeUpdate(sql);
            System.out.println("Tabla Colecciones creada con éxito.");

            // Crear tabla recursosDigitales
            sql = "CREATE TABLE IF NOT EXISTS recursosDigitales (" +
                    "id_recurso INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nombre VARCHAR(255), " +
                    "descripcion VARCHAR(255), " +
                    "formato ENUM('PDF', 'VIDEO', 'AUDIO'))";
                    
            statement.executeUpdate(sql);
            System.out.println("Tabla recursosDigitales creada con éxito.");
            */
            // Crear tabla libros
            sql = "CREATE TABLE IF NOT EXISTS libros (" +
                    "id_libro INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nombre VARCHAR(255)"+
                    "FOREIGN KEY (id_coleccion) REFERENCES Colecciones(id_coleccion))";
                    
            statement.executeUpdate(sql);
            System.out.println("Tabla libros creada con éxito.");
              
            statement.close();
            conexion.close();
            

        } catch (SQLException e) {
        }
    }
}
