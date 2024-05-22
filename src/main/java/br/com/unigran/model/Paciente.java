/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author user
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Paciente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_de_nascimento")
    private Date dataNascimento;
    private String convenios;
    private String email;
    private String responsavel;
    
    @ManyToOne
    @JoinColumn(name = "contato_id")
    private Contato contato;

    @ManyToOne
    @JoinColumn(name = "prontuario_id")
    private Prontuario prontuario;

    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    @OneToMany(mappedBy = "paciente")
    private List<Agendamento> agendamentos;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
