package br.com.pizzeria.business;

import br.com.pizzeria.dao.ClientDao;
import br.com.pizzeria.model.Client;

import java.util.List;


public class ClientBusiness {

    public List<Client> clientList(){
        return ClientDao.clientList();
    }
    public Client clientGet(int clientID) throws Exception {
        return ClientDao.clientGet(clientID);
    }
}
