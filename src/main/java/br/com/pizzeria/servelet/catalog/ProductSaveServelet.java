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
@WebServlet({"/product-save", "/admin/product-save"})
public class ProductSaveServelet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            String productID = request.getParameter("productID");
            String name = request.getParameter("name");
            String cost = request.getParameter("cost");
            String value = request.getParameter("value");
            String currentStock = request.getParameter("currentStock");
            String productType = request.getParameter("productType");

            Product product = new Product();

            if(productID != null)
                product.setProductID(Integer.parseInt(productID));
            product.setName(name);
            if(cost != null)
                product.setCost(Float.parseFloat(cost));
            if(value != null)
                product.setValue(Float.parseFloat(value));
            if(currentStock != null)
                product.setCurrentStock(Integer.parseInt(currentStock));
            if(productType != null)
                product.setProductType(Integer.parseInt(productType));

            new ProductBusiness().productSave(product);

            response.sendRedirect("/product-list");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
