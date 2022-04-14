package br.com.agenda.minhaagenda.infrastructure.repository;

import br.com.agenda.minhaagenda.infrastructure.repository.model.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<AgendaEntity, Integer> {
}
