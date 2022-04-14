package br.com.agenda.minhaagenda.infrastructure.repository.model;


import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_contato")
public class ContatoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContato;
    @Column(name = "nome")
    private String nomeContato;
    @Column(name = "sobrenome")
    private String sobrenomeContato;
    @Column(name = "telefone")
    private String telefoneContato;
    @Column(name = "email")
    private String emailContato;
    @ManyToOne
    @JoinColumn(name = "id_agenda")
    private AgendaEntity agenda;
}
