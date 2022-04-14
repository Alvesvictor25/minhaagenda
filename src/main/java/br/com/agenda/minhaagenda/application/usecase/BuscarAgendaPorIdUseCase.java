package br.com.agenda.minhaagenda.application.usecase;

import br.com.agenda.minhaagenda.application.model.AgendaRequest;

public interface BuscarAgendaPorIdUseCase {
    AgendaRequest buscarAgendaPorId(Integer idAgenda);
}
