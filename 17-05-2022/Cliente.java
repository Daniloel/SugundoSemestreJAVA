package Loja;

public class Cliente {

	// Atributos Clientes

	String nome_Cliente;
	String cidade_Cliente;
	int cpf_Cliente;
	float idade_Cliente;

	// Metodo Construtor
	public Cliente(String nome_Cliente, String cidade_Cliente, int cpf_Cliente, float idade_Cliente) {

		this.nome_Cliente = nome_Cliente;
		this.cidade_Cliente = cidade_Cliente;
		this.cpf_Cliente = cpf_Cliente;
		this.idade_Cliente = idade_Cliente;
	}
	
	
	// Metodo de acesso get.
	
		public void getnome_c(String nc) {
			nome_Cliente=nc;
		}
		
		public void getcidade_c(String cc) {
			cidade_Cliente = cc;
		}
		
		public void getcpf_C(int cpfC) {
			cpf_Cliente = cpfC;
		}
		
		public void getidade_C(float ic) {
			idade_Cliente=ic;
		}
	
	//Metodo set(Acesso)
	public void setnome_c(String nc) {
		nome_Cliente=nc;
	}
	
	public void setcidade_c(String cc) {
		cidade_Cliente = cc;
	}
	
	public void setcpf_C(int cpfC) {
		cpf_Cliente = cpfC;
	}
	
	public void setidade_C(float ic) {
		idade_Cliente=ic;
	}
	
	

}
