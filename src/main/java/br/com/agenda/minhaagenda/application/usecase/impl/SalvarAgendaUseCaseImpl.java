package br.com.agenda.minhaagenda.application.usecase.impl;

import br.com.agenda.minhaagenda.application.model.AgendaRequest;
import br.com.agenda.minhaagenda.application.usecase.SalvarAgendaUseCase;
import br.com.agenda.minhaagenda.domain.gateway.AgendaGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalvarAgendaUseCaseImpl implements SalvarAgendaUseCase {
    @Autowired
    private AgendaGateway gateway;

    @Override
    public AgendaRequest salvarAgenda(AgendaRequest agendaRequest) {
        return gateway.cadastrarAgenda(agendaRequest);
    }
}
