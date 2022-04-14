package br.com.agenda.minhaagenda.domain.gateway;

import br.com.agenda.minhaagenda.application.model.AgendaRequest;

public interface AgendaPorIdGateway {
    AgendaRequest buscarAgendaPorId(Integer idAgenda);
}
