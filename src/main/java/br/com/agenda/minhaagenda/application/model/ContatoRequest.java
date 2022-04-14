package br.com.agenda.minhaagenda.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContatoRequest {
    @JsonProperty("id_contato")
    private Integer idContato;
    @JsonProperty("nome_contato")
    private String nomeContato;
    @JsonProperty("sobrenome_contato")
    private String sobrenomeContato;
    @JsonProperty("telefone")
    private String telefoneContato;
    @JsonProperty("email")
    private String emailContato;
}
