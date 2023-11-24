package br.com.pizzeria.servelet.order;
import br.com.pizzeria.business.ClientBusiness;
import br.com.pizzeria.business.OrderBusiness;
import br.com.pizzeria.business.ProductBusiness;
import br.com.pizzeria.model.Client;
import br.com.pizzeria.model.Order;
import br.com.pizzeria.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet({"/order-save", "/admin/order-save"})
public class OrderSaveServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String productID = request.getParameter("productID");
        String clientID = request.getParameter("clientID");
        String amount = request.getParameter("amount");
        String discount = request.getParameter("discount");

        try {
            Product productOrder = new ProductBusiness().get(Integer.parseInt(productID));
            Client clientOrder = new ClientBusiness().clientGet(Integer.parseInt(clientID));

            Order order = new Order();

            order.setClientOrder(clientOrder);
            order.setProductOrder(productOrder);
            order.setAmount(Integer.parseInt(amount));

            new OrderBusiness().orderSave(order);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
