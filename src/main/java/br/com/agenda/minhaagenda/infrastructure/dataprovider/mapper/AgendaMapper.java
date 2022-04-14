package br.com.agenda.minhaagenda.infrastructure.dataprovider.mapper;

import br.com.agenda.minhaagenda.application.model.AgendaRequest;
import br.com.agenda.minhaagenda.infrastructure.repository.model.AgendaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgendaMapper {
    AgendaEntity mapearAgendaEntity(AgendaRequest request);
    AgendaRequest mapearAgendaRequest(AgendaEntity request);
}
