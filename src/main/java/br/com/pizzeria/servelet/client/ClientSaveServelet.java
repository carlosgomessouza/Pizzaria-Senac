package br.com.pizzeria.servelet.client;
import br.com.pizzeria.business.ClientBusiness;
import br.com.pizzeria.model.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/client-save", "/admin/client-save"})

public class ClientSaveServelet extends  HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            String clientID = request.getParameter("clientID");
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String age = request.getParameter("age");
            String cpf = request.getParameter("cpf");
            String zipcode = request.getParameter("zipcode");
            String gender = request.getParameter("gender");
            String address = request.getParameter("address");
            String addressNumber = request.getParameter("addressNumber");

            Client client = new Client();

            if(clientID != null)
                client.setClientID(Integer.parseInt(clientID));
            client.setName(name);
            client.setSurname(surname);

            if(age != null)
                client.setAge(Integer.parseInt(age));

            client.setGender(gender);
            client.setCpf(cpf);
            client.setZipcode(zipcode);
            client.setAddress(address);
            if(addressNumber != null)
                client.setAddressNumber(Integer.parseInt(addressNumber));

            new ClientBusiness().clientSave(client);

            response.sendRedirect("/order-start");
        }catch (Exception ex){
            response.sendError(1, String.format("Erro: %s", ex));
        }
    }
}
