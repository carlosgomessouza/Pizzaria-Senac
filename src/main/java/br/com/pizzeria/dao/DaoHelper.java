package br.com.pizzeria.dao;

import br.com.pizzeria.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoHelper {

    public static void userSave(User user) throws Exception {

        final String SQL = "INSERT INTO User (Name, Surname, Phone, CPF, Login, Password) VALUES (?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getPhone());
            preparedStatement.setString(4, user.getCPF());
            preparedStatement.setString(5, user.getEmail());
            preparedStatement.setString(6, user.getPassword());
            preparedStatement.execute();

            System.out.println("success in insert User");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            throw new Exception("Erro");
        }
    }
}
