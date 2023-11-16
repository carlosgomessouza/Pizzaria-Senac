package br.com.pizzeria.servelet;

import br.com.pizzeria.business.LoginBusiness;
import br.com.pizzeria.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("login.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();

        user.setUserName(username);
        user.setPassword(password);

        boolean isValidUser = new LoginBusiness().verifyCredentials(user);

        if (isValidUser) {

            request.getSession().setAttribute("loggedUser", username);

            request.getRequestDispatcher("novoPedido.html").forward(request, response);

        } else {

            request.setAttribute("message", "Invalid credentials!");

            request.getRequestDispatcher("login.jsp").forward(request, response);

        }

    }
}
