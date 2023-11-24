package br.com.pizzeria.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.pizzeria.config.ConnectionPoolConfig;
import br.com.pizzeria.model.Product;

public class ProductDao {

    public static List<Product> productAutoComplete(){

        final String SQL = "SELECT * FROM Product";

        try{
            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Product> productList = new ArrayList<>();

            while (resultSet.next()) {

                String name = resultSet.getString("Name");
                int productID = resultSet.getInt("ProductID");
                float cost = resultSet.getFloat("Cost");
                float value = resultSet.getFloat("ProductValue");
                int currentStock = resultSet.getInt("CurrentStock");
                int productType = resultSet.getInt("ProductTypeID");

                Product product = new Product();

                product.setName(name);
                product.setProductID(productID);
                product.setCost(cost);
                product.setValue(value);
                product.setCurrentStock(currentStock);
                product.setProductType(productType);

                productList.add(product);
            }

            connection.close();

            return productList;
        }catch (Exception ex){
            return Collections.emptyList();
        }
    }

    public static Product get(int productID) throws Exception {

        final String SQL = "SELECT * FROM Product WHERE ProductID = ?";

        try{
            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, productID);
            ResultSet resultSet = preparedStatement.executeQuery();

            Product product = new Product();

            while (resultSet.next()) {

                String name = resultSet.getString("Name");
                productID = resultSet.getInt("ProductID");
                float cost = resultSet.getFloat("Cost");
                float value = resultSet.getFloat("ProductValue");
                int currentStock = resultSet.getInt("CurrentStock");
                int productType = resultSet.getInt("ProductTypeID");


                product.setName(name);
                product.setProductID(productID);
                product.setCost(cost);
                product.setValue(value);
                product.setCurrentStock(currentStock);
                product.setProductType(productType);

            }

            connection.close();

            return product;
        }catch (Exception ex){
            System.out.println("fail in database connection" + ex.getMessage());
            throw new Exception("Erro");
        }
    }
    public static void productInsert(Product product) throws Exception {
        final String SQL = "INSERT INTO " +
                "Product" +
                "(Name, Cost, ProductValue, CurrentStock, ProductTypeID) " +
                "VALUES (?, ?, ?, ?, ?)";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, product.getName());
            preparedStatement.setFloat(2, product.getCost());
            preparedStatement.setFloat(3, product.getValue());
            preparedStatement.setInt(4, product.getCurrentStock());
            preparedStatement.setInt(5, product.getProductType());

            preparedStatement.execute();

            connection.close();

        } catch (Exception e) {
            throw new Exception("Erro");
        }
    }
}
