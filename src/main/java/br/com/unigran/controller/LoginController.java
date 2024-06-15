
package br.com.unigran.controller;

import br.com.unigran.DTO.LoginDTO;
import br.com.unigran.model.Login;
import br.com.unigran.persistencia.LoginDao;
import br.com.unigran.persistencia.LoginImp;
import java.util.List;

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

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(LoginDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public LoginDTO autenticaUsuario(String usuario, String senha) {
        return loginDao.autenticaUsuario(usuario, senha);
    }

    public LoginDTO buscaIdLogin(String id) {
        return loginDao.buscaIdDoLogin(Long.valueOf(id));
    }
    
}
