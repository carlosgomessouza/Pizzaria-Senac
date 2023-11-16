
package br.com.pizzeria.servelet;

import br.com.pizzeria.business.RegisterBusiness;
import br.com.pizzeria.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register-user")
public class RegisterServelet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            System.out.println("aqui");
            String userName = request.getParameter("name");
            String surname = request.getParameter("surname");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String cpf = request.getParameter("cpf");
            String password = request.getParameter("password");

            User user = new User();

            user.setUserName(userName);
            user.setUserName(surname);
            user.setUserName(phone);
            user.setUserName(email);
            user.setUserName(cpf);
            user.setUserName(password);

            new RegisterBusiness(user).UserSave();

            response.sendRedirect("/login");
        }catch (Exception ex){
            response.sendError(1, String.format("Erro: %s", ex));
        }
    }
}
