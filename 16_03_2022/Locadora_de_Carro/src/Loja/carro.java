package Loja;

public class carro
{
  // Atributos da classe que no caso é o carro
	String placa;
	double potencia;
	String modelo;
	String cor;
	String marca;
	boolean cambio_automatico;
	int ano;
	float preco;
	
	
	//método construtor executado apenas no ato da instanciação
	
		    public carro(String plac,double pot,String modelo,String cor,String marca,boolean cambio_automatico,int ano) {
			placa=plac;
			potencia=pot;
			this.modelo=modelo; //this necessário quando nomes iguais de atributo e argumento
			this.cor=cor;
			this.cambio_automatico=cambio_automatico;
			this.ano=ano;
			this.marca=marca;
		}
	
	
	
	//métodos de acesso aos atributos
		public float get_preco()
		{
			return preco;
		}
		public void  set_preco(float novopreco)
		{
			preco=novopreco;
		}
	//Criar método ações

	public void andar()
    {
		System.out.println("andando");
	}
	
	public boolean frear() {
		System.out.println("freando");
		return true;
	}
	public void correr(int velocidade) {
		System.out.println("Estou correndo "+velocidade);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando objetos da classe
		carro C1 = new carro("FDG6980",2.0, "modelo", "vermelha", "Ferrari",true, 2020);
		//String plac,double pot,String modelo,String cor,String marca,boolean cambio_automatico,int ano
		//declarar na ordem ácima
		
		//declarei e depois instanciei o objeto
		carro C2;
		C2 =new carro("USA2000",1.0,"palio","preto","fiat",false, 2012);
		
		//usando objetos
		//C1.ano=2020;
		//C1.cor="vermelho";
		C1.andar();
		
		//C2.marca="Ferrari";
		C2.correr(300);
		System.out.println(C2.frear());
		
	}
}



