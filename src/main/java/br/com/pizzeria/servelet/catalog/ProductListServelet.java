package br.com.pizzeria.servelet.catalog;

import br.com.pizzeria.business.ProductBusiness;
import br.com.pizzeria.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/product-list", "/admin/product-list"})
public class ProductListServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            var requestPlace = request.getQueryString();
            System.out.println(requestPlace);
            List<Product> productList = new ProductBusiness().autoComplete();

            request.setAttribute("productList", productList);
            if(requestPlace != null && requestPlace.equals("requestPlace=index"))
            {
                request.getRequestDispatcher("home.jsp").forward(request, response);
                return;
            }
            request.getRequestDispatcher("view/product-list.jsp").forward(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
