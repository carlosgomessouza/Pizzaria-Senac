package br.com.pizzeria.business;

import br.com.pizzeria.dao.RegisterDao;
import br.com.pizzeria.model.User;

public class RegisterBusiness {

    private final User User;
    public RegisterBusiness(User user){
        this.User = user;
    }

    public void UserSave() throws Exception {
        RegisterDao.userSave(User);
    }

}
