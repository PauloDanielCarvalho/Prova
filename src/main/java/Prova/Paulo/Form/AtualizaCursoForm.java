package Prova.Paulo.Form;

import Prova.Paulo.entity.Curso;
import Prova.Paulo.repository.CursoRepository;

public class AtualizaCursoForm {
	private String data_cadastro;
	private String data_inicio;
	private String descricao;
	private String ementa;
	private String nome;
	private String valor;
	public String getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	public String getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Curso atualizar(Long id, CursoRepository repositorio) {
		Curso curso = repositorio.getOne(id);
		curso.setData_cadastro(this.data_cadastro);
		curso.setData_inicio(this.data_inicio);
		curso.setDescricao(this.descricao);
		curso.setEmenta(this.ementa);
		curso.setNome(this.nome);
		curso.setValor(this.valor);
		return curso;
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	