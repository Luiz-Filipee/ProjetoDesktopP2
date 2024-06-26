
package br.com.unigran.model;

import java.io.File;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Consulta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JoinColumn(name = "paciente_id")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Paciente paciente;
    
    @JoinColumn(name = "dentista_id")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Dentista dentista;
    private String observacoes;
    private File anexos;
    private Double valor;
    
    @JoinColumn(name = "agendamento_id")
    @ManyToOne
    private Agendamento agendamento;
    
}
