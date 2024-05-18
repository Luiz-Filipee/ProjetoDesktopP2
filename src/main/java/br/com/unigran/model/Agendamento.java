
package br.com.unigran.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Agendamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String horario;
    @Temporal(TemporalType.DATE)
    @JoinColumn(name = "data_agendamento")
    private Date dataAgendamento;
    
    @JoinColumn(name = "paciente_id")
    @ManyToOne
    private Paciente paciente;
    
    @JoinColumn(name = "dentista_id")
    @ManyToOne
    private Dentista dentista;
    
    @JoinColumn(name = "recepcionista_id")
    @ManyToOne
    private Recepcionista recepcionista;
    
    @OneToOne(mappedBy = "agendamento")
    private Consulta consulta;
   
}
