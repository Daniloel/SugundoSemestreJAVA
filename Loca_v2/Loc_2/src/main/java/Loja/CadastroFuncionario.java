package Loja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DaoFuncionario;
import Loja.Funcionario;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		JButton btnCadastraFuncionario = new JButton("Cadastra");
		btnCadastraFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 final Funcionario c1 = new Funcionario();

				// lista para armazenar várias Carro
				ArrayList cadastroFunc = new ArrayList<CadastroFuncionario>();


				if ((!textnome_Funcionario.getText().equals("")) && (!textCidadeFuncionario.getText().equals(""))
						&& (!textsetor_Fucionario.getText().equals(""))) {

					// Seta as informações para o daoCarro que será salva no banco
					c1.Setnome_F(textnome_Funcionario.getText());
					c1.Setcidade_f(textCidadeFuncionario.getText());
					c1.Setsetor_f(textsetor_Fucionario.getText());
					

					EventQueue.invokeLater(new Runnable() {
						public void run() {

							try {
								// Aqui estou inputando os dados do carro que vai para o banco

								DaoFuncionario daoCriaFuncionario = new DaoFuncionario();
								daoCriaFuncionario.criarC1(c1);

								
								/*
								 * frmEscopoInsert.setVisible(false);
								 */
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");
				}

			}
		});
				
		btnCadastraFuncionario.setBounds(277, 48, 89, 23);
		contentPane.add(btnCadastraFuncionario);
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		JButton btnlista = new JButton("Seleciona");
		btnlista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Funcionario c1 = new Funcionario();

				c1.Setnome_F(textnome_Funcionario.getText());

				DaoFuncionario daoExibirFuncionario = new DaoFuncionario();
				daoExibirFuncionario.buscarFuncionarios(c1);

				textnome_Funcionario.setText(c1.getnome_F());
				textCidadeFuncionario.setText(c1.getcidade_f());
				textsetor_Fucionario.setText(c1.getcidade_f());

			}

		});
		btnlista.setBounds(277, 100, 89, 23);
		contentPane.add(btnlista);
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario c1 = new Funcionario();

				c1.Setnome_F(textnome_Funcionario.getText());

				DaoFuncionario daoExibirFuncionario = new DaoFuncionario();
				daoExibirFuncionario.buscarFuncionarios(c1);

				// CRIAR OS GET PARA MANDAR PRO BANCO OS CAMPOS
				c1.Setnome_F(textnome_Funcionario.getText());
				c1.Setcidade_f(textCidadeFuncionario.getText());
				c1.Setsetor_f(textsetor_Fucionario.getText());

				DaoFuncionario daoAlteraFncionario = new DaoFuncionario();
				daoAlteraFncionario.atualizarCl(c1);
				;

				// Reset de todas as variaveis na tela ou seja zera os dados da minha tela
				textnome_Funcionario.setText(" ");
				textCidadeFuncionario.setText("");
				textsetor_Fucionario.setText(" ");

				JOptionPane.showMessageDialog(null, "Alterado com Sucesso");

			}
		});
		btnAlterar.setBounds(277, 145, 89, 23);
		contentPane.add(btnAlterar);
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Delete dados do banco
				// Declaro objeto c1 para levar a os dados do cliente para Do.Carro através do c1.
				Funcionario c1 = new Funcionario();

				// Set a variavel que vai ser condição para eu chamar a tabela sem isso não
				// consigo fazer o visualizar e alterar
				c1.Setnome_F(textnome_Funcionario.getText());

				DaoFuncionario daoExibirFuncionario = new DaoFuncionario();
				daoExibirFuncionario.buscarFuncionarios(c1);

				//Recebe as infrmaçoes do banco. A Dao.Carro que mandaparaeste objeto.
				DaoFuncionario daoDeleteFncionario = new DaoFuncionario();
				daoDeleteFncionario.deletarCl(c1);

				// Reset de todas as variaveis na tela ou seja zera os dados da minha tela
				textnome_Funcionario.setText(" ");
				textCidadeFuncionario.setText("");
				textsetor_Fucionario.setText(" ");


				JOptionPane.showMessageDialog(null, "Deletado com Sucesso");

			}
		});
		btnDeletar.setBounds(277, 193, 89, 23);
		contentPane.add(btnDeletar);
	}

}
