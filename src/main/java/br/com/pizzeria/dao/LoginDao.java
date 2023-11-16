package br.com.pizzeria.dao;

import br.com.pizzeria.config.ConnectionPoolConfig;
import br.com.pizzeria.model.User;

import java.sql.*;

public class LoginDao {
    public static boolean verifyCredentials(User user) {

        String SQL = "SELECT * FROM USR WHERE Login = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, user.getEmail());
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("success in select username");

            while (resultSet.next()) {

                String password = resultSet.getString("password");

                if (password.equals(user.getPassword())) {

                    return true;

                }

            }

            connection.close();

            return false;

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

            return false;

        }

    }

}
