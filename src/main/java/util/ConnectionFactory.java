package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/time_mania";
    public static final String USER = "root";
    public static final String PASS = "";

    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            throw new RuntimeException("erro na conexão com banco de dados", ex);
           
            //return null;
        }

    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("erro ao fechar a conexão com o banco de dados", ex);
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();

            }
        } catch (Exception ex) {
            throw new RuntimeException("erro ao fechar a conexão com o banco de dados", ex);
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement,
            ResultSet resultset) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();

            }
            if (resultset != null) {
                resultset.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("erro ao fechar a conexão com o banco de dados", ex);
        }
    }

}