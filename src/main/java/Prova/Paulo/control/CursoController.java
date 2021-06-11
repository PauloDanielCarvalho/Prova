package Prova.Paulo.control;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Prova.Paulo.Form.AtualizaCursoForm;
import Prova.Paulo.Form.CursoForm;
import Prova.Paulo.dto.CursoDto;
import Prova.Paulo.entity.Curso;
import Prova.Paulo.repository.CursoRepository;

@RestController
@RequestMapping("/curso")
public class CursoController {
	@Autowired
	private CursoRepository cursoRepository;
	// Read - Ler
	@GetMapping
	public List<CursoDto> listar(){
		List<Curso> cursos = cursoRepository.findAll();
		return CursoDto.converter(cursos);
				
	}
	// Create -- Cadastrar
		@PostMapping
		@Transactional
		public void salvar(@RequestBody CursoForm cursoForm) {
			Curso curso = cursoForm.converter();
			cursoRepository.save(curso);
			
			
		}
		// Delete -- Remover/apagar
		@DeleteMapping("/{id}")
		@Transactional
		public ResponseEntity<CursoDto> apagar(@PathVariable Long id){
			cursoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		//Update -- Atualizar
		@PutMapping("/{id}")
		@Transactional
		public ResponseEntity<CursoDto> atualizar(@PathVariable Long id, @RequestBody AtualizaCursoForm apf){
			Optional<Curso> optional = cursoRepository.findById(id);
			if(optional.isPresent()) {
				Curso curso = apf.atualizar(id, cursoRepository);
				return ResponseEntity.ok().build();
			}
			return ResponseEntity.notFound().build();
			
		}
}































