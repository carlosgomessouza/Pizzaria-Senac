package br.com.pizzeria.business;

import br.com.pizzeria.dao.LoginDao;
import br.com.pizzeria.model.User;

public class LoginBusiness {

    public boolean verifyCredentials(User user){
        return LoginDao.verifyCredentials(user);
    }
}
