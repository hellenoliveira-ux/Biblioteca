package br.com.biblioteca.model;

import java.util.List;

public class Livro {
	private int id;
	private String titulo;
	private String autor;
	private String categoria;
	private int ano;
	private int estoque;
	private List<Aluno> listaReserva;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public List<Aluno> getListaReserva() {
		return listaReserva;
	}
	public void setListaReserva(List<Aluno> listaReserva) {
		this.listaReserva = listaReserva;
	}
}
