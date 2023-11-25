package br.com.pizzeria.servelet.order;

import br.com.pizzeria.business.OrderBusiness;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet({"/order-delete", "/admin/order-delete"})
public class OrderDeleteServelet extends  HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String orderID = request.getParameter("orderID");

        new OrderBusiness().orderDelete(Integer.parseInt(orderID));

        response.sendRedirect("/order-list");
    }
}
