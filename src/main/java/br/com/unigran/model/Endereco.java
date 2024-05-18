/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private String cidade;
    private String estado;
    
    @ManyToOne
    @JoinColumn(name = "paciente_Id")
    private Paciente paciente;
    
    @ManyToOne
    @JoinColumn(name = "cidade_Id")
    private Cidade cidadeEntity;
    
}
