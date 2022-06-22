package Loja;

public class Funcionario {

	// Atributos Clientes

	String nome_Funcionario;
	String cidade_Funcionario;
	String setor_Funcionario;

	// Metodo Construtor
	public Funcionario(String nome_Funcionario, String cidade_Funcionario, String cpf_Funcionario) {

		this.nome_Funcionario = nome_Funcionario;
		this.cidade_Funcionario = cidade_Funcionario;
		this.setor_Funcionario = setor_Funcionario;

	}
	
	public Funcionario() {
		
	}

	//Modificadores de Acesso Get
	
	public String getnome_F() {
		return nome_Funcionario;
	}
	
	public String getcidade_f() {
		return cidade_Funcionario;
	}
	
	public String getsetor_f() {
		return setor_Funcionario ;
	}
	
	//Modificadores de Acesso Set
	
		public void Setnome_F(String nf) {
			nome_Funcionario= nf;
		}
		
		public void Setcidade_f(String cf) {
			cidade_Funcionario = cf;
		}
		
		public void Setsetor_f(String sf) {
			setor_Funcionario =sf;
		}
}

