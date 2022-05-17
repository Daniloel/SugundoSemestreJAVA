package Loja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textnome_Funcionario;
	private JTextField textCidadeFuncionario;
	private JTextField textsetor_Fucionario;
	// private ArrayList listaFuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastro Funcionario");
		lblNewLabel.setBounds(10, 11, 160, 14);
		contentPane.add(lblNewLabel);

		textnome_Funcionario = new JTextField();
		textnome_Funcionario.setBounds(10, 49, 86, 20);
		contentPane.add(textnome_Funcionario);
		textnome_Funcionario.setColumns(10);

		textCidadeFuncionario = new JTextField();
		textCidadeFuncionario.setBounds(10, 101, 86, 20);
		contentPane.add(textCidadeFuncionario);
		textCidadeFuncionario.setColumns(10);

		textsetor_Fucionario = new JTextField();
		textsetor_Fucionario.setBounds(10, 163, 86, 20);
		contentPane.add(textsetor_Fucionario);
		textsetor_Fucionario.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(145, 52, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Cidade");
		lblNewLabel_2.setBounds(145, 104, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Setor");
		lblNewLabel_3.setBounds(145, 166, 46, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnCadastraFuncionario = new JButton("Cadastra");
		btnCadastraFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ArrayList<CadastroFuncionario> cadastroFunc = new ArrayList<CadastroFuncionario>();

				if ((!textnome_Funcionario.getText().equals("")) && (!textCidadeFuncionario.getText().equals(""))
						&& (!textsetor_Fucionario.getText().equals(""))) {

					Funcionario func = new Funcionario(textnome_Funcionario.getText(), textCidadeFuncionario.getText(),
							textsetor_Fucionario.getText());

				//	 cadastroFunc.add(func);

				//	 for (int i = 0; i < cadastroFunc.size(); i++) {
				//	 func = (Funcionario) cadastroFunc.get(i);
				//	 System.out.println(func.getnome_fucionario() + "\r\n" +
				//	 func.getcidade_Funcionario() + "\r\n"
				//	 + func.getsetor_Funconario());
				//	 }
					System.out.println(func.nome_Funcionario);
					System.out.println(func.cidade_Funcionario);
					System.out.println(func.setor_Funcionario);

				
				}
			}
		});
		btnCadastraFuncionario.setBounds(277, 48, 89, 23);
		contentPane.add(btnCadastraFuncionario);

		JButton btnlista = new JButton("Seleciona");
		btnlista.setBounds(277, 100, 89, 23);
		contentPane.add(btnlista);
	}

}
