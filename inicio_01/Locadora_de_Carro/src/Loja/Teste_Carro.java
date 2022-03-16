package Loja;

public class Teste_Carro {
	
	    //Comentar apenas uma linha
		/*Cometario bloco*/
		/** Comentário de documentação**/
		
		//Atributos de Classe(Abstração)-> Caracteristicas
		String placa;
		double potencia;//double é ponto flutuante com presição
		String modelo;
		String cor;
		String marca;
		boolean cambio_automatico;
		int ano;
		float preço;
		
		//Método construtor executando apenas no ato da instanciação
		
		
		
		// Metodos -> Ações
		public void andar()
		{
			//Se usar void é porque não será retonado nada
			System.out.println("andando");
			
		}
		
		public boolean frear()
		{//Começo
			System.out.println("freando");
			return true;
		}//fim
		
		public void correr(int velocidade)
		{
			System.out.println("Estou correndo"+velocidade);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
				// instanciando objetos de classe
				Teste_Carro C1= new Teste_Carro();
				//Declarei depois instancei objeto
				Teste_Carro C2;
				C2 = new Teste_Carro();
				
				C1.ano=2020;
				C1.cor="vermelho";
				C1.andar();
				
				C2.marca="Ferrari";
				C2.correr(300);
				//System.out.println(C2.frear());
				

	}

}
