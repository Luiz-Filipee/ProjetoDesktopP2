/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Consulta;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class ConsultaDTO extends GenericoDTO<Consulta>{
    
    public Long id; 
    public PacienteDTO paciente;
    public DentistaDTO dentista;
    public String observacoes;
    public File anexos;
    public Double valor;
    public AgendamentoDTO agendamento;

    @Override
    public Consulta builder() {
        Consulta consulta = new Consulta();
        consulta.setId(this.id);
        consulta.setObservacoes(this.observacoes);
        consulta.setAnexos(this.anexos);
        consulta.setValor(this.valor);
        if(paciente != null){
            consulta.setPaciente(paciente.builder());
        }
        if(dentista != null){
            consulta.setDentista(dentista.builder());
        }
        if(agendamento != null){
            consulta.setAgendamento(agendamento.builder());
        }
        return consulta;
    }

    @Override
    public List getListaDados(List<Consulta> dados) {
        List dadosDTO = new LinkedList();
        for (Consulta dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
    
    @Override
    public Object converte(Consulta consulta) {

        ConsultaDTO dto = new ConsultaDTO();
        dto.id = consulta.getId();
        dto.valor = consulta.getValor();
        return dto;
    }

   

    
}
