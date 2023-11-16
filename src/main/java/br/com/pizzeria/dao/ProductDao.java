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

            System.out.println("success in select * car");

            connection.close();

            return productList;
        }catch (Exception ex){
            System.out.println("fail in database connection");

            return Collections.emptyList();
        }
    }
}
