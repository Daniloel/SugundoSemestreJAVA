package AlugaCarro;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;


public class TesteCarro {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner cons=new Scanner(System.in);
		ArrayList<Carro> loja=new ArrayList<Carro>();
		Carro Car;
				
		for (int i=0;i<3;i++)
		{
			Car=new Carro ("VW","Golf");
			System.out.println("Digite a cor deste carro "+i );
			Car.setCor(JOptionPane.showInputDialog("Cor do Carro"));
			Car.setPlaca(JOptionPane.showInputDialog("A placa do carro"));
			Car.setAno(cons.nextInt());
			loja.add(Car);
		
		}
				
		System.out.println("tamanho "+loja.size());		
		for (int i=0;i<loja.size();i++) 
		{
			Car=(Carro)loja.get(i);
			System.out.println("Cor do carro é  " + Car.getCor()); 
				
		}
		
	    
   }
}

