package br.com.pizzeria.servelet.catalog;
import br.com.pizzeria.business.ProductBusiness;
import br.com.pizzeria.model.Product;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet({"/product-get", "/admin/product-get"})
public class ProductGetServelet extends  HttpServlet {
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productID = request.getParameter("productID");
        System.out.println(productID);
        if(productID == null){
            request.setAttribute("message", "item sem id!");
            request.getRequestDispatcher("view/new-order.jsp").forward(request, response);
        }

        try {
            Product product = new ProductBusiness().get(Integer.parseInt(productID));

            String productJsonString = this.gson.toJson(product);

            PrintWriter out = response.getWriter();
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            out.print(productJsonString);
            out.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
