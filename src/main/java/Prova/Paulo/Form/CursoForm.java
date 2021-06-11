package Prova.Paulo.Form;

import Prova.Paulo.entity.Curso;

public class CursoForm {
	private String data_cadastro;
	private String data_inicio;
	private String descricao;
	private String ementa;
	private String nome;
	private String valor;
	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Curso converter() {
		return new Curso(data_cadastro,data_inicio,descricao,ementa,nome,valor);
}
}