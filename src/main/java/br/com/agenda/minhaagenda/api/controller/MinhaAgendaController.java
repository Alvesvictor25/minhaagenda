package br.com.agenda.minhaagenda.api.controller;

import br.com.agenda.minhaagenda.application.model.AgendaRequest;
import br.com.agenda.minhaagenda.application.usecase.BuscarAgendaPorIdUseCase;
import br.com.agenda.minhaagenda.application.usecase.SalvarAgendaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agenda")
public class MinhaAgendaController {

    @Autowired
    private SalvarAgendaUseCase salvarAgendaUseCase;
    @Autowired
    private BuscarAgendaPorIdUseCase buscarAgendaPorIdUseCase;

    @PostMapping("/cadastrar")
    public ResponseEntity<Object> cadastrarAgenda(@RequestBody AgendaRequest agendaRequest) {
        return ResponseEntity.ok(salvarAgendaUseCase.salvarAgenda(agendaRequest));
    }

    @GetMapping("/buscar")
    public ResponseEntity<Object> buscarAgendaPorCpf() {

        return null;
    }

    @GetMapping("/buscar/{id_agenda}")
    public ResponseEntity<Object> buscarAgendaPorCpf(@PathVariable("id_agenda") Integer idAgenda) {
        return ResponseEntity.ok(buscarAgendaPorIdUseCase.buscarAgendaPorId(idAgenda));
    }

    @PutMapping
    public ResponseEntity<Object> alterarAgendaPorCpf() {

        return null;
    }

    @DeleteMapping
    public ResponseEntity<Object> deletarAgendaPorId() {

        return null;
    }
}
