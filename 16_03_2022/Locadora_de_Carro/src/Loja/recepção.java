package Loja;

public class recep��o {
	
	// Atribuir qualidade a classe que no caso ser� a recep��o
	private int recepcionista;
	private boolean agua;
	private boolean caf�;
	private boolean sof�;
	private int balcao;
	private int senha = 300;
	
	
	//M�todo construtor executo apenas o que foi listado
	
	public recep��o (int recepcionista,	boolean agua,boolean caf�,boolean sof�,	int balcao,int senha) 
	{
		this.recepcionista = recepcionista;
		this.agua=agua;
		this.caf�=caf�;
		this.sof�=sof�;
		this.balcao=balcao;
		this.senha=senha;
	}
	
	//m�todos de acesso aos atributos
			public int get_senha()
			{
				return senha;
			}
			public void  set_senha(int novasenha)
			{
				senha=novasenha;
			}
	
	
	// Criar m�todos de acesso da classe
	public void chamar() 
	{
		System.out.println("Chamando para o atendimento");
		
	}
	
	public boolean tomarcaf� () 
	{
		System.out.println("Vai beber caf� que � de gra�a");
		return true;
		
	} 
	
	public void contar_recepcionista (int recepcionista) {
		System.out.println("Tem "+recepcionista+ " a sua disposi��o");
		
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		recep��o atendente = new recep��o (3,true,true,true,3,3);
		
		atendente.recepcionista=1;
		atendente.chamar();
		atendente.contar_recepcionista(1);
		
		recep��o cafezinho= new recep��o(3,true,true,true,3,3);
		cafezinho.tomarcaf�();
		
	}

}
