package Loja;

public class recepção {
	
	// Atribuir qualidade a classe que no caso será a recepção
	private int recepcionista;
	private boolean agua;
	private boolean café;
	private boolean sofá;
	private int balcao;
	private int senha = 300;
	
	
	//Método construtor executo apenas o que foi listado
	
	public recepção (int recepcionista,	boolean agua,boolean café,boolean sofá,	int balcao,int senha) 
	{
		this.recepcionista = recepcionista;
		this.agua=agua;
		this.café=café;
		this.sofá=sofá;
		this.balcao=balcao;
		this.senha=senha;
	}
	
	//métodos de acesso aos atributos
			public int get_senha()
			{
				return senha;
			}
			public void  set_senha(int novasenha)
			{
				senha=novasenha;
			}
	
	
	// Criar métodos de acesso da classe
	public void chamar() 
	{
		System.out.println("Chamando para o atendimento");
		
	}
	
	public boolean tomarcafé () 
	{
		System.out.println("Vai beber café que é de graça");
		return true;
		
	} 
	
	public void contar_recepcionista (int recepcionista) {
		System.out.println("Tem "+recepcionista+ " a sua disposição");
		System.out.println("Tem "+recepcionista+ " a sua inteira diposição");
		
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		recepção atendente = new recepção (3,true,true,true,3,3);
		
		atendente.recepcionista=1;
		atendente.chamar();
		atendente.contar_recepcionista(1);
		
		recepção cafezinho= new recepção(3,true,true,true,3,3);
		cafezinho.tomarcafé();
		
	}

}
