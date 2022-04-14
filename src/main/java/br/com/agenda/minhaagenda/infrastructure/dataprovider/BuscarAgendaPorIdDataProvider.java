package br.com.agenda.minhaagenda.infrastructure.dataprovider;

import br.com.agenda.minhaagenda.application.model.AgendaRequest;
import br.com.agenda.minhaagenda.domain.gateway.AgendaGateway;
import br.com.agenda.minhaagenda.domain.gateway.AgendaPorIdGateway;
import br.com.agenda.minhaagenda.infrastructure.dataprovider.mapper.AgendaMapper;
import br.com.agenda.minhaagenda.infrastructure.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BuscarAgendaPorIdDataProvider implements AgendaPorIdGateway {
    @Autowired
    private AgendaRepository repository;
    @Autowired
    private AgendaMapper mapper;

    @Override
    public AgendaRequest buscarAgendaPorId(Integer idAgenda) {
        return mapper.mapearAgendaRequest(repository.findById(idAgenda).orElse(null));
    }
}
