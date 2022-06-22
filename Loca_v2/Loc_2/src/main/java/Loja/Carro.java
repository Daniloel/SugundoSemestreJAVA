package Loja;



public class Carro {

	// Atributos da classe que no caso é o carro
	String placa;
	int ano;
	String cor;
	String marca;
	
	double potencia;
	float preco;
	boolean cambio_automatico;
	String modelo;
	
	

	// metodo construtor

	public Carro(String placa, int ano, String cor, String marca) {
		// this necessario quando nomes s�o iguais ao de atributo e argumento
		this.placa = placa;
		this.ano = ano;
		this.cor = cor;
		this.marca = marca;
	}

	public Carro() {
		// TODO Auto-generated constructor stub
	}
    
	
	// m�todos de acesso do tipo setter(colocar o valor na variavel), Fonerce o
	// numero para quem requesita
	public void setCor(String c) {
		cor = c;
	}

	public void setano(int a) {
		ano = a;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void set_preco(float novopreco) {
		preco = novopreco;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	// m�todos de acesso do tipo getter pego os valores que s�o colocados pelo
	// usuario

	// m�todos de acesso aos atributos

	public float get_preco() {
		return preco;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public int getAno() {
		return ano;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	// Criar m�todos acoes

	// liga o carro
	public void ligar() {
		System.out.println("O carro est� ligado");
	}

	// desliga o carro
	public void desligar() {
		System.out.println("O carro na garagem! #Fique em casa com DEUS");
	}

	// anda carro
	public void andar() {
		System.out.println("Andando");
	}

	// frear carro
	public boolean frear() {
		System.out.println("Freando");
		return true;
	}

	// correr carro
	public void correr(int velocidade) {
		System.out.println("Estou correndo " + velocidade);

	}

}
