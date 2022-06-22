package Loja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.DaoCarro;
import DAO.DaoCliente;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Cadastra_Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeCliente;
	private JTextField textCidade;
	private JTextField textCPF;
	private JTextField textIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastra_Cliente frame = new Cadastra_Cliente();
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
	public Cadastra_Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textNomeCliente = new JTextField();
		textNomeCliente.setBounds(10, 43, 86, 20);
		contentPane.add(textNomeCliente);
		textNomeCliente.setColumns(10);

		JLabel lblCadastraCliente = new JLabel("Cadastra de Cliente");
		lblCadastraCliente.setBounds(10, 11, 139, 20);
		contentPane.add(lblCadastraCliente);

		textCidade = new JTextField();
		textCidade.setBounds(10, 96, 86, 20);
		contentPane.add(textCidade);
		textCidade.setColumns(10);

		textCPF = new JTextField();
		textCPF.setBounds(10, 149, 86, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);

		textIdade = new JTextField();
		textIdade.setBounds(10, 198, 86, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
//**********************************************************************************************************
		JButton btncadastraCliente = new JButton("CadastraCliente");
		btncadastraCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				final Cliente c1 = new Cliente();

				ArrayList cadastroCliente = new ArrayList<Cliente>();

				if ((!textNomeCliente.getText().equals("")) && (!textCidade.getText().equals(""))
						&& (!textCPF.getText().equals("")) && (!textIdade.getText().equals(""))) {
					
					
					// Seta as informações para o daoCarro que será salva no banco
					c1.setcpf_C(Integer.parseInt(textCPF.getText()));
					c1.setidade_C(Float.parseFloat(textIdade.getText()));
					c1.setnome_c(textNomeCliente.getText());
					c1.setcidade_c(textCidade.getText());

					EventQueue.invokeLater(new Runnable() {
						public void run() {

							try {
								// Aqui estou inputando os dados do carro que vai para o banco

								DaoCliente daoCriaCliente = new DaoCliente();
								daoCriaCliente.criarC1(c1);

								// e para nﾃｧﾂｸﾅ� ficar com duas telas abertas, ordenamos a atual a ficar
								// invisivel
								
								// Reset de todas as variaveis na tela ou seja zera os dados da minha tela
								textCPF.setText("");
								textNomeCliente.setText("");
								textCidade.setText("");
								textIdade.setText("");

								JOptionPane.showMessageDialog(null, "Criado com Sucesso");
								 
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
					
		btncadastraCliente.setBounds(254, 42, 158, 23);
		contentPane.add(btncadastraCliente);
		
//**********************************************************************************************************
		JButton btnPesquisaCliente = new JButton("Pesquisa");
		btnPesquisaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Cliente c1 = new Cliente();

				c1.setcpf_C(Integer.parseInt(textCPF.getText()));
				
				DaoCliente daoExibirCliente = new DaoCliente();
				daoExibirCliente.buscarCliente(c1);

				//Integer.parseInt(campo.getText().toString())
				//textCPF.setText(Integer.parseInt(c1.getcpf_C()));
				textNomeCliente.setText(c1.getnome_c());
				textCidade.setText(c1.getcidade_c());
				//textIdade.setText(c1.getidade_C());
			}
		});
		btnPesquisaCliente.setBounds(254, 95, 158, 23);
		contentPane.add(btnPesquisaCliente);
		
//**********************************************************************************************************		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Cliente c1 = new Cliente();

				c1.setcpf_C(Integer.parseInt(textCPF.getText()));

				DaoCliente daoExibirCliente = new DaoCliente();
				daoExibirCliente.buscarCliente(c1);

				// CRIAR OS GET PARA MANDAR PRO BANCO OS CAMPOS
				c1.setcpf_C(Integer.parseInt(textCPF.getText()));
				c1.setidade_C(Float.parseFloat(textIdade.getText()));
				c1.setnome_c(textNomeCliente.getText());
				c1.setcidade_c(textCidade.getText());
				
				
				DaoCliente daoAlteraCliente = new DaoCliente();
				daoAlteraCliente.atualizarCl(c1);
				;

				// Reset de todas as variaveis na tela ou seja zera os dados da minha tela
				textCPF.setText("");
				textIdade.setText("");
				textNomeCliente.setText("");
				textCidade.setText("");

				JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
			}
		});
		btnAtualizar.setBounds(254, 148, 158, 23);
		contentPane.add(btnAtualizar);
		
//**********************************************************************************************************
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Delete dados do banco
				// Declaro objeto c1 para levar a os dados do cliente para Do.Carro através do c1.
				Cliente c1 = new Cliente();

				// Set a variavel que vai ser condição para eu chamar a tabela sem isso não
				// consigo fazer o visualizar e alterar
				c1.setcpf_C(Integer.parseInt(textCPF.getText()));
				
				
				
				DaoCliente daoExibirCliente = new DaoCliente();
				daoExibirCliente.buscarCliente(c1);

				//Recebe as infrmaçoes do banco. A Dao.Carro que mandaparaeste objeto.
				DaoCliente daoDeleteCliente = new DaoCliente();
				daoDeleteCliente.deletarCl(c1);

				// Reset de todas as variaveis na tela ou seja zera os dados da minha tela
				textCPF.setText("");
				textIdade.setText("");
				textNomeCliente.setText("");
				textCidade.setText("");

				JOptionPane.showMessageDialog(null, "Deletado com Sucesso");
				
			}
		});
		btnDeletar.setBounds(254, 197, 158, 23);
		contentPane.add(btnDeletar);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setText("Nome");
		txtpnNome.setBounds(127, 43, 51, 20);
		contentPane.add(txtpnNome);
		
		JTextPane txtpnCidade = new JTextPane();
		txtpnCidade.setText("Cidade");
		txtpnCidade.setBounds(127, 96, 51, 20);
		contentPane.add(txtpnCidade);
		
		JTextPane txtpnCpf = new JTextPane();
		txtpnCpf.setText("CPF");
		txtpnCpf.setBounds(127, 149, 51, 20);
		contentPane.add(txtpnCpf);
		
		JTextPane txtpnIdade = new JTextPane();
		txtpnIdade.setText("Idade");
		txtpnIdade.setBounds(127, 198, 51, 20);
		contentPane.add(txtpnIdade);
//**********************************************************************************************************		
	}
}
