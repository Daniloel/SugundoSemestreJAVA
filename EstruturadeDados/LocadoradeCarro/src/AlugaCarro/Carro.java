package AlugaCarro;

public class Carro {

	// Atributos da classe que no caso é o carro
	String placa;
	double potencia;
	String modelo;
	String cor;
	String marca;
	boolean cambio_automatico;
	int ano;
	float preco;

	// método construtor executado apenas no ato da instanciação
	
	public Carro(String marca, String Modelo){
		   modelo=Modelo;
		   this.marca=marca;
	   }
	   

	public Carro(String plac, double pot, String modelo, String cor, String marca, boolean cambio_automatico, int ano) {
		placa = plac;
		potencia = pot;
		this.modelo = modelo; // this necessário quando nomes iguais de atributo e argumento
		this.cor = cor;
		this.cambio_automatico = cambio_automatico;
		this.ano = ano;
		this.marca = marca;
	}
	
	
	 
	   //m�todos de acesso do tipo setter
	    public void setCor(String c){
	    	cor=c;
	    }
	    
	    public void setAno(int a){
	    	ano=a;
	    }
	    
	    public int getAno(){
	    	return ano;
	    }
	    
	    

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public void setPlaca(String placa){
	    	this.placa=placa;
	    }
	    
	    //m�todo de acesso do tipo getter
	    public String getPlaca(){
	    	return placa;
	    }
	  //m�todo de acesso do tipo getter
	    public String getCor(){
	    	return cor;
	    }
	    
		//liga o carro
		public void ligar() {
		System.out.println("O carro est� ligado");
		}
		
		//desliga o carro
		public	void desligar() {
				System.out.println("O carro na garagem! #Fique em casa com DEUS");
				}
		
		
		
		
	 

	// métodos de acesso aos atributos
	public float get_preco() {
		return preco;
	}

	public void set_preco(float novopreco) {
		preco = novopreco;
	}
	// Criar método ações

	public void andar() {
		System.out.println("Andando");
	}

	public boolean frear() {
		System.out.println("Freando");
		return true;
	}

	public void correr(int velocidade) {
		System.out.println("Estou correndo " + velocidade);

	}

	/*public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//instanciando objetos da classe
			Carro C1 = new Carro("FDG6980",2.0, "modelo", "vermelha", "Ferrari",true, 2020);
			//String plac,double pot,String modelo,String cor,String marca,boolean cambio_automatico,int ano
			//declarar na ordem ácima
			
			//declarei e depois instanciei o objeto
			Carro C2;
			C2 =new Carro("USA2000",1.0,"palio","preto","fiat",false, 2012);
			
			//usando objetos
			//C1.ano=2020;
			//C1.cor="vermelho";
			C1.andar();
			
			//C2.marca="Ferrari";
			C2.correr(300);
			System.out.println(C2.frear());
	}*/
}