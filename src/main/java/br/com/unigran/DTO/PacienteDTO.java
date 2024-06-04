
package br.com.unigran.DTO;

import br.com.unigran.model.Agendamento;
import br.com.unigran.model.Consulta;
import br.com.unigran.model.Paciente;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PacienteDTO extends GenericoDTO<Paciente>{
    
    public Long id;
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

    public PacienteDTO(Paciente paciente) {
        this.id = paciente.getId();
    }
    
    
    @Override
    public Paciente builder(){
        Paciente paciente = new Paciente();
        paciente.setId(this.id);
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
    
    @Override
    public List getListaDados(List<Paciente> dados) {
        List dadosDTO = new LinkedList();
        for (Paciente dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
    
    @Override
    public Object converte(Paciente paciente) {
        PacienteDTO dto= new PacienteDTO();
        dto.nome = paciente.getNome();
        dto.email = paciente.getEmail();
        dto.cpf = paciente.getCpf();
        return dto;
    }

    @Override
    public String toString() {
        return "PacienteDTO{" + "nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
}
