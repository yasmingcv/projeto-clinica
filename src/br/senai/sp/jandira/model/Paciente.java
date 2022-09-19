package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	private LocalDate dataNascimento;
	private String telefone;
	private String rg;
	private String cpf;
	private Endereco endereco;
	private PlanoDeSaude planoSaude;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public PlanoDeSaude getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(PlanoDeSaude planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	
	// 
	
	
	
	
}
