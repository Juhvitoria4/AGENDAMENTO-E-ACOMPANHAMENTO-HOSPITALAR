package model;

import java.util.*;

public class Consulta {
	private String especialidade;
	private double valor;
	private Medico idMedico;
	private Paciente idPaciente;
	//construtores
	public Consulta(String especialidade, double valor, Medico idMedico, Paciente idPaciente) {
		super();
		this.especialidade = especialidade;
		this.valor = valor;
		this.idMedico = idMedico;
		this.idPaciente = idPaciente;
	}
	//getters and setters
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Medico getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Medico idMedico) {
		this.idMedico = idMedico;
	}
	public Paciente getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}
	//funcoes
	public void DadosConsulta() {
		System.out.println("Especialidade: ");
		Scanner in = new Scanner(System.in);
		especialidade = in.nextLine();
		System.out.println("valor: ");
		valor = in.nextInt();
	}
	
	public boolean VerificarAtestado() {
		System.out.println("Teve atestado? S/N ");
		String ch;
		Scanner in = new Scanner (System.in);
		ch = in.next();
		if (ch == "S" || ch ==  "s") {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean VerificaMedicamento() {
		System.out.println("teve prescrição de medicamento? S/N");
		String ch;
		Scanner in = new Scanner (System.in);
		ch = in.next();
		if (ch == "S" || ch ==  "s") {
			return true;
		}else {
			return false;
		}
		
	}
}
