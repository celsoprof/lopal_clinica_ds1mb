package br.sp.senai.jandira.clinica;

import br.sp.senai.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		System.out.println(p1);
		
		Paciente p2 = new Paciente();
		System.out.println(p2);
		
		p1.setNome("");
		p1.setPeso(68);
		p1.setAltura(1.66);
		
		p2.setNome("Jó");
		p2.setPeso(83);
		p2.setAltura(1.67);
		
		p1.exibirDados();
		p2.exibirDados();

	}

}
