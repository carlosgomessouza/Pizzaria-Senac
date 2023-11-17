package br.com.pizzeria.dao;

import br.com.pizzeria.model.User;
import br.com.pizzeria.config.ConnectionPoolConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class RegisterDao {

    public static void userSave(User user) throws Exception {

        final String SQL = "INSERT INTO USR (UserName, Surname, Phone, CPF, Login, Password, DateCreated) VALUES (?, ?, ?, ?, ?, ?, NOW())";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            java.util.Date dt = new java.util.Date();

            java.text.SimpleDateFormat sdf =
                    new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String currentTime = sdf.format(dt);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getPhone());
            preparedStatement.setString(4, user.getCPF());
            preparedStatement.setString(5, user.getEmail());
            preparedStatement.setString(6, user.getPassword());
            preparedStatement.execute();

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection" + e.getMessage());
            throw new Exception("Erro");
        }
    }
}
