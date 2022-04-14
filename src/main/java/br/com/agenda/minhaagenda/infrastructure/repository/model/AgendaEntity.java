package br.com.agenda.minhaagenda.infrastructure.repository.model;

import br.com.agenda.minhaagenda.application.model.ContatoRequest;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "tb_agenda")
public class AgendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAgenda;
    @Column(name = "nome_agenda")
    private String nomeAgenda;
    @Column(name = "descricao_agenda")
    private String descricaoAgenda;
    @OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL)
    private List<ContatoEntity> contatos;
}
