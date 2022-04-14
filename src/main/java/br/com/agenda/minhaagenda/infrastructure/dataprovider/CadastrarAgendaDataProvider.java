package br.com.agenda.minhaagenda.infrastructure.dataprovider;

import br.com.agenda.minhaagenda.application.model.AgendaRequest;
import br.com.agenda.minhaagenda.domain.gateway.AgendaGateway;
import br.com.agenda.minhaagenda.infrastructure.dataprovider.mapper.AgendaMapper;
import br.com.agenda.minhaagenda.infrastructure.repository.AgendaRepository;
import br.com.agenda.minhaagenda.infrastructure.repository.model.AgendaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CadastrarAgendaDataProvider implements AgendaGateway {
    @Autowired
    private AgendaRepository repository;
    @Autowired
    private AgendaMapper mapper;

    @Override
    public AgendaRequest cadastrarAgenda(AgendaRequest request) {
        AgendaEntity agendaEntity = mapper.mapearAgendaEntity(request);
        agendaEntity.getContatos().get(0).setAgenda(agendaEntity);
        agendaEntity.getContatos().get(1).setAgenda(agendaEntity);
        return mapper.mapearAgendaRequest(repository.save(agendaEntity));
    }
}

