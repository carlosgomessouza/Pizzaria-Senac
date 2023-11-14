package br.com.pizzeria.business;

import br.com.pizzeria.dao.DaoHelper;
import br.com.pizzeria.model.User;

public class RegisterBusiness {

    private final User User;
    public RegisterBusiness(User user){
        this.User = user;
    }

    public void UserSave() throws Exception {
        DaoHelper.userSave(User);
    }

}
