package br.com.pizzeria.servelet.client;

import br.com.pizzeria.business.ClientBusiness;
import br.com.pizzeria.business.ProductBusiness;
import br.com.pizzeria.model.Client;
import br.com.pizzeria.model.Product;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/client-get", "/admin/client-get"})

public class ClientGetServelet extends HttpServlet {
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String clientID = request.getParameter("clientID");
        if(clientID == null){
            request.setAttribute("message", "item sem id!");
            request.getRequestDispatcher("view/new-order.jsp").forward(request, response);
        }

        try {
            Client client = new ClientBusiness().clientGet(Integer.parseInt(clientID));

            String clientJsonString = this.gson.toJson(client);

            PrintWriter out = response.getWriter();
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            out.print(clientJsonString);
            out.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
