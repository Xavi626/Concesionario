package org.example.dao;

import org.example.entitiy.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {


    public List<User> findUsers(String username) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> userList = new ArrayList<>();

        try {
            // Establecer la conexión a la base de datos (asegúrate de que la conexión esté configurada correctamente)
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/server_java", "root", "260668Xavi");

            // Consulta SQL para buscar todos los usuarios
            String selectQuery = "SELECT id, username, password FROM ob_user";
            preparedStatement = connection.prepareStatement(selectQuery);

            // Ejecutar la consulta
            resultSet = preparedStatement.executeQuery();

            // Recorrer el conjunto de resultados y agregar usuarios a la lista
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return userList;
    }
}

