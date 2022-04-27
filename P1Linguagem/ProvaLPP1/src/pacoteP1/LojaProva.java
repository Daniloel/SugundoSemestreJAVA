package pacoteP1;

//Considere as figuras a seguir. Implemente uma classe que descreva os objetos representados por elas. 
/*
    A classe deve conter:
    a) mínimo de três atributos,
    b) um método construtor implementado,
    c) mínimo de quatro métodos de acesso; 
    d) mínimo de dois métodos de classe, excetuando-se o 'main' e o método construtor
*/

public class LojaProva {
	
	//Declaração de Atributos
	String moveis= "sofa";
	String cor="Cinza";
	double preco=1.699;
	float tamanho=2;
	int quantidade=1;
	int numerodeLugares=3;
	
	
	// Metodo Construtor
	public LojaProva(String moveis,String cor,double preco,int quantidade, int numerodeLugares) {
		
		this.moveis = moveis;
		this.cor= cor;
		this.preco=preco;
		this.quantidade= quantidade;
		this.numerodeLugares= numerodeLugares;
				
	};
	
	//Metodo de Acesso
	public float get_tamanho() {
		return tamanho;
	}
	public void  set_tamanho(float novotamanho) {
		tamanho=novotamanho;
	}
	
	public float ge_quantidade() {
		return quantidade;
	}
	public void  set_qauntidade( int novaquantidade) {
		quantidade=novaquantidade;
	}
	
	
	
	// Metodo classe
	public void seleciona() 
	{
		System.out.println("Escolha entre as opçõeso que você acha mais bonito");
	};
	
	public void confere() {
		
		System.out.println("Confira se esse são os produtos desejados");
		
	};
	
	
	// Metodo main
	public static void main(String[] args) {
		
				
		LojaProva cliente;
		cliente= new LojaProva("Sofa","CinzaEscuro",1699, 1, 3);
		cliente.seleciona();
		cliente.confere();
		System.out.println("Especificação" + cliente);
		
		
		
		
	}

}
