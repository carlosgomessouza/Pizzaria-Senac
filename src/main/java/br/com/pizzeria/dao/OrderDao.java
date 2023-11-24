package br.com.pizzeria.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.pizzeria.config.ConnectionPoolConfig;
import br.com.pizzeria.model.Client;
import br.com.pizzeria.model.Order;
public class OrderDao {
    public static void orderInsert(Order order) throws Exception {
        final String SQL = "INSERT INTO " +
                "Orders" +
                "(Name, Total, Discount, ZipCode, Address, AddressNumber, OrderDate) " +
                "VALUES (?, ?, ?, ?, ?, ?, NOW());" +
                "INSERT INTO OrderProduct(NameOrder, ValueOrder, ProductAmount)VALUES(?, ?, ?)";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, "Pedido de venda");
            preparedStatement.setFloat(2, order.getTotal());
            preparedStatement.setFloat(3, order.getDiscount());
            preparedStatement.setString(4, order.getClientOrder().getZipcode());
            preparedStatement.setString(5, order.getClientOrder().getAddress());
            preparedStatement.setInt(6, order.getClientOrder().getAddressNumber());
            preparedStatement.setString(7, order.getProductOrder().getName());
            preparedStatement.setFloat(8, order.getProductOrder().getValue());
            preparedStatement.setInt(9, order.getAmount());


            preparedStatement.execute();

            connection.close();

        } catch (Exception e) {
            throw new Exception("Erro");
        }
    }

    public static List<Order> orderList(){
        String SQL = "SELECT * FROM Orders";

        try{
            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Order> orderList = new ArrayList<>();

            while (resultSet.next()) {
                int orderID = resultSet.getInt("OrderID");
                String name = resultSet.getString("Name");
                float total = resultSet.getInt("Total");


                Order order = new Order();

                order.setTotal(total);
                order.setName(name);

                orderList.add(order);
            }

            connection.close();

            return orderList;
        }catch (Exception ex){
            return Collections.emptyList();
        }


    }
}
