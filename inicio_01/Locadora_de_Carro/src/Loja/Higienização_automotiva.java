package Loja;

public class Higienização_automotiva {
	
	
	//Definindo as qualidades da classe no caro o lava rapido
	
	boolean ocupado;
	int frentista;
	boolean sujo;
	int numerocarro;
	float tempo;
	float preço_LavagemCompleta;
	
	// declarando métodos da classe
	
	public boolean chamandocarro ()
	{		
		System.out.println("Nem vai que está ocupado");
		return true;
		
	}
	
	public boolean verificandocarro ()
	{
		System.out.println("Leve para a higienização");
		return true;
	}
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Higienização_automotiva carro = new Higienização_automotiva();
		Higienização_automotiva lavatorio = new Higienização_automotiva();
		
		lavatorio.chamandocarro();
		carro.verificandocarro();

	}

}
