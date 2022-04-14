package br.com.agenda.minhaagenda.application.usecase.impl;

import br.com.agenda.minhaagenda.application.model.AgendaRequest;
import br.com.agenda.minhaagenda.application.usecase.BuscarAgendaPorIdUseCase;
import br.com.agenda.minhaagenda.domain.gateway.AgendaPorIdGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuscarAgendaPorIdUseCaseImpl implements BuscarAgendaPorIdUseCase {
    @Autowired
    private AgendaPorIdGateway gateway;

    @Override
    public AgendaRequest buscarAgendaPorId(Integer idAgenda) {
        return gateway.buscarAgendaPorId(idAgenda);
    }
}
