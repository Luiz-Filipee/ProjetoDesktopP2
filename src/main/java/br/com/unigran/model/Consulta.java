
package br.com.unigran.model;

import java.io.File;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    @OneToOne
    private Paciente paciente;
    @JoinColumn(name = "dentista_id")
    @OneToOne
    private Dentista dentista;
    private String observacoes;
    private File anexos;
    private Double valor;
    
}
