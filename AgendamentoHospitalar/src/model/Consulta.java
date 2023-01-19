package model;

import java.util.*;

public class Consulta {
	private String especialidade;
	private double valor;
	private Medico idMedico;
	private Paciente idPaciente;
	private String data;

	// construtores
	public Consulta(String especialidade, double valor, Medico idMedico, Paciente idPaciente) {
		super();
		this.especialidade = especialidade;
		this.valor = valor;
		this.idMedico = idMedico;
		this.idPaciente = idPaciente;
	}

	public Consulta(String especialidade, double valor) {
		super();
		this.especialidade = especialidade;
		this.valor = valor;
	}

	// getters and setters
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
