
package br.com.unigran.controller;

import br.com.unigran.DTO.LoginDTO;
import br.com.unigran.model.Login;
import br.com.unigran.persistencia.LoginDao;
import br.com.unigran.persistencia.LoginImp;

public class LoginController extends GenericoController<Login, LoginDTO>{
    
    private final LoginDao loginDao = new LoginImp();

    @Override
    protected LoginDao getDao() {
        return loginDao;
    }

    @Override
    protected Login builderEntity(LoginDTO dto) {
        return dto.builder();
    }
    
}
