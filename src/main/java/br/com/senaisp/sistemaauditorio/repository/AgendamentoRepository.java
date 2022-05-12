package br.com.senaisp.sistemaauditorio.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.senaisp.sistemaauditorio.model.Agendamento;

@Repository
public interface AgendamentoRepository extends PagingAndSortingRepository<Agendamento, Long> {

	//criando um metodo que retorna um list de agendamentos
	//public List<Agendamento> findByAgendaId(Long id);
	
}