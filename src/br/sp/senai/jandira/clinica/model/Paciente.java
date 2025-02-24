package br.sp.senai.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	private double peso;
	private double altura;
	private String genero;
	private String telefone;
	private LocalDate dataNascimento;
	
	public void setTelefone(String telefone){
		if (telefone.length() >= 13) {
			this.telefone = telefone;
		} else {
			System.out.println("O valor " + telefone + " não é um telefone!");
		}
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setGenero(String genero) {
		if (genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("o")) {
			this.genero = genero.toUpperCase();
		} else {
			System.out.println("O gênero do(a) " + nome + " deve ser \"M\" ou \"F\" ou \"O\"");
		}
	}
	
	public String getGenero() {
		return genero;
	}

	public void setNome(String nome) { // Inicio
		if (nome.length() > 3) {
			this.nome = nome.toUpperCase();
		} else {
			System.out.println("O nome deve conter mais do que 3 caracteres");
		}
	} // fim

	public String getNome() {
		return nome;
	}

	public void setAltura(double altura) {
		if (altura > 0.5) {
			this.altura = altura;
		} else {
			System.out.println("A altura deve ser maior do que 0,5m");
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setPeso(double peso) {

		if (peso > 0) {
			// verdade
			this.peso = peso;
		} else {
			// falso
			System.out.println("O peso deve ser maior do que ZERO!");
		}

	}

	public double getPeso() {
		return this.peso;
	}

	public void marcarConsulta() {

	}

	public void calcularIdade() {

	}

	public void calcularImc() {

		double imc = peso / altura * altura;

	}

	public void classificarImc() {

	}

	public void exibirDados() {
		String unidadePeso = "Kg.";
		String unidadeAltura = "m.";
		System.out.println("-----------------------------------");
		System.out.println("dados do paciente".toUpperCase());
		System.out.println("-----------------------------------");
		System.out.println("nome: ".toUpperCase() + nome);
		System.out.printf("PESO: %s %s\n", peso, unidadePeso);
		System.out.printf("ALTURA: %s %s\n", altura, unidadeAltura);
		System.out.println("===================================");
		System.out.println();
	}

}
