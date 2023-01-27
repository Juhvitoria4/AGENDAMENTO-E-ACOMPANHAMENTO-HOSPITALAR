package model;


import java.util.*;

public class Paciente extends Pessoa{
    private String cpf;
    private String altura;  //mudar pra String depois
    private String peso;    //mudar pra String depois
    private String observacao;
    private int idpaciente;
    
    //full constructor
    public Paciente(String nome,String email, String senha, String id, String sexo, String dataNascimento, String cpf, String altura2, String peso2,
            String observacao, int idpaciente) {
        super(email, senha, sexo, nome, id, dataNascimento);
        this.cpf = cpf;
        this.altura = altura2;
        this.peso = peso2;
        this.setObservacao(observacao);
        this.idpaciente = idpaciente;
    }
    
    
    public Paciente(String email, String senha) {
		super(email, senha);
	}
   


	public Paciente(String nome, String email, String senha, int i) {
		super(email,senha);
	}


	public Paciente(String email, String senha, String nome) {
		// TODO Auto-generated constructor stub
	}


	public Paciente() {
		// TODO Auto-generated constructor stub
	}


	//getters and setters
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getAltura() {
        return altura;
    }
    public void setAltura(String altura) {
        this.altura = altura;
    }
    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
	public int getIdpaciente() {
		return idpaciente;
	}


	public void setIdpaciente(int idpaciente) {
		this.idpaciente = idpaciente;
	}


	@Override
	public int tipoUsuario() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void setPaciente(Paciente paciente) {
		
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}