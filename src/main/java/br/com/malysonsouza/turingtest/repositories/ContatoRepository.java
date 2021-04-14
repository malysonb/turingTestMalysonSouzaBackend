package br.com.malysonsouza.turingtest.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.malysonsouza.turingtest.models.ContatoModel;

public interface ContatoRepository extends CrudRepository<ContatoModel, Long>{

}
