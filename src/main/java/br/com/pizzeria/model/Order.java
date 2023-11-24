package br.com.pizzeria.model;

public class Order {

    private Product productOrder;
    private Client clientOrder;
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private float discount;

    private float total;

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }


    public Product getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(Product productOrder) {
        this.productOrder = productOrder;
    }

    public Client getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(Client clientOrder) {
        this.clientOrder = clientOrder;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
