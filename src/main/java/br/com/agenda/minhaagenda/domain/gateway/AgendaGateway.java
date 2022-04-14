package br.com.agenda.minhaagenda.domain.gateway;

import br.com.agenda.minhaagenda.application.model.AgendaRequest;

public interface AgendaGateway {
    AgendaRequest cadastrarAgenda(AgendaRequest request);
}
