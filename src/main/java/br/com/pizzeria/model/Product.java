package br.com.pizzeria.model;

import br.com.pizzeria.enums.ProductTypeEnum;

public class Product {
    private int productID;
    private String name;
    private float cost;
    private float value;
    private int currentStock;
    private ProductTypeEnum productType;

    public String getName() {
        return name;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public int getProductType() {

        switch (productType)
        {
            case SMALL -> {
                return 1;
            }
            case MEDIUM -> {
                return 2;
            }
            case BIG -> {
                return 3;
            }
            case NotFound -> {
                return  0;
            }
        }

        return  0;
    }

    public void setProductType(int productType) {

        switch (productType)
        {
            case 1 ->{
                this.productType = ProductTypeEnum.SMALL;
            }
            case 2 ->{
                this.productType = ProductTypeEnum.MEDIUM;
            }
            case 3 ->{
                this.productType = ProductTypeEnum.BIG;
            }
            default -> {
                this.productType = ProductTypeEnum.NotFound;
            }
        }
    }

}
