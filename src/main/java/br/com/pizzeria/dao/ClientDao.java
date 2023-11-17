package br.com.pizzeria.dao;

import br.com.pizzeria.config.ConnectionPoolConfig;
import br.com.pizzeria.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientDao {
    public static List<Client> clientList(){

        final String SQL = "SELECT * FROM Client";

        try{
            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Client> clientList = new ArrayList<>();

            while (resultSet.next()) {
                int clientID = resultSet.getInt("ClientID");

                String name = resultSet.getString("Name");
                String surname = resultSet.getString("Surname");
                int age = resultSet.getInt("Age");
                String cpf = resultSet.getString("CPF");
                String gender = resultSet.getString("Gender");
                String zipcode = resultSet.getString("Zipcode");
                String address = resultSet.getString("Address");
                int addressNumber = resultSet.getInt("AddressNumber");

                Client client = new Client();

                client.setClientID(clientID);
                client.setName(name);
                client.setSurname(surname);
                client.setAge(age);
                client.setGender(gender);
                client.setCpf(cpf);
                client.setZipcode(zipcode);
                client.setAddress(address);
                client.setAddressNumber(addressNumber);

                clientList.add(client);
            }

            connection.close();

            return clientList;
        }catch (Exception ex){
            return Collections.emptyList();
        }
    }
    public static Client clientGet(int clientID) throws Exception {

        final String SQL = "SELECT * FROM Client WHERE ClientID = ?";

        try{
            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, clientID);

            ResultSet resultSet = preparedStatement.executeQuery();

            Client client = new Client();

            while (resultSet.next()) {

                String name = resultSet.getString("Name");
                String surname = resultSet.getString("Surname");
                int age = resultSet.getInt("Age");
                String cpf = resultSet.getString("CPF");
                String gender = resultSet.getString("Gender");
                String zipcode = resultSet.getString("Zipcode");
                String address = resultSet.getString("Address");
                int addressNumber = resultSet.getInt("AddressNumber");

                client.setName(name);
                client.setClientID(clientID);
                client.setSurname(surname);
                client.setAge(age);
                client.setGender(gender);
                client.setCpf(cpf);
                client.setZipcode(zipcode);
                client.setAddress(address);
                client.setAddressNumber(addressNumber);

            }

            connection.close();

            return client;
        }catch (Exception ex){
            System.out.println("fail in database connection" + ex.getMessage());
            throw new Exception("Erro");        }
    }
}
