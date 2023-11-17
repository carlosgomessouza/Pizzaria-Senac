package br.com.pizzeria.servelet.order;

import br.com.pizzeria.business.ClientBusiness;
import br.com.pizzeria.business.ProductBusiness;
import br.com.pizzeria.model.Client;
import br.com.pizzeria.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/order-start", "/admin/order-start"})
public class OrderStartServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Product> productList = new ProductBusiness().autoComplete();
            List<Client> clientList = new ClientBusiness().clientList();

            request.setAttribute("productList", productList);
            request.setAttribute("clientList", clientList);

            request.getRequestDispatcher("view/new-order.jsp").forward(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
