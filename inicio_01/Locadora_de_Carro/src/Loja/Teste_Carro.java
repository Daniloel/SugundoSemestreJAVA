package Loja;

public class Teste_Carro {
	
	    //Comentar apenas uma linha
		/*Cometario bloco*/
		/** Coment�rio de documenta��o**/
		
		//Atributos de Classe(Abstra��o)-> Caracteristicas
		String placa;
		double potencia;//double � ponto flutuante com presi��o
		String modelo;
		String cor;
		String marca;
		boolean cambio_automatico;
		int ano;
		float pre�o;
		
		//M�todo construtor executando apenas no ato da instancia��o
		
		
		
		// Metodos -> A��es
		public void andar()
		{
			//Se usar void � porque n�o ser� retonado nada
			System.out.println("andando");
			
		}
		
		public boolean frear()
		{//Come�o
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
