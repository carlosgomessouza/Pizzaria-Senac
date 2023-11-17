package br.com.pizzeria.servelet;

import br.com.pizzeria.business.LoginBusiness;
import br.com.pizzeria.filter.AuthenticationFilter;
import br.com.pizzeria.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet({"/login", "/admin/login"})
public class LoginServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("login.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        var isLoggedOn = new AuthenticationFilter().isUserLoggedOn(request);

        if(isLoggedOn){
            response.sendRedirect("/product-list");
            return;
        }

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();

        user.setEmail(username);
        user.setPassword(password);

        boolean isValidUser = new LoginBusiness().verifyCredentials(user);

        if (isValidUser) {

            request.getSession().setAttribute("loggedUser", username);

            response.sendRedirect("/order-start");

        } else {

            request.setAttribute("message", "Invalid credentials!");

            request.getRequestDispatcher("view/login.jsp").forward(request, response);

        }

    }
}
