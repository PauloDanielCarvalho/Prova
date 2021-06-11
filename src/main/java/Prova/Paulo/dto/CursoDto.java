package Prova.Paulo.dto;

import java.util.List;
import java.util.stream.Collectors;

import Prova.Paulo.entity.Curso;

public class CursoDto {
	private long id;
	private String data_cadastro;
	private String data_inicio;
	private String descricao;
	private String ementa;
	private String nome;
	private String valor;
	
	public CursoDto(Curso curso) {
		this.data_cadastro=curso.getData_cadastro();
		this.data_inicio=curso.getData_inicio();
		this.descricao=curso.getDescricao();
		this.ementa=curso.getEmenta();
		this.nome=curso.getNome();
		this.valor=curso.getValor();
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public String getData_inicio() {
		return data_inicio;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getEmenta() {
		return ementa;
	}

	public String getNome() {
		return nome;
	}

	public String getValor() {
		return valor;
	}
	public static List<CursoDto> converter(List<Curso> cursos){
		return cursos.stream().map(CursoDto::new).collect(Collectors.toList());
		
}
}