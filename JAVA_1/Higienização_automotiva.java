package Loja;

public class Higieniza��o_automotiva {
	
	
	//Definindo as qualidades da classe no caro o lava rapido
	
	boolean ocupado;
	int frentista;
	boolean sujo;
	int numerocarro;
	float tempo;
	float pre�o_LavagemCompleta;
	
	// declarando m�todos da classe
	
	public boolean chamandocarro ()
	{		
		System.out.println("Nem vai que est� ocupado");
		return true;
		
	}
	
	public boolean verificandocarro ()
	{
		System.out.println("Leve para a higieniza��o");
		return true;
	}
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Higieniza��o_automotiva carro = new Higieniza��o_automotiva();
		Higieniza��o_automotiva lavatorio = new Higieniza��o_automotiva();
		
		lavatorio.chamandocarro();
		carro.verificandocarro();

	}

}
