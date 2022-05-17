package Loja;

public class Funcionario {

	// Atributos Clientes

	String nome_Funcionario;
	String cidade_Funcionario;
	String setor_Funcionario;

	// Metodo Construtor
	public Funcionario(String nome_Funcionario, String cidade_Funcionario, String setor_Funcionario) {

		this.nome_Funcionario = nome_Funcionario;
		this.cidade_Funcionario = cidade_Funcionario;
		this.setor_Funcionario = setor_Funcionario;

	}

	// Modificadores de Acesso Get

	public void getnome_fucionario(String nf) {
		nome_Funcionario = nf;
	}

	public void getcidade_funcionario(String cf) {
		cidade_Funcionario = cf;
	}

	public void getsetor_funcionario(String sf) {
		setor_Funcionario = sf;
	}

	// Modificadores de Acesso Set

	public void Setnome_funcionario(String nf) {
		nome_Funcionario = nf;
	}

	public void Setcidade_funcionario(String cf) {
		cidade_Funcionario = cf;
	}

	public void Setsetor_funcionario(String sf) {
		setor_Funcionario = sf;
	}
}
