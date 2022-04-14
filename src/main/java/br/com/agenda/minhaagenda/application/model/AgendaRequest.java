package br.com.agenda.minhaagenda.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendaRequest {
    @JsonProperty("id_agenda")
    private Integer idAgenda;
    @JsonProperty("nome_agenda")
    private String nomeAgenda;
    @JsonProperty("descricao_agenda")
    private String descricaoAgenda;
    @JsonProperty("lista_de_contatos")
    private List<ContatoRequest> contatos;
}
