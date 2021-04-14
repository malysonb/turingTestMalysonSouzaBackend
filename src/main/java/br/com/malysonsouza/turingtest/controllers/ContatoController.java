package br.com.malysonsouza.turingtest.controllers;

import java.util.List;

import org.dom4j.IllegalAddException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.malysonsouza.turingtest.models.ContatoModel;
import br.com.malysonsouza.turingtest.repositories.ContatoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/agenda")
@Api(value="API REST Agenda")
@CrossOrigin(origins="*")
public class ContatoController {

	@Autowired
	private ContatoRepository repositorio;
	
	@GetMapping(path = "/contato")
	@ApiOperation(value="Retorna todos os contatos da agenda em uma lista")
	public List<ContatoModel> listarContatos()
	{
		return (List<ContatoModel>) repositorio.findAll();
	}
	
	@GetMapping(path = "/contato/{id}")
	@ApiOperation(value="Consulta um contato pelo id")
	public ResponseEntity<ContatoModel> Consultar(@PathVariable("id") long id){
		return repositorio.findById(id)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping(path = "/contato")
	@ApiOperation(value="Adiciona um contato a lista")
	public ContatoModel salvar(@RequestBody ContatoModel contato){
		return repositorio.save(contato);
	}
	
	@PutMapping(path = "/contato")
	@ApiOperation(value="Edita um contado da lista")
	public ContatoModel editar(@RequestBody ContatoModel contato){
		return repositorio.save(contato);
	}
	
	@DeleteMapping(path = "/contato")
	@ApiOperation(value="Deleta um contato dado suas informações")
	public String remover(@RequestBody ContatoModel contato) {
		repositorio.delete(contato);
		return "Removido com sucesso";
	}
	
	@DeleteMapping(path = "/contato/{id}")
	@ApiOperation(value="Deleta um contato dado seu id")
	public String remover(@PathVariable("id") long id) {
		ContatoModel contato = repositorio.findById(id)
				.orElseThrow(() -> new IllegalAddException("Id desconhecido!"));
		repositorio.delete(contato);
		return "Removido com sucesso";
	}
	
}
