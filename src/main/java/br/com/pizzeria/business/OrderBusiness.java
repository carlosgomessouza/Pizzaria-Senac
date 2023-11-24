package br.com.pizzeria.business;

import br.com.pizzeria.dao.OrderDao;
import br.com.pizzeria.model.Order;

import java.util.List;

public class OrderBusiness {

    public void orderSave(Order order) throws Exception {
         OrderDao.orderInsert(order);
    }

    public List<Order> orderList() throws Exception {
        return OrderDao.orderList();
    }
}
