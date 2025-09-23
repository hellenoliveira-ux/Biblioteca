package br.com.biblioteca.model;

import java.util.List;

public class Aluno extends Pessoa {
	private String endereço;
	private double debito;
	private List<Emprestimo> historicoEmprestimo;
	

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public double getDebito() {
		return debito;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}

	public List<Emprestimo> getHistoricoEmprestimo() {
		return historicoEmprestimo;
	}

	public void setHistoricoEmprestimo(List<Emprestimo> historicoEmprestimo) {
		this.historicoEmprestimo = historicoEmprestimo;
	}

}
