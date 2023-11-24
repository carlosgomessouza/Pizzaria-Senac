package br.com.pizzeria.servelet.client;

import br.com.pizzeria.business.ClientBusiness;
import br.com.pizzeria.model.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/client-list", "/admin/client-list"})
public class ClientListServelet extends  HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Client> clientList = new ClientBusiness().clientList();

            request.setAttribute("clientList", clientList);

            request.getRequestDispatcher("view/client-list.jsp").forward(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
