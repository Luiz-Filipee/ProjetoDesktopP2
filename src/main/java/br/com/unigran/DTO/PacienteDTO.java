
package br.com.unigran.DTO;

import br.com.unigran.model.Agendamento;
import br.com.unigran.model.Consulta;
import br.com.unigran.model.Paciente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PacienteDTO extends GenericoDTO<Paciente>{
    
    public String nome;
    public String cpf;
    public Date dataNascimento;
    public String convenios;
    public String email;
    public String responsavel;
    public ContatoDTO contato;
    public ProntuarioDTO prontuario;
    public List<ConsultaDTO> consultas;
    public List<AgendamentoDTO> agendamentos;
    public EnderecoDTO endereco;
    
    
    @Override
    public Paciente builder(){
        Paciente paciente = new Paciente();
        paciente.setNome(this.nome);
        paciente.setCpf(this.cpf);
        paciente.setDataNascimento(this.dataNascimento);
        paciente.setConvenios(this.convenios);
        paciente.setEmail(this.email);
        paciente.setResponsavel(this.responsavel);
        if(contato != null){
            paciente.setContato(contato.builder());
        }
        if(prontuario != null){
            paciente.setProntuario(prontuario.builder());
        }
       if(consultas != null && !consultas.isEmpty()){
            List<Consulta> consultaEntidades = new ArrayList<>();
            for (ConsultaDTO consultaDTO : consultas){
                consultaEntidades.add(consultaDTO.builder());
            }
            paciente.setConsultas(consultaEntidades);
        }
        if(agendamentos != null && !agendamentos.isEmpty()){
            List<Agendamento> agendamentoEntidades = new ArrayList<>();
            for (AgendamentoDTO agendamentoDTO : agendamentos){
                agendamentoEntidades.add(agendamentoDTO.builder());
            }
            paciente.setAgendamentos(agendamentoEntidades);
        }
        if(endereco != null){
            paciente.setEndereco(endereco.builder());
        }
        return paciente;
    }
}
