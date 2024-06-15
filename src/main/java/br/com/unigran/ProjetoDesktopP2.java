package br.com.unigran;

import br.com.unigran.DTO.AdministradorDTO;
import br.com.unigran.DTO.ConsultaDTO;
import br.com.unigran.DTO.DentistaDTO;
import br.com.unigran.DTO.FuncaoDTO;
import br.com.unigran.DTO.GerenteClinicaDTO;
import br.com.unigran.DTO.LoginDTO;
import br.com.unigran.DTO.MaterialDTO;
import br.com.unigran.DTO.PacienteDTO;
import br.com.unigran.controller.AdministradorController;
import br.com.unigran.controller.AgendamentoController;
import br.com.unigran.controller.CidadeController;
import br.com.unigran.controller.ConsultaController;
import br.com.unigran.controller.ContatoController;
import br.com.unigran.controller.DentistaController;
import br.com.unigran.controller.EnderecoController;
import br.com.unigran.controller.EstadoController;
import br.com.unigran.controller.FuncaoController;
import br.com.unigran.controller.GerenteClinicaController;
import br.com.unigran.controller.LoginController;
import br.com.unigran.controller.MaterialController;
import br.com.unigran.controller.PacienteController;
import br.com.unigran.controller.ProntuarioController;
import br.com.unigran.controller.RecepcionistaController;
import br.com.unigran.util.PainelInterface;
import br.com.unigran.views.app.TelaPrincipal;
import br.com.unigran.views.cadastro.Cadastro;
import java.util.List;

public class ProjetoDesktopP2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        
//        AdministradorController administradorController = new AdministradorController();
//        AgendamentoController agendamentoController = new AgendamentoController();
//        CidadeController cidadeController = new CidadeController();
//        ContatoController contatoController = new ContatoController();
//        DentistaController dentistaController = new DentistaController();
//        EnderecoController enderecoController = new EnderecoController();
//        EstadoController estadoController = new EstadoController();
//        MaterialController materialController = new MaterialController();
//        FuncaoController funcaoController = new FuncaoController();
//        GerenteClinicaController gerenteClinicaController = new GerenteClinicaController();
        LoginController loginController = new LoginController();
//        PacienteController pacienteController = new PacienteController();
//        ProntuarioController prontuarioController = new ProntuarioController();
//        RecepcionistaController recepcionistaController = new RecepcionistaController();
//        ConsultaController consultaController = new ConsultaController();
//        
//
//        DentistaDTO dentistaDTO = new DentistaDTO();
//        FuncaoDTO funcaoDTO = new FuncaoDTO();
//        PacienteDTO paciente = new PacienteDTO();
//        MaterialDTO materialDTO = new MaterialDTO();
//        GerenteClinicaDTO gerente  = new GerenteClinicaDTO();
//        AdministradorDTO administradorDTO = new AdministradorDTO();
//        ConsultaDTO consultaDTO = new ConsultaDTO();
//        ConsultaDTO consultaDTO2 = new ConsultaDTO();
//
//        
//        administradorDTO.nome = "Rogerio";
//        administradorController.salvar(administradorDTO);
//
//        
//        funcaoDTO.nome = "Dentista";
//        funcaoDTO.descricao = "Trabalho com dente";
//        funcaoController.salvar(funcaoDTO);
//        
       
//
//        dentistaDTO.nomeDentista = "Filipe Kato";
//        dentistaDTO.login = loginDTO;
//        dentistaDTO.nomeDentista = "Filipe";
//        dentistaController.salvar(dentistaDTO);
//
//        gerente.nome = "fernando";
//        gerente.login = loginDTO;
//        gerenteClinicaController.salvar(gerente);
//        
//        materialDTO.nome = "pinça";
//        materialDTO.gerente = gerente;
//        materialController.salvar(materialDTO);
//        
//        paciente.nome = "Filipe";
//        paciente.email = "luizkato8@gmail.com";
//        paciente.responsavel = "Pai";
//
//        List<ConsultaDTO> listaConsultas = consultaController.listar();
//        
//        consultaDTO.dentista = dentistaDTO;
//        consultaDTO.paciente = paciente;
//        consultaDTO.valor = 100.0;
//        
//        consultaController.salvar(consultaDTO);
//        
//        paciente.consultas = listaConsultas;
//                
//        paciente.consultas = listaConsultas;
//        pacienteController.salvar(paciente);
//        
//        pacienteController.remove(paciente);

        FuncaoController fc = new FuncaoController();
        FuncaoDTO funcaoDentista = new FuncaoDTO();
        FuncaoDTO funcaoPaciente = new FuncaoDTO();
        FuncaoDTO funcaoGerente = new FuncaoDTO();
        FuncaoDTO funcaoRecepcionista = new FuncaoDTO();
        
        funcaoDentista.nome = "Denstista";
        funcaoDentista.descricao = "Profissional que realiza procedimentos odontologicos";
        
        funcaoPaciente.nome = "Paciente";
        funcaoPaciente.descricao = "Cliente da clinica";
        
        funcaoGerente.nome = "Gerente";
        funcaoGerente.descricao = "Gerencia a clinica";
        
        funcaoRecepcionista.nome = "Funcionario";
        funcaoRecepcionista.descricao = "Funcionario da clinica";
        
        fc.salvar(funcaoDentista);
        fc.salvar(funcaoPaciente);
        fc.salvar(funcaoGerente);
        fc.salvar(funcaoRecepcionista);
        
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.loginUsername = "dentista@gmail.com";
        loginDTO.senha = "dentista123";
        loginDTO.funcao = funcaoDentista;
        loginController.salvar(loginDTO);
 
        
        new TelaPrincipal().setVisible(true);

    }
}
